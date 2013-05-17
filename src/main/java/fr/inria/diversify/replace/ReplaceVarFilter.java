package fr.inria.diversify.replace;

import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.AbstractFilter;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 11:05 AM
 */
public class ReplaceVarFilter extends AbstractFilter {
    CtElement elem;

    public ReplaceVarFilter(CtElement elem) {
        super(CtElement.class);
        this.elem = elem;
    }

    @Override
    public boolean matches(CtElement element) {

        return element == elem;
    }
}
