package fr.inria.diversify.fr.inria.diversify.replace;

import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.AbstractFilter;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 11:05 AM
 */
public class ReplaceVarFilter extends AbstractFilter {
    CtElement parent;
    public ReplaceVarFilter(Class<?> type, CtElement parent) {
        super(type);
        this.parent = parent;
    }

    @Override
    public boolean matches(CtElement element) {
        if(element == null)
            return false;
       return element.getParent() == parent || matches(element.getParent());
    }
}
