package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;

/**
 * Performs a simple random search strategy
 *
 * Created by marcel on 6/06/14.
 */
public class SimpleRandomStrategy extends SearchStrategy {

    public SimpleRandomStrategy(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public CodeFragmentList findFragments() {
        return null;
    }
}
