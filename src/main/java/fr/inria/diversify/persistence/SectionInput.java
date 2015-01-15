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
     * Reading errors
     */
    private Collection<String> errors;

    /**
     * Section inputs to obtain data from the storage sections for input sub-objects
     */
    private Collection<SectionInput> sections;

    /**
     * Read data into the given transformations. It may add new transformations as well.
     * @param transformations Transformation to be modified by the reader. May increase size after method call.
     */
    public abstract void read(HashMap<Integer, Transformation> transformations);

    public abstract boolean canHandleSection(String s);

    public Collection<String> getErrors() {
        return errors;
    }

    public void setErrors(Collection<String> errors) {
        this.errors = errors;
    }

    public Collection<SectionInput> getSections() {
        return sections;
    }

    public void setSections(Collection<SectionInput> sections) {
        this.sections = sections;
    }
}
