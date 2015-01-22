package org.apache.commons.collections4;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Map;
import org.apache.commons.collections4.map.MultiValueMap;
import java.io.PrintStream;
import java.util.ResourceBundle;
import java.util.Set;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * Tests for MapUtils.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class MapUtilsTest extends BulkTest {
    public MapUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(MapUtilsTest.class);
    }

    public Predicate<java.lang.Object> getPredicate() {
        return new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
    }

    public void testPredicatedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedMap");
        final Predicate<java.lang.Object> p = getPredicate();
        Map<java.lang.Object, java.lang.Object> map = org.apache.commons.collections4.MapUtils.predicatedMap(new HashMap<java.lang.Object, java.lang.Object>(), p, p);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7925,(map instanceof org.apache.commons.collections4.map.PredicatedMap));
        try {
            org.apache.commons.collections4.MapUtils.predicatedMap(null, p, p);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLazyMapFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLazyMapFactory");
        final Factory<java.lang.Integer> factory = org.apache.commons.collections4.FactoryUtils.constantFactory(Integer.valueOf(4));
        Map<java.lang.Object, java.lang.Object> map = org.apache.commons.collections4.MapUtils.lazyMap(new HashMap<java.lang.Object, java.lang.Object>(), factory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7875,(map instanceof org.apache.commons.collections4.map.LazyMap));
        try {
            map = org.apache.commons.collections4.MapUtils.lazyMap(new HashMap<java.lang.Object, java.lang.Object>(), ((Factory<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map = org.apache.commons.collections4.MapUtils.lazyMap(((Map<java.lang.Object, java.lang.Object>)(null)), factory);
        } catch (final IllegalArgumentException e) {
        }
        final Transformer<java.lang.Object, java.lang.Integer> transformer = org.apache.commons.collections4.TransformerUtils.asTransformer(factory);
        map = org.apache.commons.collections4.MapUtils.lazyMap(new HashMap<java.lang.Object, java.lang.Object>(), transformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7876,(map instanceof org.apache.commons.collections4.map.LazyMap));
        try {
            map = org.apache.commons.collections4.MapUtils.lazyMap(new HashMap<java.lang.Object, java.lang.Object>(), ((Transformer<java.lang.Object, java.lang.Object>)(null)));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map = org.apache.commons.collections4.MapUtils.lazyMap(((Map<java.lang.Object, java.lang.Object>)(null)), transformer);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLazyMapTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLazyMapTransformer");
        final Map<java.lang.Object, java.lang.Object> map = org.apache.commons.collections4.MapUtils.lazyMap(new HashMap<java.lang.Object, java.lang.Object>(), new Transformer<java.lang.Object, java.lang.Object>() {
            public Object transform(final Object mapKey) {
                if (mapKey instanceof String) {
                    return Integer.valueOf(((String)(mapKey)));
                } 
                return null;
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7878,map,7877,map.size());
        final Integer i1 = ((Integer)(map.get("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7880,null,7879,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7881,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,map,568,map.size());
        final Integer i2 = ((Integer)(map.get(new String(new char[]{ '5' }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7883,null,7882,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7884,i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7886,map,7885,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7887,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7888,i2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(6 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2746() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2746");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 0);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2747() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2747");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("foo", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2748() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2748");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "foo");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2749() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2749");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("foo", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2750() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2750");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "foo");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2751() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2751");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("foo", "C");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2752() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2752");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "foo");
        in.put("4", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2753() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2753");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("foo", "D");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2754() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2754");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "foo");
        in.put("5", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2755() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2755");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("foo", "E");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvertMap_literalMutation2756() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvertMap_literalMutation2756");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "foo");
        final Set<java.lang.String> inKeySet = new HashSet<java.lang.String>(in.keySet());
        final Set<java.lang.String> inValSet = new HashSet<java.lang.String>(in.values());
        final Map<java.lang.String, java.lang.String> out = org.apache.commons.collections4.MapUtils.invertMap(in);
        final Set<java.lang.String> outKeySet = new HashSet<java.lang.String>(out.keySet());
        final Set<java.lang.String> outValSet = new HashSet<java.lang.String>(out.values());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7836,inKeySet,7835,inKeySet.equals(outValSet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7838,inValSet,7837,inValSet.equals(outKeySet));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7840,out,7839,out.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7842,out,7841,out.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7844,out,7843,out.get("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7846,out,7845,out.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7848,out,7847,out.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[-1]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2811");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2812");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "foo" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2813");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "foo" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2814");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "foo" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2815");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "foo" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2816");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "foo" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2817");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "foo" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2818");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "foo" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2819");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "foo" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2821");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "foo" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2822");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "foo" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2823");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "foo" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2824");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "foo" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2825");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "foo" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2826");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "foo" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2827");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "foo" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2828");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "foo" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2829");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "foo" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2830");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "foo" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2831");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "foo" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2832");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "foo" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2833");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "foo" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2834");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "foo" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2835");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "foo" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2836");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "foo" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2837");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2838");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "foo" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2839");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "foo" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2840");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "foo" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2841");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "foo" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2842");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "foo" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2843");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "foo" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2844");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2845");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("foo" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2846");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "foo") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2847");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("foo" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2848");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "foo") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2849");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("foo" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2850");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "foo") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2851");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("foo" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2852");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "foo") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2853");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("foo" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2854");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "foo") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2855");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("foo" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_Map_array_literalMutation2856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map_array_literalMutation2856");
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, null);
        } catch (final NullPointerException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(null, new Object[0]);
        } catch (final NullPointerException ex) {
        }
        Map<java.lang.String, java.lang.String> test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7927,test,7926,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" , "#00FF00" } , new String[]{ "BLUE" , "#0000FF" } });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7929,test,7928,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7931,test,7930,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7933,test,7932,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7935,test,7934,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7937,test,7936,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7939,test,7938,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7941,test,7940,test.size());
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , null , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{ "GREEN" } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[][]{ new String[]{ "RED" , "#FF0000" } , new String[]{  } , new String[]{ "BLUE" , "#0000FF" } });
        } catch (final IllegalArgumentException ex) {
        }
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7943,test,7942,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7945,test,7944,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7947,test,7946,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7949,test,7948,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7951,test,7950,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7953,test,7952,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7955,test,7954,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new String[]{ "RED" , "#FF0000" , "GREEN" , "#00FF00" , "BLUE" , "#0000FF" , "PURPLE" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7957,test,7956,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7959,test,7958,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7961,test,7960,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7963,test,7962,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7965,test,7964,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7967,test,7966,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7969,test,7968,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultMapEntry<java.lang.String, java.lang.String>("BLUE" , "#0000FF") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7971,test,7970,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7973,test,7972,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7975,test,7974,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7977,test,7976,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7979,test,7978,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7981,test,7980,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7983,test,7982,test.size());
        test = org.apache.commons.collections4.MapUtils.putAll(new HashMap<java.lang.String, java.lang.String>(), new Object[]{ new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("RED" , "#FF0000") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("GREEN" , "#00FF00") , new org.apache.commons.collections4.keyvalue.DefaultKeyValue<java.lang.String, java.lang.String>("BLUE" , "foo") });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7985,test,7984,test.containsKey("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7987,test,7986,test.get("RED"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7989,test,7988,test.containsKey("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7991,test,7990,test.get("GREEN"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7993,test,7992,test.containsKey("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7995,test,7994,test.get("BLUE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7997,test,7996,test.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(6 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2621");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 0);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2622() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2622");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("foo", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2623() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2623");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "foo");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2624() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2624");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("foo", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2625() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2625");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "foo");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2626() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2626");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("foo", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2627() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2627");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "foo");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2628() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2628");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("foo", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2629() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2629");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "foo");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2630() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2630");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("foo", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2631() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2631");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "foo");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2632() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2632");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][1];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2633");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 1;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2634() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2634");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][-1] = key;
                    contents[n][1] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConvertResourceBundle_literalMutation2635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConvertResourceBundle_literalMutation2635");
        final Map<java.lang.String, java.lang.String> in = new HashMap<java.lang.String, java.lang.String>(5 , 1);
        in.put("1", "A");
        in.put("2", "B");
        in.put("3", "C");
        in.put("4", "D");
        in.put("5", "E");
        final ResourceBundle b = new ListResourceBundle() {
            @Override
            public Object[][] getContents() {
                final Object[][] contents = new Object[in.size()][2];
                final Iterator<java.lang.String> i = in.keySet().iterator();
                int n = 0;
                while (i.hasNext()) {
                    final Object key = i.next();
                    final Object val = in.get(key);
                    contents[n][0] = key;
                    contents[n][0] = val;
                    ++n;
                }
                return contents;
            }
        };
        final Map<java.lang.String, java.lang.Object> out = org.apache.commons.collections4.MapUtils.toMap(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7802,in,7801,in.equals(out));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(3 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2637");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 0);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2638");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(3, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2639");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "foo");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2640");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(4, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2641");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "foo");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2642");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(1 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2643");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 0);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2644");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(1, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2645");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(0, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2646");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "foo");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintCasting_literalMutation2647() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintCasting_literalMutation2647");
        final Map<java.lang.Integer, java.lang.String> inner = new HashMap<java.lang.Integer, java.lang.String>(2 , 1);
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new HashMap<java.lang.Integer, java.lang.Object>(2 , 1);
        outer.put(0, inner);
        outer.put(1, "A");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "foo", outer);
        } catch (final ClassCastException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintNullMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintNullMap");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "foo";
        outPrint.println(((LABEL + " = ") + (String.valueOf(((Object)(null))))));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, LABEL, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7803,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7805,out,7804,out.toString());
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, LABEL, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7806,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7808,out,7807,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugAndVerbosePrintNullMap_literalMutation2649() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugAndVerbosePrintNullMap_literalMutation2649");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        outPrint.println(((LABEL + "foo") + (String.valueOf(((Object)(null))))));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, LABEL, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7803,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7805,out,7804,out.toString());
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, LABEL, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7806,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7808,out,7807,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2903");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(1, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2904");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "foo");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2905");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(2, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2906");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "foo");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2907");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(3, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2909");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("foo");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2910");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2911");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2912");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "foo"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabel_literalMutation2913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabel_literalMutation2913");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println((INDENT + "2 = B"));
        outPrint.println((INDENT + "3 = C"));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8010,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8012,out,8011,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2698");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2699");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(1, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2700");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "foo");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2701");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(2, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2702");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "foo");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2703");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(5, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2705");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("foo");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2706() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2706");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "foo") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2707");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "foo") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2708");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "foo"));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabel_literalMutation2709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabel_literalMutation2709");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.String> map = new TreeMap<java.lang.Integer, java.lang.String>();
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, null);
        outPrint.println("{");
        outPrint.println(((INDENT + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "3 = C ") + (String.class.getName())));
        outPrint.println((INDENT + "4 = null"));
        outPrint.println(("foo" + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7818,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7820,out,7819,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullLabelAndMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullLabelAndMap");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8007,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8009,out,8008,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabelAndMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabelAndMap");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        outPrint.println("null");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7821,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7823,out,7822,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullLabelAndMap_literalMutation2711() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullLabelAndMap_literalMutation2711");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7821,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7823,out,7822,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullStream");
        try {
            org.apache.commons.collections4.MapUtils.verbosePrint(null, "foo", new HashMap<java.lang.Object, java.lang.Object>());
        } catch (final NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullStream() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullStream");
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(null, "Map", new HashMap<java.lang.Object, java.lang.Object>());
        } catch (final NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullStream_literalMutation2715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullStream_literalMutation2715");
        try {
            org.apache.commons.collections4.MapUtils.debugPrint(null, "foo", new HashMap<java.lang.Object, java.lang.Object>());
        } catch (final NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKey");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println(((INDENT + "null = A ") + (String.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7809,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7811,out,7810,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKey_literalMutation2674() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKey_literalMutation2674");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println(((INDENT + "null = A ") + (String.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7809,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7811,out,7810,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKey_literalMutation2676() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKey_literalMutation2676");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "foo");
        outPrint.println("{");
        outPrint.println(((INDENT + "null = A ") + (String.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7809,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7811,out,7810,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKey_literalMutation2677() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKey_literalMutation2677");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("foo");
        outPrint.println(((INDENT + "null = A ") + (String.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7809,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7811,out,7810,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKey_literalMutation2678() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKey_literalMutation2678");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println(((INDENT + "foo") + (String.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7809,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7811,out,7810,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKey_literalMutation2679() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKey_literalMutation2679");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println(((INDENT + "null = A ") + (String.class.getName())));
        outPrint.println(("foo" + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7809,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7811,out,7810,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKey");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println((INDENT + "null = A"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8004,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8006,out,8005,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKey_literalMutation2880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKey_literalMutation2880");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "foo");
        outPrint.println("{");
        outPrint.println((INDENT + "null = A"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8004,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8006,out,8005,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKey_literalMutation2881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKey_literalMutation2881");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("foo");
        outPrint.println((INDENT + "null = A"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8004,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8006,out,8005,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKey_literalMutation2882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKey_literalMutation2882");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8004,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8006,out,8005,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKey_literalMutation2883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKey_literalMutation2883");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put(null, "A");
        outPrint.println("{");
        outPrint.println((INDENT + "null = A"));
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8004,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8006,out,8005,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap1");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println(((INDENT + "null = (this Map) ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7812,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7814,out,7813,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap1_literalMutation2681() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap1_literalMutation2681");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println(((INDENT + "null = (this Map) ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7812,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7814,out,7813,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap1_literalMutation2683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap1_literalMutation2683");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("foo");
        outPrint.println(((INDENT + "null = (this Map) ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7812,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7814,out,7813,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap1_literalMutation2684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap1_literalMutation2684");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println(((INDENT + "foo") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7812,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7814,out,7813,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap1_literalMutation2685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap1_literalMutation2685");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println(((INDENT + "null = (this Map) ") + (HashMap.class.getName())));
        outPrint.println(("foo" + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7812,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7814,out,7813,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap1");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println((INDENT + "null = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7998,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8000,out,7999,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap1_literalMutation2887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap1_literalMutation2887");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("foo");
        outPrint.println((INDENT + "null = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7998,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8000,out,7999,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap1_literalMutation2888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap1_literalMutation2888");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7998,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8000,out,7999,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap1_literalMutation2889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap1_literalMutation2889");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.util.Map<?, ?>> map = new HashMap<java.lang.Object, java.util.Map<?, ?>>();
        map.put(null, map);
        outPrint.println("{");
        outPrint.println((INDENT + "null = (this Map)"));
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7998,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8000,out,7999,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2687");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2689");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("foo", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2690");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "foo");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2691");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("foo");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2692");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2693");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "foo"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2694");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "foo") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2695");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "foo") + (HashMap.class.getName())));
        outPrint.println(("} " + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintNullKeyToMap2_literalMutation2696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintNullKeyToMap2_literalMutation2696");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (HashMap.class.getName())));
        outPrint.println(("foo" + (HashMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7815,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7817,out,7816,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "foo";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2893");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("foo", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2894");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "foo");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2895");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("foo");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2896");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2897");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "foo"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2898");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2899");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "foo"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintNullKeyToMap2_literalMutation2900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintNullKeyToMap2_literalMutation2900");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String INDENT = "    ";
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        final Map<java.lang.Object, java.lang.Object> map2 = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(null, map2);
        map2.put("2", "B");
        outPrint.println("{");
        outPrint.println((INDENT + "null = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println((INDENT + "}"));
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, null, map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8001,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8003,out,8002,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "foo";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2858");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "foo";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2859");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + "foo"));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2860");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("foo");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2861");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2862");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2863");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "foo"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2864");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2865");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2866");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2867");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "foo"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2868");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2869");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(1, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2870");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "foo");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2871");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(4, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2872");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "foo");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2873");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(2, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2874");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(1, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2875");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "foo");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2876");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(6, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrint_literalMutation2877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrint_literalMutation2877");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = C"));
        outPrint.println((INDENT + "}"));
        outPrint.println((INDENT + "7 = (this Map)"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "foo", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8016,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8018,out,8017,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "foo";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2654() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2654");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "foo";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2655() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2655");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + "foo"));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2656() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2656");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("foo");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2657() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2657");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "foo") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2658() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2658");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2659");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "foo"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2660() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2660");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "foo") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2661() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2661");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "foo") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2662() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2662");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "foo") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2663");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "foo") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2664");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("foo" + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2665");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(3, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2666");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "foo");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2667");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(2, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2668() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2668");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "foo");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2669() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2669");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(0, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2670() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2670");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(-1, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2671() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2671");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "foo");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2672() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2672");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(6, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrint_literalMutation2673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrint_literalMutation2673");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = C ") + (String.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "7 = (this Map) ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        final Map<java.lang.Integer, java.lang.String> inner = new TreeMap<java.lang.Integer, java.lang.String>();
        inner.put(2, "B");
        inner.put(3, "C");
        final Map<java.lang.Integer, java.lang.Object> outer = new TreeMap<java.lang.Integer, java.lang.Object>();
        outer.put(1, inner);
        outer.put(0, "A");
        outer.put(7, outer);
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "foo", outer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7827,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7829,out,7828,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "foo";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2921");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "foo";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2922");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(-1, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2923");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "foo");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2924");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(2, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2925");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(3, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2926");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "foo");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2927");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(4, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2928");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(3, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2929");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(6, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2930");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "foo");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2931");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(7, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2932");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(6, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2933");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + "foo"));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2934");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("foo");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2935");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2936");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2937");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "foo"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2938");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2939");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2940");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2941");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2942");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "foo"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2943");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "foo"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2944");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "foo"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2945");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2946");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "foo"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2947");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("foo");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVerbosePrintSelfReference_literalMutation2948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVerbosePrintSelfReference_literalMutation2948");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println((INDENT + "0 = A"));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println(((INDENT + INDENT) + "2 = B"));
        outPrint.println(((INDENT + INDENT) + "3 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "5 = C"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map)"));
        outPrint.println((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map)"));
        outPrint.println(((INDENT + INDENT) + "}"));
        outPrint.println((INDENT + "}"));
        outPrint.println("}");
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.verbosePrint(outPrint, "foo", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8013,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8015,out,8014,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2716() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2716");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "foo";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2717");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "foo";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2718");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(1, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2719");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "foo");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2720");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(2, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2721");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(3, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2722");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "foo");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2723");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(4, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2724");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(5, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2725");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(6, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2726");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "foo");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2727");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(5, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2728");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(8, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2729");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + "foo"));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2730");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("foo");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2731");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "foo") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2732");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "foo"));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2733");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "foo"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2734");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "foo") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2735");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "foo") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2736() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2736");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2737");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "foo"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2738");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "foo") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2739() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2739");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "foo") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2740() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2740");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "foo") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2741() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2741");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "foo") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2742() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2742");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "foo") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2743() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2743");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("foo" + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "Print Map", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDebugPrintSelfReference_literalMutation2744() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDebugPrintSelfReference_literalMutation2744");
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream outPrint = new PrintStream(out);
        final String LABEL = "Print Map";
        final String INDENT = "    ";
        final Map<java.lang.Integer, java.lang.Object> grandfather = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> father = new TreeMap<java.lang.Integer, java.lang.Object>();
        final Map<java.lang.Integer, java.lang.Object> son = new TreeMap<java.lang.Integer, java.lang.Object>();
        grandfather.put(0, "A");
        grandfather.put(1, father);
        father.put(2, "B");
        father.put(3, grandfather);
        father.put(4, son);
        son.put(5, "C");
        son.put(6, grandfather);
        son.put(7, father);
        outPrint.println((LABEL + " = "));
        outPrint.println("{");
        outPrint.println(((INDENT + "0 = A ") + (String.class.getName())));
        outPrint.println((INDENT + "1 = "));
        outPrint.println((INDENT + "{"));
        outPrint.println((((INDENT + INDENT) + "2 = B ") + (String.class.getName())));
        outPrint.println((((INDENT + INDENT) + "3 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + INDENT) + "4 = "));
        outPrint.println(((INDENT + INDENT) + "{"));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "5 = C ") + (String.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "6 = (ancestor[1] Map) ") + (TreeMap.class.getName())));
        outPrint.println(((((INDENT + INDENT) + INDENT) + "7 = (ancestor[0] Map) ") + (TreeMap.class.getName())));
        outPrint.println((((INDENT + INDENT) + "} ") + (TreeMap.class.getName())));
        outPrint.println(((INDENT + "} ") + (TreeMap.class.getName())));
        outPrint.println(("} " + (TreeMap.class.getName())));
        final String EXPECTED_OUT = out.toString();
        out.reset();
        org.apache.commons.collections4.MapUtils.debugPrint(outPrint, "foo", grandfather);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7824,EXPECTED_OUT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7826,out,7825,out.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7831,org.apache.commons.collections4.MapUtils.emptyIfNull(null),7830,org.apache.commons.collections4.MapUtils.emptyIfNull(null).isEmpty());
        final Map<java.lang.Long, java.lang.Long> map = new HashMap<java.lang.Long, java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7832,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7834,null,7833,org.apache.commons.collections4.MapUtils.emptyIfNull(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmptyWithEmptyMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithEmptyMap");
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7850,null,7849,org.apache.commons.collections4.MapUtils.isEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmptyWithNonEmptyMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithNonEmptyMap");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "value");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7852,null,7851,org.apache.commons.collections4.MapUtils.isEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmptyWithNonEmptyMap_literalMutation2758() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithNonEmptyMap_literalMutation2758");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("item", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7852,null,7851,org.apache.commons.collections4.MapUtils.isEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmptyWithNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithNull");
        final Map<java.lang.Object, java.lang.Object> map = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7854,null,7853,org.apache.commons.collections4.MapUtils.isEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsNotEmptyWithEmptyMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithEmptyMap");
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7856,null,7855,org.apache.commons.collections4.MapUtils.isNotEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsNotEmptyWithNonEmptyMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithNonEmptyMap");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "value");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7858,null,7857,org.apache.commons.collections4.MapUtils.isNotEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsNotEmptyWithNonEmptyMap_literalMutation2761() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithNonEmptyMap_literalMutation2761");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("item", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7858,null,7857,org.apache.commons.collections4.MapUtils.isNotEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsNotEmptyWithNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithNull");
        final Map<java.lang.Object, java.lang.Object> map = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7860,null,7859,org.apache.commons.collections4.MapUtils.isNotEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2787");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("foo");
        list.add("5");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2788");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("foo");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2789() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2789");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("foo");
        list.add("2");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2790");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("foo");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2791");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("2");
        list.add("foo");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2792");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("foo");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2793");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = -1 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMap_literalMutation2794() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMap_literalMutation2794");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("2");
        list.add("4");
        list.add("6");
        Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7890,list,7889,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7892,map,7891,map.size());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7894,map,7893,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7896,map,7895,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7898,map,7897,map.containsValue(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7900,list,7899,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7902,map,7901,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        map = new HashMap<java.lang.Object, java.lang.Object>();
        org.apache.commons.collections4.MapUtils.populateMap(map, list, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7904,list,7903,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7906,map,7905,map.size());
        for (int i = -1 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7908,map,7907,map.containsKey(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7910,map,7909,map.containsKey(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7912,map,7911,map.containsValue(java.lang.Integer.valueOf(list.get(i))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7914,null,7913,java.lang.Integer.valueOf(list.get(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7916,map,7915,map.get(java.lang.Integer.valueOf(list.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test class for populateMap(MultiMap).
     */
public static class X implements Comparable<X> {
        int key;

        String name;

        public X(int key ,String name) {
            this.key = key;
            this.name = name;
        }

        public int compareTo(X o) {
            return ((key) - (o.key)) | (name.compareTo(o.name));
        }
    }

    public void testPopulateMultiMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap");
        final List<X> list = new ArrayList<X>();
        list.add(new X(0 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2796");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "foo"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2797");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(1 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2798");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "foo"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2799");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(1 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2800");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "foo"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2801");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(4 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2802");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "foo"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2803");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(4 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2804");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "foo"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPopulateMultiMap_literalMutation2805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPopulateMultiMap_literalMutation2805");
        final List<X> list = new ArrayList<X>();
        list.add(new X(1 , "x1"));
        list.add(new X(2 , "x2"));
        list.add(new X(2 , "x3"));
        list.add(new X(5 , "x4"));
        list.add(new X(5 , "x5"));
        final MultiValueMap<java.lang.Integer, X> map = MultiValueMap.multiValueMap(new TreeMap<java.lang.Integer, java.util.Collection<X>>());
        org.apache.commons.collections4.MapUtils.populateMap(map, list, new Transformer<X, java.lang.Integer>() {
            public Integer transform(X input) {
                return input.key;
            }
        }, org.apache.commons.collections4.TransformerUtils.<X>nopTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7918,list,7917,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7920,map,7919,map.totalSize());
        for (int i = 1 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7922,map,7921,map.containsKey(list.get(i).key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7924,map,7923,map.containsValue(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableMap");
        try {
            org.apache.commons.collections4.MapUtils.iterableMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final HashMap<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "barv");
        map.put("baz", "bazv");
        final IterableMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7861,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7862,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7863,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7864,iMap);
        final HashedMap<java.lang.String, java.lang.String> hMap = new HashedMap<java.lang.String, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7865,hMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7867,null,7866,org.apache.commons.collections4.MapUtils.iterableMap(hMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableMap_literalMutation2765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableMap_literalMutation2765");
        try {
            org.apache.commons.collections4.MapUtils.iterableMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final HashMap<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "foo");
        map.put("bar", "barv");
        map.put("baz", "bazv");
        final IterableMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7861,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7862,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7863,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7864,iMap);
        final HashedMap<java.lang.String, java.lang.String> hMap = new HashedMap<java.lang.String, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7865,hMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7867,null,7866,org.apache.commons.collections4.MapUtils.iterableMap(hMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableMap_literalMutation2766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableMap_literalMutation2766");
        try {
            org.apache.commons.collections4.MapUtils.iterableMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final HashMap<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("foo", "barv");
        map.put("baz", "bazv");
        final IterableMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7861,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7862,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7863,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7864,iMap);
        final HashedMap<java.lang.String, java.lang.String> hMap = new HashedMap<java.lang.String, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7865,hMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7867,null,7866,org.apache.commons.collections4.MapUtils.iterableMap(hMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableMap_literalMutation2767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableMap_literalMutation2767");
        try {
            org.apache.commons.collections4.MapUtils.iterableMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final HashMap<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "foo");
        map.put("baz", "bazv");
        final IterableMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7861,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7862,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7863,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7864,iMap);
        final HashedMap<java.lang.String, java.lang.String> hMap = new HashedMap<java.lang.String, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7865,hMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7867,null,7866,org.apache.commons.collections4.MapUtils.iterableMap(hMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableMap_literalMutation2768() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableMap_literalMutation2768");
        try {
            org.apache.commons.collections4.MapUtils.iterableMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final HashMap<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "barv");
        map.put("foo", "bazv");
        final IterableMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7861,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7862,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7863,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7864,iMap);
        final HashedMap<java.lang.String, java.lang.String> hMap = new HashedMap<java.lang.String, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7865,hMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7867,null,7866,org.apache.commons.collections4.MapUtils.iterableMap(hMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableMap_literalMutation2769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableMap_literalMutation2769");
        try {
            org.apache.commons.collections4.MapUtils.iterableMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final HashMap<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "barv");
        map.put("baz", "foo");
        final IterableMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7861,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7862,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7863,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7864,iMap);
        final HashedMap<java.lang.String, java.lang.String> hMap = new HashedMap<java.lang.String, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7865,hMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7867,null,7866,org.apache.commons.collections4.MapUtils.iterableMap(hMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableSortedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableSortedMap");
        try {
            org.apache.commons.collections4.MapUtils.iterableSortedMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final TreeMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "barv");
        map.put("baz", "bazv");
        final IterableSortedMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableSortedMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7868,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7869,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7870,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7871,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7872,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7874,null,7873,org.apache.commons.collections4.MapUtils.iterableMap(iMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableSortedMap_literalMutation2772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableSortedMap_literalMutation2772");
        try {
            org.apache.commons.collections4.MapUtils.iterableSortedMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final TreeMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "foo");
        map.put("bar", "barv");
        map.put("baz", "bazv");
        final IterableSortedMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableSortedMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7868,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7869,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7870,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7871,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7872,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7874,null,7873,org.apache.commons.collections4.MapUtils.iterableMap(iMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableSortedMap_literalMutation2773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableSortedMap_literalMutation2773");
        try {
            org.apache.commons.collections4.MapUtils.iterableSortedMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final TreeMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("foo", "barv");
        map.put("baz", "bazv");
        final IterableSortedMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableSortedMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7868,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7869,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7870,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7871,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7872,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7874,null,7873,org.apache.commons.collections4.MapUtils.iterableMap(iMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableSortedMap_literalMutation2774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableSortedMap_literalMutation2774");
        try {
            org.apache.commons.collections4.MapUtils.iterableSortedMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final TreeMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "foo");
        map.put("baz", "bazv");
        final IterableSortedMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableSortedMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7868,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7869,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7870,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7871,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7872,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7874,null,7873,org.apache.commons.collections4.MapUtils.iterableMap(iMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableSortedMap_literalMutation2775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableSortedMap_literalMutation2775");
        try {
            org.apache.commons.collections4.MapUtils.iterableSortedMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final TreeMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "barv");
        map.put("foo", "bazv");
        final IterableSortedMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableSortedMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7868,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7869,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7870,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7871,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7872,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7874,null,7873,org.apache.commons.collections4.MapUtils.iterableMap(iMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterableSortedMap_literalMutation2776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterableSortedMap_literalMutation2776");
        try {
            org.apache.commons.collections4.MapUtils.iterableSortedMap(null);
        } catch (final IllegalArgumentException e) {
        }
        final TreeMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "foov");
        map.put("bar", "barv");
        map.put("baz", "foo");
        final IterableSortedMap<java.lang.String, java.lang.String> iMap = org.apache.commons.collections4.MapUtils.iterableSortedMap(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7868,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7869,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7870,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7871,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7872,iMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7874,null,7873,org.apache.commons.collections4.MapUtils.iterableMap(iMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

