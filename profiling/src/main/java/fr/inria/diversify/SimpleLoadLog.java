package fr.inria.diversify;

import fr.inria.diversify.logger.branch.Coverage;
import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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


        List<Integer> list = coverage1.getMethodCoverages().stream()
                .filter(mc -> cl.stream().anyMatch(c -> mc.getMethodName().startsWith(c + "_")))
                .map(mc -> mc.getAllPath().size())
                .collect(Collectors.toList());

        double count = list.size();

        Log.info("mean path: {}", list.stream()
                .mapToInt(i -> i)
                .sum()/count);

        Log.info("median path: {}", median(list));

        Log.info("max path: {}", list.stream()
                .mapToInt(i -> i)
                .max().getAsInt());

        Log.info("nb total path: {}", list.stream()
                .mapToInt(i -> i)
                .sum());


        reader = new CoverageReader(args[1]);
        Coverage coverage2 = reader.load();

        System.out.print("\n\n");
        Log.info("coverage2: {}", coverage2.coverage(cl));
        Log.info("nb branch covered: {}", coverage2.getCoverageBranch(cl).size());
        coverage2.csv("coverage2.csv");

        list = coverage2.getMethodCoverages().stream()
                .filter(mc -> cl.stream().anyMatch(c -> mc.getMethodName().startsWith(c + "_")))
                .map(mc -> mc.getAllPath().size())
                .collect(Collectors.toList());

       count = list.size();

        Log.info("mean path: {}", list.stream()
                .mapToInt(i -> i)
                .sum()/count);

        Log.info("median path: {}", median(list));

        Log.info("max path: {}", list.stream()
                .mapToInt(i -> i)
                .max().getAsInt());

        Log.info("nb total path: {}", list.stream()
                .mapToInt(i -> i)
                .sum());


        Log.info("distance: {}", coverage1.distance(coverage2));
    }

    protected static int median(Collection<Integer> collection) {
        List<Integer> list = collection.stream()
                .sorted()
                .collect(Collectors.toList());

        return list.get(list.size()/2);
    }

    protected static void load(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        long i = reader.loadTest().stream()
                .filter(test -> test.getCoverage().getMethodCoverages().stream()
                    .anyMatch(mc -> mc.getMethodName().contains("encode(")))
                .count();

        Log.info(""+i);
    }

}
