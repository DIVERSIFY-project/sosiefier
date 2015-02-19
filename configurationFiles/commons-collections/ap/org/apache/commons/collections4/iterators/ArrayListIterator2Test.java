package org.apache.commons.collections4.iterators;


/** 
 * Test the ArrayListIterator class with primitives.
 * 
 * @version $Id$
 */
public class ArrayListIterator2Test<E> extends ArrayIterator2Test<E> {
    public ArrayListIterator2Test(final String testName) {
        super(testName);
    }

    @Override
    public ArrayListIterator<E> makeEmptyIterator() {
        return new ArrayListIterator<E>(new int[0]);
    }

    @Override
    public ArrayListIterator<E> makeObject() {
        return new ArrayListIterator<E>(testArray);
    }

    public ArrayListIterator<E> makeArrayListIterator(final Object array) {
        return new ArrayListIterator<E>(array);
    }

    public ArrayListIterator<E> makeArrayListIterator(final Object array, final int index) {
        return new ArrayListIterator<E>(array , index);
    }

    public ArrayListIterator<E> makeArrayListIterator(final Object array, final int start, final int end) {
        return new ArrayListIterator<E>(array , start , end);
    }
}

