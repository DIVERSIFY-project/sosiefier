package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.Pool;
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
        Set<String> diffs;
        String out;


        MakeFilter mk = new MakeFilter();
        if(args.length == 5) {
            diffs = mk.loadFilter(args[3]);
            out = args[4];
        } else {
            diffs = new HashSet<>();
            out = args[3];
        }

        for(int i = 0; i < n; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir);
            mk.runProgram(p2dir);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            diffs.addAll(testdiff.buildFilter());
        }
        mk.printFilter(diffs, out);
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

    public Diff compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(dirOriginalLog);
        Collection<Test> testSosie = reader.loadLog(dirSosieLog);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);

        return  comparator.compare();
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
