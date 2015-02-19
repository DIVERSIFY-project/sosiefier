package org.apache.commons.collections4;

import java.util.HashMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Map;
import org.junit.Test;
import org.apache.commons.collections4.splitmap.TransformedSplitMap;

/** 
 * Tests for {@link TransformedSplitMap}
 * 
 * @version $Id$
 * @since 4.0
 */
@SuppressWarnings(value = "boxing")
public class SplitMapUtilsTest extends BulkTest {
    private Map<java.lang.String, java.lang.Integer> backingMap;

    private TransformedSplitMap<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> transformedMap;

    private final Transformer<java.lang.String, java.lang.Integer> stringToInt = new Transformer<java.lang.String, java.lang.Integer>() {
        public Integer transform(final String input) {
            return Integer.valueOf(input);
        }
    };

    public SplitMapUtilsTest(final String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        backingMap = new HashMap<java.lang.String, java.lang.Integer>();
        transformedMap = TransformedSplitMap.transformingMap(backingMap, org.apache.commons.collections4.functors.NOPTransformer.<String>nopTransformer(), stringToInt);
        for (int i = 0 ; i < 10 ; i++) {
            transformedMap.put(String.valueOf(i), String.valueOf(i));
        }
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2931");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2932");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2933");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2934");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2935");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2936");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2937");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2938");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2939");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2940");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2941");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_add2942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_add2942");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3052");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 11 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3053");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3054");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 99);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3055");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3056");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 99);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3057");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("foo", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3058");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 199);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3059");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("foo", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3060");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 301);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3061");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = -1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3062");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 9 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2356");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2357");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2358");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2359");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2360");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2361");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2362");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2363");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2364");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2365");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2366");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadableMap_remove2367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_remove2367");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,map,8197,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8199,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8201,map.get(java.lang.String.valueOf(i)),8200,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,it,8203,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,null,8205,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,it,8207,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8209,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,map,8211,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8213,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5559,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8215,other,8214,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8217,map,8216,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,map.remove(java.lang.String.valueOf(i)),8219,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8221,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8223,map,8222,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8225,map,8224,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,null,8227,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAlreadyReadableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlreadyReadableMap");
        final HashedMap<java.lang.String, java.lang.Integer> hashedMap = new HashedMap<java.lang.String, java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8191,hashedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8193,null,8192,org.apache.commons.collections4.SplitMapUtils.readableMap(hashedMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2943");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2944");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2945");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2946");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2947");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2948");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2949");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2950");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2951");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2952");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2953");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2954");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2955");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2956");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2957");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2958");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2959");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2960");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2961");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2962");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2963");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2964");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2965");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2966");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2967");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2968");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2969");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2970");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2971");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2972");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2973");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2974");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_add2975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_add2975");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3068");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("foo", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3069() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3069");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3070");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3071");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "foo");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3072");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("foo", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3073");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "foo");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3074");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("foo", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testWritableMap_literalMutation3075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_literalMutation3075");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "foo");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2368");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2369");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2370");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2371");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2372");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2373");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2374");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2375");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2376");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2377");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2378");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2379");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2380");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2381");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2382");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2383");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2384");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2385");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2386");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2387");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2388");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2389");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2390");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2391");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2392() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2392");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2393");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2394");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2395() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2395");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2396");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2397() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2397");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2398() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2398");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2399");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testWritableMap_remove2400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWritableMap_remove2400");
        final Map<java.lang.String, java.lang.String> map = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        attemptGetOperation(new Runnable() {
            public void run() {
                map.get(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.entrySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.keySet();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.values();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.size();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.isEmpty();
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsKey(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.containsValue(null);
            }
        });
        attemptGetOperation(new Runnable() {
            public void run() {
                map.remove(null);
            }
        });
        final Map<java.lang.String, java.lang.String> other = org.apache.commons.collections4.SplitMapUtils.writableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8229,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8232,other,8231,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,map,8233,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,backingMap,8235,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,backingMap,8238,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8240,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,backingMap,8241,backingMap.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,backingMap,8243,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8245,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8247,null,8246,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAlreadyWritableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlreadyWritableMap");
        final HashedMap<java.lang.String, java.lang.String> hashedMap = new HashedMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8194,hashedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8196,null,8195,org.apache.commons.collections4.SplitMapUtils.writableMap(hashedMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void attemptGetOperation(final Runnable r) {
        attemptMapOperation("Put exposed as writable Map must not allow Get operations", r);
    }

    private void attemptPutOperation(final Runnable r) {
        attemptMapOperation("Get exposed as writable Map must not allow Put operations", r);
    }

    private void attemptMapOperation(final String s, final Runnable r) {
        try {
            r.run();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8190,s);
        } catch (final UnsupportedOperationException e) {
        }
    }
}

