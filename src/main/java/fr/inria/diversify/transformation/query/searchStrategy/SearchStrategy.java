package fr.inria.diversify.transformation.query.searchStrategy;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;

/**
 * Super class for all transplantation points search strategies
 *
 * Created by marcel on 7/06/14.
 */
public abstract class SearchStrategy {

    private int pointCount = 1;

    private InputProgram inputProgram;

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
    }

    /**
     * Finds the fragments
     * @return The list with all the code fragments found
     */
    public abstract CodeFragmentList findFragments();


}
