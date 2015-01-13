package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;
import java.util.HashMap;

/**
 * An object to handle a given section of the storage
 *
 * Created by marodrig on 09/01/2015.
 */
public abstract class SectionInput {

    /**
     * Section locator to obtain sections inputs for a sub-object
     */
    private InputSectionLocator locator;

    /**
     * Read data into the given transformations. It may add new transformations as well.
     * @param transformations Transformation to be modified by the reader. May increase size after method call.
     */
    public abstract void read(HashMap<Integer, Transformation> transformations);

    public void setLocator(InputSectionLocator locator) {
        this.locator = locator;
    }

    public InputSectionLocator getLocator() {
        return locator;
    }

    public abstract boolean canHandleSection(String s);
}
