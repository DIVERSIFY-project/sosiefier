package org.apache.commons.collections4;

import java.util.ArrayList;
import org.easymock.IExpectationSetters;
import java.util.List;
import java.util.ListIterator;

/** 
 * Provides utilities for making mock-based tests.  Most notable is the generic "type-safe"
 * {@link #createMock(Class)} method, and {@link #replay()} and {@link #verify()} methods
 * that call the respective methods on all created mock objects.
 */
public abstract class MockTestCase {
    private final List<java.lang.Object> mockObjects = new ArrayList<java.lang.Object>();

    @SuppressWarnings(value = "unchecked")
    protected <T>T createMock(final Class<?> name) {
        final T mock = ((T)(org.easymock.EasyMock.createMock(name)));
        return registerMock(mock);
    }

    private <T>T registerMock(final T mock) {
        mockObjects.add(mock);
        return mock;
    }

    protected <T>IExpectationSetters<T> expect(final T t) {
        return org.easymock.EasyMock.expect(t);
    }

    protected final void replay() {
        for (final Object o : mockObjects) {
            org.easymock.EasyMock.replay(o);
        }
    }

    protected final void verify() {
        for (final ListIterator<java.lang.Object> i = mockObjects.listIterator() ; i.hasNext() ; ) {
            try {
                org.easymock.EasyMock.verify(i.next());
            } catch (final AssertionError e) {
                throw new AssertionError(((((i.previousIndex()) + 1) + "") + (e.getMessage())));
            }
        }
    }
}

