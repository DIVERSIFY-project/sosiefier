package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by marodrig on 09/01/2015.
 */
public abstract class TransformationsInput {

    private final String uri;
    private final InputSectionLocator sectionLocator;

    protected abstract Collection<String> sectionNames();


    public TransformationsInput(String uri, InputSectionLocator sectionFactory) {
        this.uri = uri;
        this.sectionLocator = sectionFactory;
    }

    /**
     * Read all transformations from the storage
     * @return A collection of transformations
     */
    public Collection<Transformation> read() {
        ArrayList<Transformation> result = new ArrayList<>();
        for ( String s : sectionNames() ) {
            for ( SectionInput section : sectionLocator.locate(s) ) {
                initializeSection(section);
                section.read(result);
            }
        }
        return result;
    }

    /**
     * Initializes the section with the information it needs to perform its job
     * @param section Section to be initialized
     */
    protected abstract void initializeSection(SectionInput section);

}
