package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;

/**
 * An object to handle a given section of the storage
 *
 * Created by marodrig on 09/01/2015.
 */
public abstract class SectionInput {

    /**
     * Read data into the given transformations. It may add new transformations as well.
     * @param transformations Transformation to be modified by the reader. May increase size after method call.
     */
    public abstract void read(Collection<Transformation> transformations);

}
