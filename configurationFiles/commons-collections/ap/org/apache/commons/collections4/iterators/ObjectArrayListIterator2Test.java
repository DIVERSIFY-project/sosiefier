package org.apache.commons.collections4.iterators;


/** 
 * Tests the ObjectArrayListIterator class.
 * 
 * @version $Id$
 */
public class ObjectArrayListIterator2Test<E> extends AbstractListIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" };

    public ObjectArrayListIterator2Test(final String testName) {
        super(testName);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ObjectArrayListIterator<E> makeEmptyIterator() {
        return new ObjectArrayListIterator<E>(((E[])(new Object[0])));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ObjectArrayListIterator<E> makeObject() {
        return new ObjectArrayListIterator<E>(((E[])(testArray)));
    }

    public ObjectArrayListIterator<E> makeArrayListIterator(final E[] array) {
        return new ObjectArrayListIterator<E>(array);
    }

    @Override
    public boolean supportsAdd() {
        return false;
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }
}

