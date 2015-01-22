package org.apache.commons.collections4.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** 
 * Extension of {@link AbstractMapTest} for exercising the
 * {@link CompositeMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class CompositeMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    /** 
     * used as a flag in MapMutator tests
     */
private boolean pass = false;

    public CompositeMapTest(final String testName) {
        super(testName);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        this.pass = false;
    }

    @Override
    public CompositeMap<K, V> makeObject() {
        final CompositeMap<K, V> map = new CompositeMap<K, V>();
        map.addComposited(new HashMap<K, V>());
        map.setMutator(new org.apache.commons.collections4.map.EmptyMapMutator<K, V>());
        return map;
    }

    @SuppressWarnings(value = "unchecked")
    private Map<K, V> buildOne() {
        final HashMap<K, V> map = new HashMap<K, V>();
        map.put(((K)("1")), ((V)("one")));
        map.put(((K)("2")), ((V)("two")));
        return map;
    }

    @SuppressWarnings(value = "unchecked")
    public Map<K, V> buildTwo() {
        final HashMap<K, V> map = new HashMap<K, V>();
        map.put(((K)("3")), ((V)("three")));
        map.put(((K)("4")), ((V)("four")));
        return map;
    }

    public void testGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),430,map,429,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),432,map,431,map.get("4"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),428,map,427,map.containsKey("5"));
        try {
            map.addComposited(three);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation116");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("foo")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),428,map,427,map.containsKey("5"));
        try {
            map.addComposited(three);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation117");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("foo")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),428,map,427,map.containsKey("5"));
        try {
            map.addComposited(three);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,map,435,map.containsKey("5"));
        map.removeComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,map,437,map.containsKey("5"));
        map.removeComposited(buildOne());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),440,map,439,map.containsKey("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation128");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("foo")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,map,435,map.containsKey("5"));
        map.removeComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,map,437,map.containsKey("5"));
        map.removeComposited(buildOne());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),440,map,439,map.containsKey("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation129");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("foo")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),436,map,435,map.containsKey("5"));
        map.removeComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),438,map,437,map.containsKey("5"));
        map.removeComposited(buildOne());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),440,map,439,map.containsKey("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromUnderlying() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromUnderlying");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,map,445,map.containsKey("5"));
        three.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),448,map,447,map.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromUnderlying_literalMutation135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromUnderlying_literalMutation135");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("foo")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,map,445,map.containsKey("5"));
        three.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),448,map,447,map.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromUnderlying_literalMutation136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromUnderlying_literalMutation136");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("foo")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,map,445,map.containsKey("5"));
        three.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),448,map,447,map.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromUnderlying_literalMutation137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromUnderlying_literalMutation137");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),446,map,445,map.containsKey("5"));
        three.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),448,map,447,map.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromComposited() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromComposited");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),442,map,441,map.containsKey("5"));
        map.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),444,three,443,three.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromComposited_literalMutation131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromComposited_literalMutation131");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("foo")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),442,map,441,map.containsKey("5"));
        map.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),444,three,443,three.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromComposited_literalMutation132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromComposited_literalMutation132");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("foo")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),442,map,441,map.containsKey("5"));
        map.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),444,three,443,three.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFromComposited_literalMutation133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromComposited_literalMutation133");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo());
        final HashMap<K, V> three = new HashMap<K, V>();
        three.put(((K)("5")), ((V)("five")));
        map.addComposited(three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),442,map,441,map.containsKey("5"));
        map.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),444,three,443,three.containsKey("5"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResolveCollision() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResolveCollision");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 2L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                pass = true;
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                throw new UnsupportedOperationException();
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.addComposited(buildOne());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testResolveCollision_literalMutation139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testResolveCollision_literalMutation139");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                pass = false;
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                throw new UnsupportedOperationException();
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.addComposited(buildOne());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),449,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                pass = true;
                return ((V)("foo"));
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.put(((K)("willy")), ((V)("wonka")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation119");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 2L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                pass = true;
                return ((V)("foo"));
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.put(((K)("willy")), ((V)("wonka")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation120");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                pass = true;
                return ((V)("foo"));
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.put(((K)("willy")), ((V)("wonka")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation121");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                pass = true;
                return ((V)("foo"));
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.put(((K)("willy")), ((V)("wonka")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation122");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                pass = true;
                return ((V)("foo"));
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.put(((K)("foo")), ((V)("wonka")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation123");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                pass = true;
                return ((V)("foo"));
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                throw new UnsupportedOperationException();
            }
        });
        map.put(((K)("willy")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),434,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                throw new UnsupportedOperationException();
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                pass = true;
            }
        });
        map.putAll(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation124");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 2L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                throw new UnsupportedOperationException();
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                pass = true;
            }
        });
        map.putAll(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation125");
        final CompositeMap<K, V> map = new CompositeMap<K, V>(buildOne() , buildTwo() , new CompositeMap.MapMutator<K, V>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
                throw new UnsupportedOperationException();
            }

            public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
                throw new UnsupportedOperationException();
            }

            public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
                pass = false;
            }
        });
        map.putAll(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),433,pass);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

