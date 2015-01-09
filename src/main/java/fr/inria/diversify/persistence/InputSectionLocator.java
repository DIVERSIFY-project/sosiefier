package fr.inria.diversify.persistence;

import java.util.Collection;

/**
 * The input section locator locate section input objects that can handle a given section of the storage
 *
 * Created by marodrig on 09/01/2015.
 */
public abstract class InputSectionLocator {

    public abstract Collection<SectionInput> locate(String sectionName);

}
