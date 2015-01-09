package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;

/**
 * Parent class for all sections of a persistent storage
 *
 * Created by marodrig on 08/01/2015.
 */
public abstract class SectionOuput {

    public abstract void write(Collection<Transformation> transformations);

}
