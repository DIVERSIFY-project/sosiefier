package org.apache.commons.collections4;

import java.util.HashMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Map;
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

    public void testReadableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3052");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 9 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3053");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3054");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3055");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3056");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 101);
        m.put("bar", 200);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3057");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3058");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
        attemptPutOperation(new Runnable() {
            public void run() {
                map.put("foo", 100);
            }
        });
        final HashMap<java.lang.String, java.lang.Integer> m = new HashMap<java.lang.String, java.lang.Integer>();
        m.put("foo", 100);
        m.put("bar", 201);
        m.put("baz", 300);
        attemptPutOperation(new Runnable() {
            public void run() {
                map.putAll(m);
            }
        });
        final IterableMap<java.lang.String, java.lang.Integer> other = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3059");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3060");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3061");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = -1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadableMap_literalMutation3062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadableMap_literalMutation3062");
        final IterableMap<java.lang.String, java.lang.Integer> map = org.apache.commons.collections4.SplitMapUtils.readableMap(transformedMap);
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,map,8272,map.containsValue(java.lang.String.valueOf(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8274,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,map.get(java.lang.String.valueOf(i)),8275,map.get(java.lang.String.valueOf(i)).intValue());
        }
        final MapIterator<java.lang.String, java.lang.Integer> it = map.mapIterator();
        while (it.hasNext()) {
            final String k = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8277,k);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,it,8278,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,null,8280,java.lang.Integer.valueOf(k));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8283,it,8282,it.getValue());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,(map instanceof org.apache.commons.collections4.Unmodifiable));
        int sz = map.size();
        attemptPutOperation(new Runnable() {
            public void run() {
                map.clear();
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,map,8286,map.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,other,8289,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,map,8291,map.hashCode());
        for (int i = 0 ; i < 11 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8293,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8295,map.remove(java.lang.String.valueOf(i)),8294,map.remove(java.lang.String.valueOf(i)).intValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,--sz);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8298,map,8297,map.size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,map,8299,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8301,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,null,8302,org.apache.commons.collections4.SplitMapUtils.readableMap(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAlreadyReadableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlreadyReadableMap");
        final HashedMap<java.lang.String, java.lang.Integer> hashedMap = new HashedMap<java.lang.String, java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8266,hashedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8268,null,8267,org.apache.commons.collections4.SplitMapUtils.readableMap(hashedMap));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("foo", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "foo");
        more.put("bar", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("foo", "88");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "foo");
        more.put("baz", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("foo", "99");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8304,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,other,8306,other.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,map,8308,map.hashCode());
        int sz = backingMap.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,backingMap,8310,backingMap.containsKey("foo"));
        map.put("new", "66");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8312,++sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8314,backingMap,8313,backingMap.size());
        final Map<java.lang.String, java.lang.String> more = new HashMap<java.lang.String, java.lang.String>();
        more.put("foo", "77");
        more.put("bar", "88");
        more.put("baz", "foo");
        map.putAll(more);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,(sz + (more.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8317,backingMap,8316,backingMap.size());
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,backingMap,8318,backingMap.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8320,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,null,8321,org.apache.commons.collections4.SplitMapUtils.writableMap(((org.apache.commons.collections4.Put<java.lang.String, java.lang.String>)(map))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAlreadyWritableMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlreadyWritableMap");
        final HashedMap<java.lang.String, java.lang.String> hashedMap = new HashedMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8269,hashedMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8271,null,8270,org.apache.commons.collections4.SplitMapUtils.writableMap(hashedMap));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8265,s);
        } catch (final UnsupportedOperationException e) {
        }
    }
}

