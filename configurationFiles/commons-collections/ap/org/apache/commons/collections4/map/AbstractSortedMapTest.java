package org.apache.commons.collections4.map;

import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import org.junit.Test;
import java.util.TreeMap;

/** 
 * Abstract test class for {@link java.util.SortedMap} methods and contracts.
 * 
 * @version $Id$
 */
public abstract class AbstractSortedMapTest<K, V> extends AbstractMapTest<K, V> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test name
     */
public AbstractSortedMapTest(final String testName) {
        super(testName);
    }

    /** 
     * Can't sort null keys.
     * 
     * @return false
     */
@Override
    public boolean isAllowNullKey() {
        return false;
    }

    /** 
     * SortedMap uses TreeMap as its known comparison.
     * 
     * @return a map that is known to be valid
     */
@Override
    public SortedMap<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>();
    }

    public void testComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract SortedMap<K, V> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedMap<K, V> makeFullMap() {
        return ((SortedMap<K, V>)(super.makeFullMap()));
    }

    public void testFirstKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey");
        final SortedMap<K, V> sm = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),373,sm.keySet().iterator(),372,sm.keySet().iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),375,sm,374,sm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLastKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey");
        final SortedMap<K, V> sm = makeFullMap();
        K obj = null;
        for (K k : sm.keySet()) {
            obj = k;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),376,obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),378,sm,377,sm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestHeadMap() {
        return new TestHeadMap<K, V>(this);
    }

    public BulkTest bulkTestTailMap() {
        return new TestTailMap<K, V>(this);
    }

    public BulkTest bulkTestSubMap() {
        return new TestSubMap<K, V>(this);
    }

    public abstract static class TestViewMap<K, V> extends AbstractSortedMapTest<K, V> {
        protected final AbstractMapTest<K, V> main;

        protected final List<K> subSortedKeys = new ArrayList<K>();

        protected final List<V> subSortedValues = new ArrayList<V>();

        protected final List<V> subSortedNewValues = new ArrayList<V>();

        public TestViewMap(final String name ,final AbstractMapTest<K, V> main) {
            super(name);
            this.main = main;
        }

        @Override
        public void resetEmpty() {
            main.resetEmpty();
            super.resetEmpty();
        }

        @Override
        public void resetFull() {
            main.resetFull();
            super.resetFull();
        }

        @Override
        public void verify() {
            super.verify();
            main.verify();
        }

        @Override
        public BulkTest bulkTestHeadMap() {
            return null;
        }

        @Override
        public BulkTest bulkTestTailMap() {
            return null;
        }

        @Override
        public BulkTest bulkTestSubMap() {
            return null;
        }

        @Override
        @SuppressWarnings(value = "unchecked")
        public K[] getSampleKeys() {
            return ((K[])(subSortedKeys.toArray()));
        }

        @Override
        @SuppressWarnings(value = "unchecked")
        public V[] getSampleValues() {
            return ((V[])(subSortedValues.toArray()));
        }

        @Override
        @SuppressWarnings(value = "unchecked")
        public V[] getNewSampleValues() {
            return ((V[])(subSortedNewValues.toArray()));
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
        public boolean isRemoveSupported() {
            return main.isRemoveSupported();
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }
    }

    public static class TestHeadMap<K, V> extends TestViewMap<K, V> {
        static final int SUBSIZE = 6;

        final K toKey;

        public TestHeadMap(final AbstractMapTest<K, V> main) {
            super("SortedMap.HeadMap", main);
            final Map<K, V> sm = main.makeFullMap();
            for (final Map.Entry<K, V> entry : sm.entrySet()) {
                this.subSortedKeys.add(entry.getKey());
                this.subSortedValues.add(entry.getValue());
            }
            this.toKey = this.subSortedKeys.get(SUBSIZE);
            this.subSortedKeys.subList(SUBSIZE, this.subSortedKeys.size()).clear();
            this.subSortedValues.subList(SUBSIZE, this.subSortedValues.size()).clear();
            this.subSortedNewValues.addAll(java.util.Arrays.asList(main.getNewSampleValues()).subList(0, SUBSIZE));
        }

        @Override
        public SortedMap<K, V> makeObject() {
            return ((SortedMap<K, V>)(main.makeObject())).headMap(toKey);
        }

        @Override
        public SortedMap<K, V> makeFullMap() {
            return ((SortedMap<K, V>)(main.makeFullMap())).headMap(toKey);
        }

        @Test(timeout = 1000)
        public void testHeadMapOutOfRange_add184() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHeadMapOutOfRange_add184");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testHeadMapOutOfRange_add185() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHeadMapOutOfRange_add185");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testHeadMapOutOfRange_add186() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHeadMapOutOfRange_add186");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testHeadMapOutOfRange() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHeadMapOutOfRange");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(-1));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testHeadMapOutOfRange_remove150() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHeadMapOutOfRange_remove150");
            if (!(isPutAddSupported())) {
                return ;
            } 
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testHeadMapOutOfRange_remove151() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHeadMapOutOfRange_remove151");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Override
        public String getCompatibilityVersion() {
            return (main.getCompatibilityVersion()) + ".HeadMapView";
        }
    }

    public static class TestTailMap<K, V> extends TestViewMap<K, V> {
        static final int SUBSIZE = 6;

        final K fromKey;

        final K invalidKey;

        public TestTailMap(final AbstractMapTest<K, V> main) {
            super("SortedMap.TailMap", main);
            final Map<K, V> sm = main.makeFullMap();
            for (final Map.Entry<K, V> entry : sm.entrySet()) {
                this.subSortedKeys.add(entry.getKey());
                this.subSortedValues.add(entry.getValue());
            }
            this.fromKey = this.subSortedKeys.get(((this.subSortedKeys.size()) - (SUBSIZE)));
            this.invalidKey = this.subSortedKeys.get((((this.subSortedKeys.size()) - (SUBSIZE)) - 1));
            this.subSortedKeys.subList(0, ((this.subSortedKeys.size()) - (SUBSIZE))).clear();
            this.subSortedValues.subList(0, ((this.subSortedValues.size()) - (SUBSIZE))).clear();
            this.subSortedNewValues.addAll(java.util.Arrays.asList(main.getNewSampleValues()).subList(0, SUBSIZE));
        }

        @Override
        public SortedMap<K, V> makeObject() {
            return ((SortedMap<K, V>)(main.makeObject())).tailMap(fromKey);
        }

        @Override
        public SortedMap<K, V> makeFullMap() {
            return ((SortedMap<K, V>)(main.makeFullMap())).tailMap(fromKey);
        }

        @Test(timeout = 1000)
        public void testTailMapOutOfRange_add190() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailMapOutOfRange_add190");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            resetEmpty();
            try {
                getMap().put(invalidKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testTailMapOutOfRange_add191() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailMapOutOfRange_add191");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(invalidKey, subSortedValues.get(0));
                getMap().put(invalidKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testTailMapOutOfRange_add192() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailMapOutOfRange_add192");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(invalidKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testTailMapOutOfRange() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailMapOutOfRange");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(invalidKey, subSortedValues.get(-1));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testTailMapOutOfRange_remove154() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailMapOutOfRange_remove154");
            if (!(isPutAddSupported())) {
                return ;
            } 
            try {
                getMap().put(invalidKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testTailMapOutOfRange_remove155() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailMapOutOfRange_remove155");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(invalidKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Override
        public String getCompatibilityVersion() {
            return (main.getCompatibilityVersion()) + ".TailMapView";
        }
    }

    public static class TestSubMap<K, V> extends TestViewMap<K, V> {
        static final int SUBSIZE = 3;

        final K fromKey;

        final K toKey;

        public TestSubMap(final AbstractMapTest<K, V> main) {
            super("SortedMap.SubMap", main);
            final Map<K, V> sm = main.makeFullMap();
            for (final Map.Entry<K, V> entry : sm.entrySet()) {
                this.subSortedKeys.add(entry.getKey());
                this.subSortedValues.add(entry.getValue());
            }
            this.fromKey = this.subSortedKeys.get(SUBSIZE);
            this.toKey = this.subSortedKeys.get(((this.subSortedKeys.size()) - (SUBSIZE)));
            this.subSortedKeys.subList(0, SUBSIZE).clear();
            this.subSortedKeys.subList(((this.subSortedKeys.size()) - (SUBSIZE)), this.subSortedKeys.size()).clear();
            this.subSortedValues.subList(0, SUBSIZE).clear();
            this.subSortedValues.subList(((this.subSortedValues.size()) - (SUBSIZE)), this.subSortedValues.size()).clear();
            this.subSortedNewValues.addAll(java.util.Arrays.asList(main.getNewSampleValues()).subList(SUBSIZE, ((this.main.getNewSampleValues().length) - (SUBSIZE))));
        }

        @Override
        public SortedMap<K, V> makeObject() {
            return ((SortedMap<K, V>)(main.makeObject())).subMap(fromKey, toKey);
        }

        @Override
        public SortedMap<K, V> makeFullMap() {
            return ((SortedMap<K, V>)(main.makeFullMap())).subMap(fromKey, toKey);
        }

        @Test(timeout = 1000)
        public void testSubMapOutOfRange_add187() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubMapOutOfRange_add187");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testSubMapOutOfRange_add188() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubMapOutOfRange_add188");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testSubMapOutOfRange_add189() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubMapOutOfRange_add189");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testSubMapOutOfRange() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubMapOutOfRange");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(1));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testSubMapOutOfRange_remove152() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubMapOutOfRange_remove152");
            if (!(isPutAddSupported())) {
                return ;
            } 
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            verify();
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testSubMapOutOfRange_remove153() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubMapOutOfRange_remove153");
            if (!(isPutAddSupported())) {
                return ;
            } 
            resetEmpty();
            try {
                getMap().put(toKey, subSortedValues.get(0));
            } catch (final IllegalArgumentException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Override
        public String getCompatibilityVersion() {
            return (main.getCompatibilityVersion()) + ".SubMapView";
        }
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedMap<K, V> getMap() {
        return ((SortedMap<K, V>)(super.getMap()));
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedMap<K, V> getConfirmed() {
        return ((SortedMap<K, V>)(super.getConfirmed()));
    }
}

