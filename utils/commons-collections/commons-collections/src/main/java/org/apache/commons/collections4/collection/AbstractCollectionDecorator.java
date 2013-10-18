/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections4.collection;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/**
 * Decorates another <code>Collection</code> to provide additional behaviour.
 * <p>
 * Each method call made on this <code>Collection</code> is forwarded to the
 * decorated <code>Collection</code>. This class is used as a framework on which
 * to build to extensions such as synchronized and unmodifiable behaviour. The
 * main advantage of decoration is that one decorator can wrap any implementation
 * of <code>Collection</code>, whereas sub-classing requires a new class to be
 * written for each implementation.
 * <p>
 * This implementation does not perform any special processing with
 * {@link #iterator()}. Instead it simply returns the value from the
 * wrapped collection. This may be undesirable, for example if you are trying
 * to write an unmodifiable implementation it might provide a loophole.
 *
 * @param <E> the type of the elements in the collection
 * @since 3.0
 * @version $Id: AbstractCollectionDecorator.java 1494280 2013-06-18 20:07:04Z tn $
 */
public abstract class AbstractCollectionDecorator<E>
        implements Collection<E>, Serializable {

    /** Serialization version */
    private static final long serialVersionUID = 6249888059822088500L;

    /** The collection being decorated */
    private Collection<E> collection;

    /**
     * Constructor only used in deserialization, do not use otherwise.
     * @since 3.1
     */
    protected AbstractCollectionDecorator() {
        super();
    }

    /**
     * Constructor that wraps (not copies).
     *
     * @param coll  the collection to decorate, must not be null
     * @throws IllegalArgumentException if the collection is null
     */
    protected AbstractCollectionDecorator(final Collection<E> coll) {
        if (coll == null) {
            throw new IllegalArgumentException("Collection must not be null");
        }
        this.collection = coll;
    }

    /**
     * Gets the collection being decorated.
     * All access to the decorated collection goes via this method.
     *
     * @return the decorated collection
     */
    protected Collection<E> decorated() {
        return collection;
    }

    /**
     * Sets the collection being decorated.
     * <p>
     * <b>NOTE:</b> this method should only be used during deserialization
     *
     * @param coll  the decorated collection
     */
    protected void setCollection(final Collection<E> coll) {
        this.collection = coll;
    }

    //-----------------------------------------------------------------------

    public boolean add(final E object) {
        return decorated().add(object);
    }

    public boolean addAll(final Collection<? extends E> coll) {
        return decorated().addAll(coll);
    }

    public void clear() {
        decorated().clear();
    }

    public boolean contains(final Object object) {
        return decorated().contains(object);
    }

    public boolean isEmpty() {
        return decorated().isEmpty();
    }

    public Iterator<E> iterator() {
        return decorated().iterator();
    }

    public boolean remove(final Object object) {
        return decorated().remove(object);
    }

    public int size() {
        return decorated().size();
    }

    public Object[] toArray() {
        return decorated().toArray();
    }

    public <T> T[] toArray(final T[] object) {
        return decorated().toArray(object);
    }

    public boolean containsAll(final Collection<?> coll) {
        return decorated().containsAll(coll);
    }

    public boolean removeAll(final Collection<?> coll) {
        return decorated().removeAll(coll);
    }

    public boolean retainAll(final Collection<?> coll) {
        return decorated().retainAll(coll);
    }

    @Override
    public boolean equals(final Object object) {
        return object == this || decorated().equals(object);
    }

    @Override
    public int hashCode() {
        return decorated().hashCode();
    }

    @Override
    public String toString() {
        return decorated().toString();
    }

}
