package org.apache.commons.collections4.splitmap;

import java.math.BigInteger;
import org.apache.commons.collections4.BulkTest;
import java.io.FileInputStream;
import java.util.HashMap;
import java.io.IOException;
import org.apache.commons.collections4.MapIterator;
import java.io.ObjectInputStream;
import org.apache.commons.collections4.Transformer;

/** 
 * Tests for {@link TransformedSplitMap}
 * 
 * @version $Id$
 * @since 4.0
 */
@SuppressWarnings(value = "boxing")
public class TransformedSplitMapTest extends BulkTest {
    private final Transformer<java.lang.Integer, java.lang.String> intToString = new Transformer<java.lang.Integer, java.lang.String>() {
        public String transform(final Integer input) {
            return String.valueOf(input);
        }
    };

    private final Transformer<java.lang.Object, java.lang.Class<?>> objectToClass = new Transformer<java.lang.Object, java.lang.Class<?>>() {
        public Class<?> transform(final Object input) {
            return input == null ? null : input.getClass();
        }
    };

    private final Transformer<java.lang.String, java.lang.Integer> stringToInt = new Transformer<java.lang.String, java.lang.Integer>() {
        public Integer transform(final String input) {
            return Integer.valueOf(input);
        }
    };

    public TransformedSplitMapTest(final String testName) {
        super(testName);
    }

    public void testTransformedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1924");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 1 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1925");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 0 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1926");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 1 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1927");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 2 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1928");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 3 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1929");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 6 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1930");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 7 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1931");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "foo" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1932");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 1 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1934");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[1] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1935");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = -1 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1936");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 1 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1937");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6353,map,6352,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,map,6354,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,map,6356,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6360,objectToClass,6359,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6362,map,6361,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6364,map,6363,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,objectToClass,6366,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,map,6368,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,map,6371,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,map2,6373,map2.size());
        for (int i = 0 ; i < 5 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,map2,6376,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,map2,6378,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6381,map2,6380,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,map2,6382,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6384,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6386,map2.get(java.lang.String.valueOf(i)),6385,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,null,6387,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,map2,6389,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6391,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6393,map2,6392,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map,6343,map.size());
        for (int i = 1 ; i < 6 ; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        for (final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator() ; it.hasNext() ; ) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,it,6346,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,map,6348,map.get(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,it,6350,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIterator_literalMutation1923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator_literalMutation1923");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map,6343,map.size());
        for (int i = 0 ; i < 5 ; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        for (final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator() ; it.hasNext() ; ) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,it,6346,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,map,6348,map.get(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,it,6350,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyMap() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMap");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "foo")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map,6334,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6337,readMap,6336,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("foo", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1914() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1914");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "foo");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1915() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1915");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("foo", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1916() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1916");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "foo");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1917() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1917");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("foo", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1918() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1918");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "foo");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1919() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1919");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("foo", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1920() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1920");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "foo");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMap_literalMutation1921() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_literalMutation1921");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "foo")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map,6339,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,readMap,6341,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

