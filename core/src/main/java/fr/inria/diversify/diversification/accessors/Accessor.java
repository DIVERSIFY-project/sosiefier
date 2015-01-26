package fr.inria.diversify.diversification.accessors;

/**
 * Created by marodrig on 22/01/2015.
 */
public interface Accessor<T, R> {

    /**
     * Access the the property's value of T
     *
     * @param t the accessed object
     * @return the property's value result
     */
    R getValue(T t);
}