package fr.inria.diversify;

import fr.inria.diversify.logger.branch.Coverage;
import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 28/05/15
 * Time: 10:16
 */
public class SimpleLoadLog {

    public static void main(String args[]) throws IOException {
        CoverageReader reader = new CoverageReader(args[0]);

        List<String> cl = new ArrayList<>();
        for(int i = 2; i < args.length; i++) {
            cl.add(args[i]);
        }

        Coverage coverage1 = reader.load();
        Log.info("total nb of branch: {}", coverage1.getAllBranch(cl).size());

        Log.info("coverage1: {}", coverage1.coverage(cl));
        Log.info("nb branch covered: {}", coverage1.getCoverageBranch(cl).size());
        coverage1.csv("coverage1.csv");

        reader = new CoverageReader(args[1]);
        Coverage coverage2 = reader.load();

        System.out.print("\n\n");
        Log.info("coverage2: {}", coverage2.coverage(cl));
        Log.info("nb branch covered: {}", coverage2.getCoverageBranch(cl).size());
        coverage2.csv("coverage2.csv");

        System.out.print("\n\n");
        Log.info("distance: {}", coverage1.distance(coverage2));
    }
}
