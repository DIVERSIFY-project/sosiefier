package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.random.Random;

/**
 * Performs a simple random search strategy
 *
 * Created by marcel on 6/06/14.
 */
public class SimpleRandomStrategy extends SearchStrategy {

    public SimpleRandomStrategy(InputProgram inputProgram) {
        super(inputProgram);
    }

    /**
     * Find code fragments to replace, i.e, transplantation points
     *
     * @return
     */
    @Override
    public CodeFragmentList findFragments () {
        Random r = new Random();

        //Obtain fragments from input program
        CodeFragmentList inputFragments = getInputProgram().getCodeFragments();
        int size = inputFragments.size();

        //Obtain coverage report from input program
        ICoverageReport report = getInputProgram().getCoverageReport();

        //Get some random fragments
        CodeFragmentList result = new CodeFragmentList();

        int attempts = 0;
        while ( result.size() < getPointCount() && attempts < size) {
            CodeFragment stmt = inputFragments.get(r.nextInt(size));
            //Check that the fragment is not added twice and that complies with all rules
            if ( !result.contains(stmt) && complies(stmt) ) { result.add(stmt); }
            attempts++;
        }

        return result;
    }

}
