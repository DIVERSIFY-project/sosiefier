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
public abstract class TransformationsOutput {

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
    protected List<SectionOutput> sections;

    /**
     * Build the transformation output object
     *
     * @param sections        Sections writing to storage
     * @param uri             URI of the storage
     * @param transformations Transformations to write
     */
    public TransformationsOutput(Collection<Transformation> transformations, String uri, List<SectionOutput> sections) {
        this.sections = sections;
        this.uri = uri;
        this.transformations = transformations;
    }

    /**
     * Build the transformation output object
     *
     * @param sections Sections writing to storage
     * @param uri      URI of the storage
     */
    public TransformationsOutput(String uri, List<SectionOutput> sections) {
        this.sections = sections;
        this.uri = uri;
        this.transformations = new ArrayList<>();
    }

    /**
     * Build the transformation output object
     *
     * @param transformations Transformations to write
     * @param uri             URI of the storage
     */
    public TransformationsOutput(Collection<Transformation> transformations, String uri) {
        this.sections = new ArrayList<>();
        this.uri = uri;
        this.transformations = transformations;
    }

    /**
     * Adds a section
     *
     * @param section
     */
    public void addTransformation(SectionOutput section) {
        sections.add(section);
    }

    /**
     * Adds a transformation to persist
     *
     * @param transformation Transformation to persist
     */
    public void addTransformation(Transformation transformation) {
        transformations.add(transformation);
    }

    /**
     * Prepares the section for output. Override this method to initialize the sections
     *
     * @param s
     */
    protected abstract void prepareSection(SectionOutput s);

    /**
     * Perform initialize operations BEFORE all sections has started to storage
     */
    protected abstract void initialize();

    /**
     * Perform close operations AFTER all sections has finish writing to storage
     */
    protected abstract void close();

    /**
     * Write the transformations to storage
     */
    public void write() {
        initialize();
        for (SectionOutput s : sections) {
            prepareSection(s);
            s.before(transformations);
        }
        for (Transformation t : transformations) sections.forEach(s -> s.write(t));

        sections.forEach(s -> s.after());
        close();
        /*
            for ( SectionOutput s : sections ) {
                System.out.println(t.getClass().getSimpleName() + " " + s.getClass().getSimpleName());
                s.write(t);
            }
            */
    }
}
