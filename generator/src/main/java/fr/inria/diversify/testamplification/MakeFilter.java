package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.sosie.logger.Instru;
import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.Filter;
import fr.inria.diversify.testamplification.compare.diff.Pool;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 03/02/15.
 */
public class MakeFilter {
    InputProgram inputProgram;


    public static void main(String args[]) throws IOException, InterruptedException, JSONException {
//        Log.DEBUG();
        int n = Integer.parseInt(args[2]);
        String p1dir = args[0];
        String p2dir = args[1];
        String out;

        MakeFilter mk = new MakeFilter();
        Filter filter;
        if(args.length == 5) {
            filter = new Filter(args[3]);
            out = args[4];
        } else {
            filter = new Filter();
            out = args[3];
        }

        for(int i = 0; i < n/3; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir, false);
            mk.runProgram(p2dir, false);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            filter.addFilter(testdiff.buildFilter());
            Log.info("filter size: {}", testdiff.size());
        }

        for(int i = 0; i < n/3; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir, true);
            mk.runProgram(p2dir, false);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            filter.addFilter(testdiff.buildFilter());
            Log.info("filter size: {}", testdiff.size());
        }
        for(int i = 0; i < n/3; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir, true);
            mk.runProgram(p2dir, true);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            filter.addFilter(testdiff.buildFilter());
            Log.info("filter size: {}", testdiff.size());
        }
        filter.print(out);

    }

    protected void runProgram(String dir, boolean clean) throws IOException, InterruptedException {
        Log.info("run {}", dir);
        File log = new File(dir + "/log/");
        FileUtils.forceDelete(log);
        log.mkdir();
        (new File(log +"/id")).createNewFile();

        MavenBuilder builder = new MavenBuilder(dir);
        if(clean) {
            builder.runGoals(new String[]{"clean", "test"}, false);
        } else {
            builder.runGoals(new String[]{"test"}, false);
        }
    }

    public Diff compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(dirOriginalLog);
        Collection<Test> testSosie = reader.loadLog(dirSosieLog);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);
        Diff diff = comparator.compare();
        Log.info("total point fix: {}", comparator.nbPointFix);
        Log.info("total point non fix: {}",comparator.nbPointNotFix);
        Log.info("total point: {}",comparator.nbPointNotFix +comparator.nbPointFix);
        return  diff;
    }

    /**
     * Initializes the InputProgram dataset
     */
    protected void  initInputProgram(InputConfiguration inputConfiguration) throws IOException, InterruptedException {
        inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setRelativeSourceCodeDir(inputConfiguration.getRelativeSourceCodeDir());

        if(inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc").split(System.getProperty("path.separator")));
            String sourcesDir = list.stream()
                    .map(src -> inputProgram.getProgramDir() + "/" + src)
                    .collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }

        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));
    }
}
