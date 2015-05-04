package fr.inria.diversify.testamplification.branchcoverage;

import fr.inria.diversify.testamplification.branchcoverage.load.Coverage;
import fr.inria.diversify.testamplification.branchcoverage.load.CoverageReader;
import fr.inria.diversify.testamplification.branchcoverage.load.MethodCoverage;
import fr.inria.diversify.testamplification.branchcoverage.load.TestCoverage;
import fr.inria.diversify.util.Log;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 23/04/15
 * Time: 13:07
 */
public class ReaderMain {


    public static void main(String[] args) throws IOException {
        if(args.length == 1) {
            CoverageReader reader = new CoverageReader(args[0]);
            Coverage coverage = reader.load();

            coverage.info();
            Log.info("global coverage: {}", coverage.coverage());

            List<TestCoverage> result = reader.loadTest();
            Log.info("{}", result.size());
        } else {
            CoverageReader reader1 = new CoverageReader(args[0]);
            Coverage coverage1 = reader1.load();

            CoverageReader reader2 = new CoverageReader(args[1]);
            Coverage coverage2 = reader2.load();
            coverage1.info();

            Log.info("global coverage1: {}", coverage1.coverage());
            Log.info("global coverage2: {}", coverage2.coverage());

            Log.info("distance: {}", coverage1.distance(coverage2));
            Log.info("nbDiffPath: {}", coverage1.nbDiffPath(coverage2));
        }
    }
}
