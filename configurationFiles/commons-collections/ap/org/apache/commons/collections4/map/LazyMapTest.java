package org.apache.commons.collections4.map;

import org.apache.commons.collections4.Factory;
import java.util.Map;
import org.junit.Test;
import org.apache.commons.collections4.Transformer;

/** 
 * Extension of {@link AbstractMapTest} for exercising the
 * {@link LazyMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
@SuppressWarnings(value = "boxing")
public class LazyMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    private static final Factory<java.lang.Integer> oneFactory = org.apache.commons.collections4.FactoryUtils.constantFactory(1);

    public LazyMapTest(final String testName) {
        super(testName);
    }

    @Override
    public LazyMap<K, V> makeObject() {
        return LazyMap.lazyMap(new java.util.HashMap<K, V>(), org.apache.commons.collections4.FactoryUtils.<V>nullFactory());
    }

    @Override
    public void testMapGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void mapGetWithFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "mapGetWithFactory");
        Map<java.lang.Integer, java.lang.Number> map = LazyMap.lazyMap(new java.util.HashMap<java.lang.Integer, java.lang.Number>(), oneFactory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),809,map,808,map.size());
        final Number i1 = map.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),810,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),812,map,811,map.size());
        final Number i2 = map.get(new String(new char[]{ 'F' , 'i' , 'v' , 'e' }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),813,i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),815,map,814,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),816,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),817,i2);
        map = LazyMap.lazyMap(new java.util.HashMap<java.lang.Integer, java.lang.Number>(), org.apache.commons.collections4.FactoryUtils.<Long>nullFactory());
        final Object o = map.get("Five");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),818,o);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void mapGetWithFactory_literalMutation220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "mapGetWithFactory_literalMutation220");
        Map<java.lang.Integer, java.lang.Number> map = LazyMap.lazyMap(new java.util.HashMap<java.lang.Integer, java.lang.Number>(), oneFactory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),809,map,808,map.size());
        final Number i1 = map.get("Five");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),810,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),812,map,811,map.size());
        final Number i2 = map.get(new String(new char[]{ 'F' , 'i' , 'v' , 'e' }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),813,i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),815,map,814,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),816,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),817,i2);
        map = LazyMap.lazyMap(new java.util.HashMap<java.lang.Integer, java.lang.Number>(), org.apache.commons.collections4.FactoryUtils.<Long>nullFactory());
        final Object o = map.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),818,o);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void mapGetWithTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "mapGetWithTransformer");
        final Transformer<java.lang.Number, java.lang.Integer> intConverter = new Transformer<java.lang.Number, java.lang.Integer>() {
            public Integer transform(final Number input) {
                return input.intValue();
            }
        };
        final Map<java.lang.Long, java.lang.Number> map = LazyMap.lazyMap(new java.util.HashMap<java.lang.Long, java.lang.Number>(), intConverter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),822,map,821,map.size());
        final Number i1 = map.get(124L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),823,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),825,map,824,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

