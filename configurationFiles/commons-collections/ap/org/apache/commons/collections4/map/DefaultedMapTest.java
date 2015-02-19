package org.apache.commons.collections4.map;

import org.apache.commons.collections4.Factory;
import java.util.HashMap;
import org.apache.commons.collections4.IterableMap;
import java.util.Map;
import org.junit.Test;

/** 
 * Extension of {@link AbstractMapTest} for exercising the
 * {@link DefaultedMap} implementation.
 * 
 * @version $Id$
 * @since 3.2
 */
public class DefaultedMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    protected final Factory<V> nullFactory = org.apache.commons.collections4.FactoryUtils.<V>nullFactory();

    public DefaultedMapTest(final String testName) {
        super(testName);
    }

    @Override
    public IterableMap<K, V> makeObject() {
        return DefaultedMap.defaultedMap(new HashMap<K, V>(), nullFactory);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void testMapGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet_add228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet_add228");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet_literalMutation140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet_literalMutation140");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet_literalMutation141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet_literalMutation141");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet_literalMutation142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet_literalMutation142");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        map.put(((K)("foo")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet_literalMutation143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet_literalMutation143");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet_remove187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet_remove187");
        final Map<K, V> map = new DefaultedMap<K, V>(((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),451,map,450,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),453,map,452,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),455,map,454,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),457,map,456,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),459,map,458,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),461,map,460,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),463,map,462,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),465,map,464,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet2_add229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet2_add229");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, ((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,map,466,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,base,468,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,map,470,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,map,472,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,base,476,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,map,478,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,map,480,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,map,482,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,map,484,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet2");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, ((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,map,466,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,base,468,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,map,470,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,map,472,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,base,476,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,map,478,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,map,480,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,map,482,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,map,484,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet2_literalMutation145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet2_literalMutation145");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,map,466,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,base,468,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,map,470,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,map,472,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,base,476,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,map,478,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,map,480,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,map,482,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,map,484,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet2_literalMutation146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet2_literalMutation146");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, ((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,map,466,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,base,468,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,map,470,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,map,472,map.get("NotInMap"));
        map.put(((K)("foo")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,base,476,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,map,478,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,map,480,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,map,482,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,map,484,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet2_literalMutation147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet2_literalMutation147");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, ((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,map,466,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,base,468,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,map,470,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,map,472,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,base,476,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,map,478,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,map,480,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,map,482,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,map,484,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet2_remove188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet2_remove188");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, ((V)("NULL")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),467,map,466,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),469,base,468,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),471,map,470,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),473,map,472,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),477,base,476,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),479,map,478,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),481,map,480,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),483,map,482,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),485,map,484,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet3_add230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet3_add230");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, org.apache.commons.collections4.functors.ConstantFactory.constantFactory(((V)("NULL"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,base,488,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,map,490,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,map,492,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,map,494,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,base,496,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,map,498,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,map,500,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,map,502,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,map,504,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet3");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, org.apache.commons.collections4.functors.ConstantFactory.constantFactory(((V)("NULL"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,base,488,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,map,490,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,map,492,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,map,494,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,base,496,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,map,498,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,map,500,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,map,502,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,map,504,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet3_literalMutation149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet3_literalMutation149");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, org.apache.commons.collections4.functors.ConstantFactory.constantFactory(((V)("foo"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,base,488,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,map,490,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,map,492,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,map,494,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,base,496,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,map,498,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,map,500,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,map,502,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,map,504,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet3_literalMutation150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet3_literalMutation150");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, org.apache.commons.collections4.functors.ConstantFactory.constantFactory(((V)("NULL"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,base,488,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,map,490,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,map,492,map.get("NotInMap"));
        map.put(((K)("foo")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,map,494,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,base,496,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,map,498,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,map,500,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,map,502,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,map,504,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet3_literalMutation151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet3_literalMutation151");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, org.apache.commons.collections4.functors.ConstantFactory.constantFactory(((V)("NULL"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,base,488,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,map,490,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,map,492,map.get("NotInMap"));
        map.put(((K)("Key")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,map,494,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,base,496,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,map,498,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,map,500,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,map,502,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,map,504,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet3_remove189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet3_remove189");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, org.apache.commons.collections4.functors.ConstantFactory.constantFactory(((V)("NULL"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),489,base,488,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),491,map,490,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),493,map,492,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),495,map,494,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),497,base,496,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),499,map,498,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),501,map,500,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),503,map,502,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),505,map,504,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet4_add231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_add231");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet4_add232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_add232");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("Value")));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet4_literalMutation154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_literalMutation154");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("foo"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet4_literalMutation155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_literalMutation155");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("foo"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet4_literalMutation156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_literalMutation156");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("foo")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapGet4_literalMutation157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_literalMutation157");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet4_remove190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_remove190");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        map.put(((K)("Key")), ((V)("Value")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testMapGet4_remove191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet4_remove191");
        final HashMap<K, V> base = new HashMap<K, V>();
        final Map<K, V> map = DefaultedMap.defaultedMap(base, new org.apache.commons.collections4.Transformer<K, V>() {
            public V transform(final K input) {
                if (input instanceof String) {
                    return ((V)("NULL"));
                } 
                return ((V)("NULL_OBJECT"));
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),509,base,508,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),511,map,510,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),513,map,512,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),515,map,514,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),517,map,516,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),519,base,518,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),521,map,520,map.containsKey("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),523,map,522,map.get("Key"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),525,map,524,map.containsKey("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),527,map,526,map.get("NotInMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),529,map,528,map.get(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

