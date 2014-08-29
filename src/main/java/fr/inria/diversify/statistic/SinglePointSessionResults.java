package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.Transformation;

/**
 * Created by Simon on 28/08/14.
 */
public class SinglePointSessionResults extends AbstractSessionResults {

    /**
     * Add a run result
     *
     * @param results
     */
    public void addRunResults(Transformation results) {

        if (results.getStatus() == 0) {
            sosieCount++;
        } else if (results.getStatus() == -1) {
            testFailedCount++;
        } else if (results.getStatus() == -2) {
            compileFailedCount++;
        }
    }
}
