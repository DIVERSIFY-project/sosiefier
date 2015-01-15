package fr.inria.diversify.persistence;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;

import java.awt.*;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by marodrig on 09/01/2015.
 */
public abstract class TransformationsInput {

    protected final String uri;

    private Collection<String> errors;

    protected Collection<SectionInput> sections;

    public TransformationsInput(String uri) {
        this.uri = uri;
        sections = new ArrayList<>();
    }

    /**
     * Retrieves a collection of all section name in the storage
     * @return A collection of strings
     */
    protected abstract Collection<String> sectionNames();

    /**
     * Read all transformations from the storage
     * @return A collection of transformations indexed by id.
     */
    public Collection<Transformation> read() {
        open();
        HashMap<Integer, Transformation> result = new HashMap<>();
        for ( SectionInput section : sections ) {
            initializeSection(section);
            for ( String s : sectionNames() ) {
                if ( section.canHandleSection(s) ) section.read(result);
            }
        }
        close();
        return result.values();
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
        section.setSections(sections);
        section.setErrors(getErrors());
    }


    public Collection<String> getErrors() {
        if ( errors == null ) errors = new ArrayList<>();
        return errors;
    }
}
