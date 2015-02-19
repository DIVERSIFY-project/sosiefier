package org.apache.commons.collections4.set;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/** 
 * This class is used in CompositeSetTest. When testing serialization,
 * the class has to be separate of CompositeSetTest, else the test
 * class also has to be serialized.
 */
class EmptySetMutator<E> implements CompositeSet.SetMutator<E> {
    /** 
     * Serialization version
     */
private static final long serialVersionUID = 5321193666420238910L;

    private final Set<E> contained;

    public EmptySetMutator(final Set<E> set) {
        this.contained = set;
    }

    public void resolveCollision(final CompositeSet<E> comp, final Set<E> existing, final Set<E> added, final Collection<E> intersects) {
        throw new IllegalArgumentException();
    }

    public boolean add(final CompositeSet<E> composite, final List<java.util.Set<E>> collections, final E obj) {
        return contained.add(obj);
    }

    public boolean addAll(final CompositeSet<E> composite, final List<java.util.Set<E>> collections, final Collection<? extends E> coll) {
        return contained.addAll(coll);
    }
}

