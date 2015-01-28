package org.apache.commons.collections4.splitmap;

import java.math.BigInteger;
import org.apache.commons.collections4.BulkTest;
import java.io.FileInputStream;
import java.util.HashMap;
import java.io.IOException;
import org.apache.commons.collections4.MapIterator;
import java.io.ObjectInputStream;
import org.junit.Test;
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedMap_add1997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add1997");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedMap_add1998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add1998");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1924");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ -1 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1925");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 2 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1926");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 3 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1927");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 4 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1929");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 4 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1930");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 5 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1934");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[-1] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedMap_literalMutation1935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation1935");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 1 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = -1 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 5 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedMap_remove1557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove1557");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            map2.put(String.valueOf(i), String.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedMap_remove1558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove1558");
        final TransformedSplitMap<java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Class<?>> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Class<?>>(), intToString, objectToClass);
        final Integer[] k = new Integer[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 };
        final Object[] v = new Object[]{ "" , new Object() , new HashMap<java.lang.Object, java.lang.Object>() , 0 , BigInteger.TEN , null , new Object[0] };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        for (int i = 0 ; i < (k.length) ; i++) {
            map.put(k[i], v[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,map,6313,map.containsKey(intToString.transform(k[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,map,6315,map.containsKey(k[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6318,map,6317,map.containsValue(objectToClass.transform(v[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,(((objectToClass.transform(v[i])) != (v[i])) ^ (map.containsValue(v[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,objectToClass,6320,objectToClass.transform(v[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,map,6322,map.get(intToString.transform(k[i])));
        }
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6325,map,6324,map.remove(k[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,objectToClass,6327,objectToClass.transform(v[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,map,6329,map.remove(intToString.transform(k[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6331,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6333,map,6332,map.size());
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map2 = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6335,map2,6334,map2.size());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6336,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6338,map2,6337,map2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6340,map2,6339,map2.containsValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6342,map2,6341,map2.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6344,map2,6343,map2.containsKey(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6345,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6347,map2.get(java.lang.String.valueOf(i)),6346,map2.get(java.lang.String.valueOf(i)).intValue());
        }
        int sz2 = map2.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6349,null,6348,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6351,map2,6350,map2.remove("0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6352,--sz2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6354,map2,6353,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIterator_add1996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator_add1996");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,map,6304,map.size());
        for (int i = 0 ; i < 6 ; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
            map.put(String.valueOf(i), String.valueOf(i));
        }
        for (final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator() ; it.hasNext() ; ) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6306,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6308,it,6307,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,map,6309,map.get(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,it,6311,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,map,6304,map.size());
        for (int i = -1 ; i < 6 ; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        for (final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator() ; it.hasNext() ; ) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6306,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6308,it,6307,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,map,6309,map.get(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,it,6311,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIterator_literalMutation1923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator_literalMutation1923");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,map,6304,map.size());
        for (int i = 0 ; i < 5 ; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        for (final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator() ; it.hasNext() ; ) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6306,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6308,it,6307,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,map,6309,map.get(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,it,6311,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIterator_remove1556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator_remove1556");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.Integer>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6305,map,6304,map.size());
        for (int i = 0 ; i < 6 ; i++) {
        }
        for (final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator() ; it.hasNext() ; ) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6306,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6308,it,6307,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,map,6309,map.get(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,it,6311,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyMap_add1990() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMap_add1990");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "/TransformedSplitMap.emptyCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6294,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6296,map,6295,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6298,readMap,6297,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyMap() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMap");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "foo")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6294,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6296,map,6295,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6298,readMap,6297,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyMap_remove1550() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMap_remove1550");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "/TransformedSplitMap.emptyCollection.version4.obj")));
        final Object readObject = in.readObject();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6294,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6296,map,6295,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6298,readMap,6297,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_add1991() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_add1991");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_add1992() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_add1992");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_add1993() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_add1993");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_add1994() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_add1994");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_add1995() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_add1995");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_remove1551() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_remove1551");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_remove1552() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_remove1552");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_remove1553() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_remove1553");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_remove1554() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_remove1554");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        in.close();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFullMap_remove1555() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMap_remove1555");
        final TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.String> map = TransformedSplitMap.transformingMap(new HashMap<java.lang.String, java.lang.String>(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer());
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        final ObjectInputStream in = new ObjectInputStream(new FileInputStream(((BulkTest.TEST_DATA_PATH) + "TransformedSplitMap.fullCollection.version4.obj")));
        final Object readObject = in.readObject();
        final TransformedSplitMap<?, ?, ?, ?> readMap = ((TransformedSplitMap<?, ?, ?, ?>)(readObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6299,((readMap.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6301,map,6300,map.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6303,readMap,6302,readMap.entrySet());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

