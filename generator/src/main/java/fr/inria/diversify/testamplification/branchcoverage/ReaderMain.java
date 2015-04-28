package fr.inria.diversify.testamplification.branchcoverage;

import fr.inria.diversify.testamplification.branchcoverage.load.Coverage;
import fr.inria.diversify.testamplification.branchcoverage.load.CoverageReader;
import fr.inria.diversify.testamplification.branchcoverage.load.MethodCoverage;
import fr.inria.diversify.util.Log;

import java.io.IOException;
import java.util.Collection;

/**
 * User: Simon
 * Date: 23/04/15
 * Time: 13:07
 */
public class ReaderMain {


    public static void main(String[] args) throws IOException {
        CoverageReader reader = new CoverageReader(args[0]);
        Coverage coverage = reader.load();

        coverage.info();
        Log.info("global coverage: {}", coverage.coverage());
    }
}
