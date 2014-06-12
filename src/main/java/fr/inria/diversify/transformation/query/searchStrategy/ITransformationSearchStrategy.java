package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.transformation.Transformation;

import java.util.List;

/**
 * Interface that states that the search strategy may find transformations
 *
 * Created by marcel on 9/06/14.
 */
public interface ITransformationSearchStrategy {

    public List<Transformation> findTransformations();

}
