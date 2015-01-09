package fr.inria.diversify.persistence;

import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;

/**
 * Created by marodrig on 09/01/2015.
 */
public abstract class TransformationsInput {

    public TransformationsInput(String uri, InputSectionLocator sectionFactory) {

    }

    public abstract Collection<Transformation> read();

}
