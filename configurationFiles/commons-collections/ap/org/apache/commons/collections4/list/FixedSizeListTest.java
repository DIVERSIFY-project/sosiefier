package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.List;

/** 
 * Extension of {@link AbstractListTest} for exercising the {@link FixedSizeList}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class FixedSizeListTest<E> extends AbstractListTest<E> {
    public FixedSizeListTest(final String testName) {
        super(testName);
    }

    @Override
    public List<E> makeObject() {
        return org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(new ArrayList<E>());
    }

    @Override
    public List<E> makeFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(list);
    }

    @Override
    public boolean isAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

