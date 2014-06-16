package fr.inria.diversify.transformation.query.searchRules;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.transformation.query.searchStrategy.SearchStrategy;

/**
 * Indicates that there is no repeated fragments in the pot (transplant point) set and the transplants set
 *
 * Created by marodrig on 16/06/2014.
 */
public class NotRepeatedFragments extends SearchRule {

    public NotRepeatedFragments(SearchStrategy potStrategy, SearchStrategy transplantStrategy) {
        super(potStrategy, transplantStrategy);
    }

    @Override
    public boolean comply(CodeFragment f) {
        CodeFragmentList fragments = potStrategy.findFragments();
        return !fragments.contains(f);
    }

}
