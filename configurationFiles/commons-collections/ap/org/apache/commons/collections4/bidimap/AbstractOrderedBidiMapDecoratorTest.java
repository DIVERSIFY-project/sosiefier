package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.OrderedBidiMap;
import java.util.SortedMap;
import java.util.TreeMap;

/** 
 * Test class for AbstractOrderedBidiMapDecorator.
 * 
 * @version $Id$
 */
public class AbstractOrderedBidiMapDecoratorTest<K, V> extends AbstractOrderedBidiMapTest<K, V> {
    public AbstractOrderedBidiMapDecoratorTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public OrderedBidiMap<K, V> makeObject() {
        return new TestOrderedBidiMap<K, V>();
    }

    @Override
    public SortedMap<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>();
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @Override
    public boolean isAllowNullValue() {
        return false;
    }

    @Override
    public boolean isSetValueSupported() {
        return true;
    }

    /** 
     * Simple class to actually test.
     */
private static final class TestOrderedBidiMap<K, V> extends AbstractOrderedBidiMapDecorator<K, V> {
        private TestOrderedBidiMap<V, K> inverse = null;

        public TestOrderedBidiMap() {
            super(new org.apache.commons.collections4.bidimap.DualTreeBidiMap<K, V>());
        }

        public TestOrderedBidiMap(final OrderedBidiMap<K, V> map) {
            super(map);
        }

        @Override
        public OrderedBidiMap<V, K> inverseBidiMap() {
            if ((inverse) == null) {
                inverse = new TestOrderedBidiMap<V, K>(decorated().inverseBidiMap());
                inverse.inverse = this;
            } 
            return inverse;
        }
    }
}

