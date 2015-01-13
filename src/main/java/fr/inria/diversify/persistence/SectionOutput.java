package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;

/**
 * Parent class for all sections of a persistent storage
 *
 * Created by marodrig on 08/01/2015.
 */
public abstract class SectionOutput {

    /**
     * The before method is called just before the writing starts.
     * This allows the sections outputs to prepare for writing
     * @param transformations
     */
    public abstract void before(Collection<Transformation> transformations);

    /**
     * Every transformation that is going to be stored is passed to
     * every section so it can add data to the section's storage
     * @param transformation
     */
    public abstract void write(Transformation transformation);

    /**
     * Method called after the writing process is over
     */
    public abstract void after();

}
