package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.Transformation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Simon on 28/08/14.
 */
public class SinglePointSessionResults extends AbstractSessionResults {



    public SinglePointSessionResults() {
        sosieCount = 0;
        testFailedCount = 0;
        compileFailedCount = 0;

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");
        Date date = new Date();
        beginTime = dateFormat.format(date);
        name = "uknown project";
    }

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
