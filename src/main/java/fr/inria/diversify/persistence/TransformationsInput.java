package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by marodrig on 09/01/2015.
 */
public abstract class TransformationsInput {

    protected final String uri;

    protected final InputSectionLocator sectionLocator;

    public TransformationsInput(String uri, InputSectionLocator sectionFactory) {
        this.uri = uri;
        this.sectionLocator = sectionFactory;
    }

    /**
     * Read all transformations from the storage
     * @return A collection of transformations indexed by id.
     */
    public HashMap<Integer, Transformation> read() {
        open();
        HashMap<Integer, Transformation> result = new HashMap<>();
        for ( String s : sectionNames() ) {
            for ( SectionInput section : sectionLocator.locate(s) ) {
                initializeSection(section);
                section.read(result);
            }
        }
        close();
        return result;
    }

    /**
     * Closes the storage
     */
    protected abstract void close();

    /**
     * Opens the storage
     */
    protected abstract void open();

    /**
     * Initializes the section with the information it needs to perform its job
     * @param section Section to be initialized
     */
    protected void initializeSection(SectionInput section) {
        section.setLocator(sectionLocator);
    }

    /**
     * Obtains the collection of section names in the storage
     * @return
     */
    protected abstract Collection<String> sectionNames();

}
