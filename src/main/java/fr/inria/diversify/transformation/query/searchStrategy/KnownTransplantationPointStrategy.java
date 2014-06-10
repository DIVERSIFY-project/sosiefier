package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;

/**
 * Search for transplantation points where we know there is at least one sosie
 *
 * Created by marcel on 6/06/14.
 */
public class KnownTransplantationPointStrategy extends SearchStrategy {


    public KnownTransplantationPointStrategy(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public CodeFragmentList findFragments() {
        return null;
    }
}
