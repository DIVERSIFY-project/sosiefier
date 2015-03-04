package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.sosie.logger.Instru;
import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.Diff;
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

        for(int i = 0; i < n/3; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir, false);
            mk.runProgram(p2dir, false);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            diffs.addAll(testdiff.buildFilter());
        }

        for(int i = 0; i < n/3; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir, true);
            mk.runProgram(p2dir, false);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            diffs.addAll(testdiff.buildFilter());
        }
        for(int i = 0; i < n/3; i++) {
            Pool.reset();
            Log.info("run {}",i);
            mk.runProgram(p1dir, true);
            mk.runProgram(p2dir, true);
            Diff testdiff = mk.compare(p1dir + "/log", p2dir + "/log");
            diffs.addAll(testdiff.buildFilter());
        }
        mk.printFilter(diffs, out);
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

    protected String copyProgram(String tmpDir) throws IOException, JSONException {
        //Store the whole sosie program.
        try {


            String destPath = tmpDir + System.currentTimeMillis();
            (new File(destPath)).mkdirs();

            Instru instru = new Instru(inputProgram.getProgramDir(), inputProgram.getRelativeSourceCodeDir(),
                    inputProgram.getRelativeTestSourceCodeDir(), 6, destPath, null);
            instru.setMethodCall(false);
            instru.setVariable(false);
            instru.setError(false);
            instru.setNewTest(false);
            instru.instru();

            return destPath;


        } catch (IOException e) {
            //We may also don't want to recover from here. If no instrumentation possible... now what?
            throw new RuntimeException(e);
        }
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
