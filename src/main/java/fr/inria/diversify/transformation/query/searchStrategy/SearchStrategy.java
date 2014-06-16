package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.query.searchRules.SearchRule;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Super class for all transplantation points search strategies
 *
 * Created by marcel on 7/06/14.
 */
public abstract class SearchStrategy {

    private int pointCount = 1;

    private InputProgram inputProgram;

    private Collection<SearchRule> rules;

    /**
     * Input program over the search is going to be made
     */
    public InputProgram getInputProgram() {
        return inputProgram;
    }

    /**
     * Number of points to search for
     */
    public int getPointCount() {
        return pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }


    public SearchStrategy(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        this.pointCount = inputProgram.getTransformationPerRun();
        rules = new ArrayList<>();
    }

    /**
     * Indicate if the code fragment complies with all rules
     * @param cf
     * @return
     */
    protected boolean complies(CodeFragment cf) {
        for ( SearchRule r : rules ) {
            if ( !r.comply(cf) ) return false;
        }
        return true;
    }

    /**
     * Finds the fragments
     * @return The list with all the code fragments found
     */
    public abstract CodeFragmentList findFragments();

    /**
     * Rules governing the search
     * @return the collection of rules governing the search
     */
    public Collection<SearchRule> getRules() {
        return rules;
    }

    public void setRules(Collection<SearchRule> rules) {
        this.rules = rules;
    }
}
