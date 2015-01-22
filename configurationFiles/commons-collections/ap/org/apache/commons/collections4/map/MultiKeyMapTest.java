package org.apache.commons.collections4.map;

import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.keyvalue.MultiKey;
import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class MultiKeyMapTest<K, V> extends AbstractIterableMapTest<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> {
    static final Integer I1 = Integer.valueOf(1);

    static final Integer I2 = Integer.valueOf(2);

    static final Integer I3 = Integer.valueOf(3);

    static final Integer I4 = Integer.valueOf(4);

    static final Integer I5 = Integer.valueOf(5);

    static final Integer I6 = Integer.valueOf(6);

    static final Integer I7 = Integer.valueOf(7);

    static final Integer I8 = Integer.valueOf(8);

    public MultiKeyMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(MultiKeyMapTest.class);
    }

    @Override
    public MultiKeyMap<K, V> makeObject() {
        return new MultiKeyMap<K, V>();
    }

    @Override
    public MultiKey<K>[] getSampleKeys() {
        return getMultiKeyKeys();
    }

    @SuppressWarnings(value = "unchecked")
    private MultiKey<K>[] getMultiKeyKeys() {
        return new MultiKey[]{ new MultiKey<java.lang.Integer>(I1 , I2) , new MultiKey<java.lang.Integer>(I2 , I3) , new MultiKey<java.lang.Integer>(I3 , I4) , new MultiKey<java.lang.Integer>(I1 , I1 , I2) , new MultiKey<java.lang.Integer>(I2 , I3 , I4) , new MultiKey<java.lang.Integer>(I3 , I7 , I6) , new MultiKey<java.lang.Integer>(I1 , I1 , I2 , I3) , new MultiKey<java.lang.Integer>(I2 , I4 , I5 , I6) , new MultiKey<java.lang.Integer>(I3 , I6 , I7 , I8) , new MultiKey<java.lang.Integer>(I1 , I1 , I2 , I3 , I4) , new MultiKey<java.lang.Integer>(I2 , I3 , I4 , I5 , I6) , new MultiKey<java.lang.Integer>(I3 , I5 , I6 , I7 , I8) };
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public V[] getSampleValues() {
        return ((V[])(new Object[]{ "2A" , "2B" , "2C" , "3D" , "3E" , "3F" , "4G" , "4H" , "4I" , "5J" , "5K" , "5L" }));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public V[] getNewSampleValues() {
        return ((V[])(new Object[]{ "1a" , "1b" , "1c" , "2d" , "2e" , "2f" , "3g" , "3h" , "3i" , "4j" , "4k" , "4l" }));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public MultiKey<K>[] getOtherKeys() {
        return new MultiKey[]{ new MultiKey<java.lang.Integer>(I1 , I7) , new MultiKey<java.lang.Integer>(I1 , I8) , new MultiKey<java.lang.Integer>(I2 , I4) , new MultiKey<java.lang.Integer>(I2 , I5) };
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling");
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1412,map,1411,map.get(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1414,map,1413,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,map,1415,map.containsValue(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,map,1417,map.remove(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1420,map.entrySet(),1419,map.entrySet().contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1422,map.keySet(),1421,map.keySet().contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1424,map.values(),1423,map.values().contains(null));
        try {
            map.put(null, null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1426,map,1425,map.put(new org.apache.commons.collections4.keyvalue.MultiKey<K>(null , null), null));
        try {
            map.put(null, ((V)(new Object())));
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation390");
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1412,map,1411,map.get(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1414,map,1413,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1416,map,1415,map.containsValue(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1418,map,1417,map.remove(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1420,map.entrySet(),1419,map.entrySet().contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1422,map.keySet(),1421,map.keySet().contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1424,map.values(),1423,map.values().contains(null));
        try {
            map.put(null, null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1426,map,1425,map.put(new org.apache.commons.collections4.keyvalue.MultiKey<K>(null , null), null));
        try {
            map.put(null, ((V)(new Object())));
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyGet");
        resetFull();
        final MultiKeyMap<K, V> multimap = getMap();
        final MultiKey<K>[] keys = getMultiKeyKeys();
        final V[] values = getSampleValues();
        for (int i = -1 ; i < (keys.length) ; i++) {
            final MultiKey<K> key = keys[i];
            final V value = values[i];
            switch (key.size()) {
                case 2 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1196,multimap,1195,multimap.get(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1194,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,multimap,1197,multimap.get(null, key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,multimap,1199,multimap.get(key.getKey(0), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1202,multimap,1201,multimap.get(null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,multimap,1203,multimap.get(key.getKey(0), key.getKey(1), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,multimap,1205,multimap.get(key.getKey(0), key.getKey(1), null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1208,multimap,1207,multimap.get(key.getKey(0), key.getKey(1), null, null, null));
                    break;
                case 3 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,multimap,1210,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1209,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,multimap,1212,multimap.get(null, key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1215,multimap,1214,multimap.get(key.getKey(0), null, key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1217,multimap,1216,multimap.get(key.getKey(0), key.getKey(1), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1219,multimap,1218,multimap.get(null, null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1221,multimap,1220,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1223,multimap,1222,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), null, null));
                    break;
                case 4 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1226,multimap,1225,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1224,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,multimap,1227,multimap.get(null, key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1230,multimap,1229,multimap.get(key.getKey(0), null, key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1232,multimap,1231,multimap.get(key.getKey(0), key.getKey(1), null, key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1234,multimap,1233,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1236,multimap,1235,multimap.get(null, null, null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1238,multimap,1237,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), null));
                    break;
                case 5 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1241,multimap,1240,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1239,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1243,multimap,1242,multimap.get(null, key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1245,multimap,1244,multimap.get(key.getKey(0), null, key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1247,multimap,1246,multimap.get(key.getKey(0), key.getKey(1), null, key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1249,multimap,1248,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), null, key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1251,multimap,1250,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1253,multimap,1252,multimap.get(null, null, null, null, null));
                    break;
                default :
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyContainsKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyContainsKey");
        resetFull();
        final MultiKeyMap<K, V> multimap = getMap();
        final MultiKey<K>[] keys = getMultiKeyKeys();
        for (final MultiKey<K> key : keys) {
            switch (key.size()) {
                case 2 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1139,multimap,1138,multimap.containsKey(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,multimap,1140,multimap.containsKey(null, key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,multimap,1142,multimap.containsKey(key.getKey(0), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,multimap,1144,multimap.containsKey(null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,multimap,1146,multimap.containsKey(key.getKey(0), key.getKey(1), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,multimap,1148,multimap.containsKey(key.getKey(0), key.getKey(1), null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,multimap,1150,multimap.containsKey(key.getKey(0), key.getKey(1), null, null, null));
                    break;
                case 3 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,multimap,1152,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,multimap,1154,multimap.containsKey(null, key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1157,multimap,1156,multimap.containsKey(key.getKey(0), null, key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1159,multimap,1158,multimap.containsKey(key.getKey(0), key.getKey(1), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1161,multimap,1160,multimap.containsKey(null, null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1163,multimap,1162,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1165,multimap,1164,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), null, null));
                    break;
                case 4 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1167,multimap,1166,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1169,multimap,1168,multimap.containsKey(null, key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1171,multimap,1170,multimap.containsKey(key.getKey(0), null, key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1173,multimap,1172,multimap.containsKey(key.getKey(0), key.getKey(1), null, key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1175,multimap,1174,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1177,multimap,1176,multimap.containsKey(null, null, null, null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1179,multimap,1178,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), null));
                    break;
                case 5 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1181,multimap,1180,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1183,multimap,1182,multimap.containsKey(null, key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1185,multimap,1184,multimap.containsKey(key.getKey(0), null, key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1187,multimap,1186,multimap.containsKey(key.getKey(0), key.getKey(1), null, key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1189,multimap,1188,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), null, key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1191,multimap,1190,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1193,multimap,1192,multimap.containsKey(null, null, null, null, null));
                    break;
                default :
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyPut() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyPut");
        final MultiKey<K>[] keys = getMultiKeyKeys();
        final V[] values = getSampleValues();
        for (int i = -1 ; i < (keys.length) ; i++) {
            final MultiKeyMap<K, V> multimap = new MultiKeyMap<K, V>();
            final MultiKey<K> key = keys[i];
            final V value = values[i];
            switch (key.size()) {
                case 2 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1255,multimap,1254,multimap.put(key.getKey(0), key.getKey(1), value));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1257,multimap,1256,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1260,multimap,1259,multimap.get(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1258,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,multimap,1261,multimap.containsKey(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,multimap,1263,multimap.containsKey(new org.apache.commons.collections4.keyvalue.MultiKey<K>(key.getKey(0) , key.getKey(1))));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1267,multimap,1266,multimap.put(key.getKey(0), key.getKey(1), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1265,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1269,multimap,1268,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1271,multimap,1270,multimap.get(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1273,multimap,1272,multimap.containsKey(key.getKey(0), key.getKey(1)));
                    break;
                case 3 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1275,multimap,1274,multimap.put(key.getKey(0), key.getKey(1), key.getKey(2), value));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1277,multimap,1276,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1280,multimap,1279,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1278,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1282,multimap,1281,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1284,multimap,1283,multimap.containsKey(new org.apache.commons.collections4.keyvalue.MultiKey<K>(key.getKey(0) , key.getKey(1) , key.getKey(2))));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1287,multimap,1286,multimap.put(key.getKey(0), key.getKey(1), key.getKey(2), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1285,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,multimap,1288,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,multimap,1290,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,multimap,1292,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    break;
                case 4 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1295,multimap,1294,multimap.put(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), value));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1297,multimap,1296,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,multimap,1299,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1302,multimap,1301,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,multimap,1303,multimap.containsKey(new org.apache.commons.collections4.keyvalue.MultiKey<K>(key.getKey(0) , key.getKey(1) , key.getKey(2) , key.getKey(3))));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,multimap,1306,multimap.put(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,multimap,1308,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1311,multimap,1310,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,multimap,1312,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    break;
                case 5 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,multimap,1314,multimap.put(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4), value));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1317,multimap,1316,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1320,multimap,1319,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1322,multimap,1321,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1324,multimap,1323,multimap.containsKey(new org.apache.commons.collections4.keyvalue.MultiKey<K>(key.getKey(0) , key.getKey(1) , key.getKey(2) , key.getKey(3) , key.getKey(4))));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1327,multimap,1326,multimap.put(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4), null));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1325,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1329,multimap,1328,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1331,multimap,1330,multimap.get(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1333,multimap,1332,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    break;
                default :
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyRemove");
        final MultiKey<K>[] keys = getMultiKeyKeys();
        final V[] values = getSampleValues();
        for (int i = -1 ; i < (keys.length) ; i++) {
            resetFull();
            final MultiKeyMap<K, V> multimap = getMap();
            final int size = multimap.size();
            final MultiKey<K> key = keys[i];
            final V value = values[i];
            switch (key.size()) {
                case 2 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1356,multimap,1355,multimap.containsKey(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1359,multimap,1358,multimap.removeMultiKey(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1357,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1361,multimap,1360,multimap.containsKey(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,multimap,1363,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1362,(size - 1));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,multimap,1365,multimap.removeMultiKey(key.getKey(0), key.getKey(1)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,multimap,1367,multimap.containsKey(key.getKey(0), key.getKey(1)));
                    break;
                case 3 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,multimap,1369,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1373,multimap,1372,multimap.removeMultiKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1371,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,multimap,1374,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,multimap,1377,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,(size - 1));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1380,multimap,1379,multimap.removeMultiKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1382,multimap,1381,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2)));
                    break;
                case 4 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1384,multimap,1383,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1387,multimap,1386,multimap.removeMultiKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1385,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1389,multimap,1388,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,multimap,1391,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,(size - 1));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,multimap,1393,multimap.removeMultiKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1396,multimap,1395,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3)));
                    break;
                case 5 :
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1398,multimap,1397,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1401,multimap,1400,multimap.removeMultiKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1399,value);
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1403,multimap,1402,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1406,multimap,1405,multimap.size());
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1404,(size - 1));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1408,multimap,1407,multimap.removeMultiKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1410,multimap,1409,multimap.containsKey(key.getKey(0), key.getKey(1), key.getKey(2), key.getKey(3), key.getKey(4)));
                    break;
                default :
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyRemoveAll1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyRemoveAll1");
        resetFull();
        final MultiKeyMap<K, V> multimap = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1335,multimap,1334,multimap.size());
        multimap.removeAll(I1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1337,multimap,1336,multimap.size());
        for (final MapIterator<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> it = multimap.mapIterator() ; it.hasNext() ; ) {
            final MultiKey<? extends K> key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,org.apache.commons.collections4.map.MultiKeyMapTest.I1,1338,org.apache.commons.collections4.map.MultiKeyMapTest.I1.equals(key.getKey(0)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyRemoveAll2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyRemoveAll2");
        resetFull();
        final MultiKeyMap<K, V> multimap = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,multimap,1340,multimap.size());
        multimap.removeAll(I2, I3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1343,multimap,1342,multimap.size());
        for (final MapIterator<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> it = multimap.mapIterator() ; it.hasNext() ; ) {
            final MultiKey<? extends K> key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1344,((org.apache.commons.collections4.map.MultiKeyMapTest.I2.equals(key.getKey(0))) && (org.apache.commons.collections4.map.MultiKeyMapTest.I3.equals(key.getKey(1)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyRemoveAll3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyRemoveAll3");
        resetFull();
        final MultiKeyMap<K, V> multimap = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1346,multimap,1345,multimap.size());
        multimap.removeAll(I1, I1, I2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1348,multimap,1347,multimap.size());
        for (final MapIterator<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> it = multimap.mapIterator() ; it.hasNext() ; ) {
            final MultiKey<? extends K> key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1349,(((org.apache.commons.collections4.map.MultiKeyMapTest.I1.equals(key.getKey(0))) && (org.apache.commons.collections4.map.MultiKeyMapTest.I1.equals(key.getKey(1)))) && (org.apache.commons.collections4.map.MultiKeyMapTest.I2.equals(key.getKey(2)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultiKeyRemoveAll4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiKeyRemoveAll4");
        resetFull();
        final MultiKeyMap<K, V> multimap = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1351,multimap,1350,multimap.size());
        multimap.removeAll(I1, I1, I2, I3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1353,multimap,1352,multimap.size());
        for (final MapIterator<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> it = multimap.mapIterator() ; it.hasNext() ; ) {
            final MultiKey<? extends K> key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1354,(((((org.apache.commons.collections4.map.MultiKeyMapTest.I1.equals(key.getKey(0))) && (org.apache.commons.collections4.map.MultiKeyMapTest.I1.equals(key.getKey(1)))) && (org.apache.commons.collections4.map.MultiKeyMapTest.I2.equals(key.getKey(2)))) && ((key.size()) >= 4)) && (org.apache.commons.collections4.map.MultiKeyMapTest.I3.equals(key.getKey(3)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone");
        final MultiKeyMap<K, V> map = new MultiKeyMap<K, V>();
        map.put(new MultiKey<K>(((K)(I1)) , ((K)(I2))), ((V)("1-2")));
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1107,map,1106,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1109,cloned,1108,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,map,1110,map.get(new org.apache.commons.collections4.keyvalue.MultiKey<K>(((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I1)) , ((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I2)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1113,cloned,1112,cloned.get(new org.apache.commons.collections4.keyvalue.MultiKey<K>(((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I1)) , ((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I2)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation379");
        final MultiKeyMap<K, V> map = new MultiKeyMap<K, V>();
        map.put(new MultiKey<K>(((K)(I1)) , ((K)(I2))), ((V)("1-2")));
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1107,map,1106,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1109,cloned,1108,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,map,1110,map.get(new org.apache.commons.collections4.keyvalue.MultiKey<K>(((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I1)) , ((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I2)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1113,cloned,1112,cloned.get(new org.apache.commons.collections4.keyvalue.MultiKey<K>(((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I1)) , ((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I2)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation380");
        final MultiKeyMap<K, V> map = new MultiKeyMap<K, V>();
        map.put(new MultiKey<K>(((K)(I1)) , ((K)(I2))), ((V)("foo")));
        final Map<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1107,map,1106,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1109,cloned,1108,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,map,1110,map.get(new org.apache.commons.collections4.keyvalue.MultiKey<K>(((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I1)) , ((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I2)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1113,cloned,1112,cloned.get(new org.apache.commons.collections4.keyvalue.MultiKey<K>(((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I1)) , ((K)(org.apache.commons.collections4.map.MultiKeyMapTest.I2)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLRUMultiKeyMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLRUMultiKeyMap");
        final MultiKeyMap<K, V> map = MultiKeyMap.multiKeyMap(new org.apache.commons.collections4.map.LRUMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>(2));
        map.put(((K)(I1)), ((K)(I2)), ((V)("1-2")));
        map.put(((K)(I1)), ((K)(I3)), ((V)("1-1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1115,map,1114,map.size());
        map.put(((K)(I1)), ((K)(I4)), ((V)("1-4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,map,1116,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,map,1118,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1121,map,1120,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,map,1122,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        final MultiKeyMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,map,1124,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,cloned,1126,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1129,cloned,1128,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,cloned,1130,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        cloned.put(((K)(I1)), ((K)(I5)), ((V)("1-5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,cloned,1132,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,cloned,1134,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,cloned,1136,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLRUMultiKeyMap_literalMutation382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLRUMultiKeyMap_literalMutation382");
        final MultiKeyMap<K, V> map = MultiKeyMap.multiKeyMap(new org.apache.commons.collections4.map.LRUMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>(1));
        map.put(((K)(I1)), ((K)(I2)), ((V)("1-2")));
        map.put(((K)(I1)), ((K)(I3)), ((V)("1-1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1115,map,1114,map.size());
        map.put(((K)(I1)), ((K)(I4)), ((V)("1-4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,map,1116,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,map,1118,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1121,map,1120,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,map,1122,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        final MultiKeyMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,map,1124,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,cloned,1126,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1129,cloned,1128,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,cloned,1130,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        cloned.put(((K)(I1)), ((K)(I5)), ((V)("1-5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,cloned,1132,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,cloned,1134,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,cloned,1136,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLRUMultiKeyMap_literalMutation383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLRUMultiKeyMap_literalMutation383");
        final MultiKeyMap<K, V> map = MultiKeyMap.multiKeyMap(new org.apache.commons.collections4.map.LRUMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>(2));
        map.put(((K)(I1)), ((K)(I2)), ((V)("foo")));
        map.put(((K)(I1)), ((K)(I3)), ((V)("1-1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1115,map,1114,map.size());
        map.put(((K)(I1)), ((K)(I4)), ((V)("1-4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,map,1116,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,map,1118,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1121,map,1120,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,map,1122,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        final MultiKeyMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,map,1124,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,cloned,1126,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1129,cloned,1128,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,cloned,1130,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        cloned.put(((K)(I1)), ((K)(I5)), ((V)("1-5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,cloned,1132,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,cloned,1134,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,cloned,1136,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLRUMultiKeyMap_literalMutation384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLRUMultiKeyMap_literalMutation384");
        final MultiKeyMap<K, V> map = MultiKeyMap.multiKeyMap(new org.apache.commons.collections4.map.LRUMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>(2));
        map.put(((K)(I1)), ((K)(I2)), ((V)("1-2")));
        map.put(((K)(I1)), ((K)(I3)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1115,map,1114,map.size());
        map.put(((K)(I1)), ((K)(I4)), ((V)("1-4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,map,1116,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,map,1118,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1121,map,1120,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,map,1122,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        final MultiKeyMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,map,1124,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,cloned,1126,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1129,cloned,1128,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,cloned,1130,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        cloned.put(((K)(I1)), ((K)(I5)), ((V)("1-5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,cloned,1132,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,cloned,1134,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,cloned,1136,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLRUMultiKeyMap_literalMutation385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLRUMultiKeyMap_literalMutation385");
        final MultiKeyMap<K, V> map = MultiKeyMap.multiKeyMap(new org.apache.commons.collections4.map.LRUMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>(2));
        map.put(((K)(I1)), ((K)(I2)), ((V)("1-2")));
        map.put(((K)(I1)), ((K)(I3)), ((V)("1-1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1115,map,1114,map.size());
        map.put(((K)(I1)), ((K)(I4)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,map,1116,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,map,1118,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1121,map,1120,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,map,1122,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        final MultiKeyMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,map,1124,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,cloned,1126,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1129,cloned,1128,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,cloned,1130,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        cloned.put(((K)(I1)), ((K)(I5)), ((V)("1-5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,cloned,1132,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,cloned,1134,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,cloned,1136,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testLRUMultiKeyMap_literalMutation386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLRUMultiKeyMap_literalMutation386");
        final MultiKeyMap<K, V> map = MultiKeyMap.multiKeyMap(new org.apache.commons.collections4.map.LRUMap<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>, V>(2));
        map.put(((K)(I1)), ((K)(I2)), ((V)("1-2")));
        map.put(((K)(I1)), ((K)(I3)), ((V)("1-1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1115,map,1114,map.size());
        map.put(((K)(I1)), ((K)(I4)), ((V)("1-4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1117,map,1116,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,map,1118,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1121,map,1120,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1123,map,1122,map.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        final MultiKeyMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,map,1124,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,cloned,1126,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1129,cloned,1128,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,cloned,1130,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I2));
        cloned.put(((K)(I1)), ((K)(I5)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,cloned,1132,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,cloned,1134,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,cloned,1136,cloned.containsKey(org.apache.commons.collections4.map.MultiKeyMapTest.I1, org.apache.commons.collections4.map.MultiKeyMapTest.I5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public MultiKeyMap<K, V> getMap() {
        return ((MultiKeyMap<K, V>)(super.getMap()));
    }
}

