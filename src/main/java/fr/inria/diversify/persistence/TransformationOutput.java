package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A class to output transformations. Consist of a set of TransformationSectionOuput that stores chunks of meta data
 * in different formats to an output, defined by a URI.
 * <p>
 * Created by marodrig on 08/01/2015.
 */
public abstract class TransformationOutput {

    /**
     * Uri of the output
     */
    protected final String uri;

    /**
     * Transformations to persist
     */
    protected final Collection<Transformation> transformations;

    /**
     * All sections of the persistence storage
     */
    protected List<SectionOuput> sections;

    /**
     * Build the transformation output object
     * @param sections Sections writing to storage
     * @param uri URI of the storage
     * @param transformations Transformations to write
     */
    public TransformationOutput(List<SectionOuput> sections, String uri, Collection<Transformation> transformations) {
        this.sections = sections;
        this.uri = uri;
        this.transformations = transformations;
    }

    /**
     * Build the transformation output object
     * @param sections Sections writing to storage
     * @param uri URI of the storage
     */
    public TransformationOutput(List<SectionOuput> sections, String uri) {
        this.sections = sections;
        this.uri = uri;
        this.transformations = new ArrayList<>();
    }


    /**
     * Adds a transformation to persist
     * @param transformation Transformation to persist
     */
    public void addTransformation(Transformation transformation) {
        transformations.add(transformation);
    }

    /**
     * Prepares the section for output. Override this method to initialize the sections
     * @param s
     */
    protected abstract void prepareSection(SectionOuput s);

    /**
     * Perform initialize operations BEFORE all sections has written to storage
     */
    protected abstract void initialize();

    /**
     * Perform close operations AFTER all sections has written to storage
     */
    protected abstract void close();

    /**
     * Write the transformations to storage
     */
    public void write() {
        initialize();
        for ( SectionOuput s : sections ) {
            prepareSection(s);
            s.write(transformations);
        }
        close();
    }
}
