package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.Pool;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 03/02/15.
 */
public class MakeFilter {
    public static void main(String args[]) throws IOException, InterruptedException, JSONException {
        Log.DEBUG();
        int n = Integer.parseInt(args[2]);
        String p1dir = args[0];
        String p2dir = args[1];


        MakeFilter mk = new MakeFilter();
        Set<String> diffs = mk.loadFilter(args[3]);

        for(int i = 0; i < n; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir);
            mk.runProgram(p2dir);
            List<TestDiff> testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            diffs.addAll(mk.buildFilter(testdiff));
        }
        mk.printFilter(diffs, args[4]);
    }

    protected void runProgram(String dir) throws IOException, InterruptedException {
        Log.info("run {}", dir);
        File log = new File(dir + "/log/");
        FileUtils.forceDelete(log);
        log.mkdir();
        (new File(log +"/id")).createNewFile();

        MavenBuilder builder = new MavenBuilder(dir);
        builder.runGoals(new String[]{"clean", "test"}, false);
    }

    public List<TestDiff> compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(dirOriginalLog);
        Collection<Test> testSosie = reader.loadLog(dirSosieLog);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);

        return  comparator.compare();
    }

    public void filter(List<TestDiff> diff, Map<String, Set<String>> filter) {
        diff.stream()
            .filter(d -> filter.containsKey(d.getSignature()))
            .forEach(d -> d.filter(filter.get(d.getSignature())));
    }


    public Set<String> loadFilter(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Set<String> filter = new HashSet<>();

        String line = reader.readLine();
        while(line != null) {
            filter.add(line);
            line = reader.readLine();
        }
        return filter;
    }

    public Set<String> buildFilter(List<TestDiff> diffs) {
        Set<String> filter = new HashSet<>();
        for(TestDiff d : diffs) {
            filter.addAll(d.buildFilter());
        }
        return filter;
    }

    public void printFilter(Set<String> diffs, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
            diffs.stream()
                 .distinct()
                .forEach(f -> {
                    try {
                        fw.append(f + "\n");
                    } catch (Exception e) {}
                });

        fw.close();
    }
}
