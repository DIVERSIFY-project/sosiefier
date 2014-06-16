package fr.inria.diversify.transformation.query.searchRules;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.query.searchStrategy.SearchStrategy;

/**
 * A search rule takes one or two search strategies ands implements a function that tells whether is correct or not
 * to add this
 *
 * Created by marodrig on 16/06/2014.
 */
public abstract class SearchRule {

    protected SearchStrategy potStrategy;

    protected SearchStrategy transplantStrategy;

    public SearchRule(SearchStrategy potStrategy, SearchStrategy transplantStrategy) {

        this.potStrategy = potStrategy;
        this.transplantStrategy = transplantStrategy;

        potStrategy.getRules().add(this);
        transplantStrategy.getRules().add(this);

    }

    /**
     * Indicates if the CodeFragment complies with the rule
     * @param f Code fragment to test
     * @return True if complies, false otherwise
     */
    public abstract boolean comply(CodeFragment f);

}
