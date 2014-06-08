package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragment;

/**
 * Super class for all transplantation points search strategies
 *
 * Created by marcel on 7/06/14.
 */
public abstract class SearchStrategy {

    /**
     * Finds a transplantation point to be replaced
     * @return A Code fragment which is the found transplantation point
     */
    public abstract CodeFragment findNextTransplantationPoint();

}
