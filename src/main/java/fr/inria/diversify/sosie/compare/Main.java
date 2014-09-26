package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.sosie.compare.diff.CallDiff;
import fr.inria.diversify.sosie.compare.diff.Diff;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.SpoonCompiler;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 18/04/14.
 */
public class Main {
    private String dirOriginal;
    private String diffToExclude;
    private String dirSosie;
    private InputConfiguration inputConfiguration;

    public static void main(String[] args) throws Exception {

        Main clm = new Main();
        clm.init(args);
    }


    protected void init(String[] args) throws Exception {

        inputConfiguration = new InputConfiguration(args[0]);

        initLogLevel();
//        try {
//            if(inputConfiguration.getProperty("builder").equals("maven")) {
//                MavenDependencyResolver t = new MavenDependencyResolver();
//                t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");
//            }
//        } catch (Exception e) {}

//        initSpoon();

        dirOriginal = inputConfiguration.getProperty("dirOriginal");
        dirSosie = inputConfiguration.getProperty("dirSosie");
        diffToExclude = inputConfiguration.getProperty("excludeDiff");

        if(inputConfiguration.getProperty("logTrace").equals("same"))
            same();
        else
            diff();
    }

    protected void same() throws Exception {
        try {
            String previousReport = inputConfiguration.getProperty("previousReport");
            JSONObject pr = null;
            if(previousReport != null && new File(previousReport).exists()) {
                pr = loadJSON(previousReport);
            }
            CompareAllStackTrace un = new CompareAllStackTrace(dirOriginal, dirSosie, false);
            Set<Diff> diff = un.findDiff();

//            Log.debug(un.summary());
            writeDiff(inputConfiguration.getProperty("result") + "/excludeDiff", diffUnion(diff, un.getDiffToExclude()));
//            writeReport(inputConfiguration.getProperty("result") + "/report", un.buildReport());

        } catch (Exception e) {
            Log.error("error",e);
            e.printStackTrace();
        }
    }


    protected void diff() throws Exception {
        try {
            String previousReport = inputConfiguration.getProperty("previousReport");
            JSONObject pr = null;
            if(previousReport != null) {
                pr = loadJSON(previousReport);
            }
            CompareAllStackTrace un = new CompareAllStackTrace(dirOriginal, dirSosie, false);
            Set<Diff> diff = un.findDiff();

//            Log.debug(un.summary());
            writeDiff(inputConfiguration.getProperty("result") + "/excludeDiff", diff);
//            writeReport(inputConfiguration.getProperty("result") + "/report", un.buildReport());

        } catch (Exception e) {
            Log.error("error",e);
            e.printStackTrace();
        }
    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = inputConfiguration.getProperty("project") + "/" + inputConfiguration.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler c = new JDTBasedSpoonCompiler(factory);

        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                Log.error("error in initSpoon", e);
            }
        try {
            c.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void writeDiff(String fileName, Collection<Diff> diffs) throws IOException {
        Log.debug("write diff in {}", fileName);
        Log.debug("number of diff: {}", diffs.size());
        File file = new File(fileName);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        for(Diff diff : diffs) {
            diff.write(writer);
            writer.write("\n");
        }
        writer.close();
    }

    protected void writeReport(String fileName, JSONObject report) throws IOException, JSONException {

        Log.debug("write report in {}.json", fileName);
        File file = new File(fileName+".json");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        writer.write(report.toString());

        writer.close();

//        file = new File(fileName+".txt");
//        file.createNewFile();
//        writer = new FileWriter(file);
//
//        writer.write(compareTraces.summary());
//
//        writer.close();
    }

    protected Set<Diff> diffUnion(Collection<Diff> diffs1, Collection<Diff> diffs2) {
        Set<Diff> union = new HashSet<>();
        Map<StackTraceCall, Integer> callDiffs = new HashMap<>();
        Set<Diff> tmp = new HashSet<>(diffs1);
        tmp.addAll(diffs2);

        //init of callDiffs
        for(Diff diff : tmp) {
            if (diff instanceof CallDiff) {
                int nbCallDiff = ((CallDiff) diff).getMaxStackDiff();
                StackTraceCall key = diff.getDiffStart();
                if (callDiffs.containsKey(key)) { callDiffs.put(key, Math.max(callDiffs.get(key), nbCallDiff)); }
                else { callDiffs.put(key, nbCallDiff); }
            } else {
                union.add(diff);
            }
        }

        for(StackTraceCall ste : callDiffs.keySet()) {
            union.add(new CallDiff(ste, callDiffs.get(ste)));
        }
        return union;
    }

    protected JSONObject loadJSON(String file) throws IOException, JSONException {
        Log.debug("load json file: {}", file);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }

       return new JSONObject(sb.toString());
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(inputConfiguration.getProperty("logLevel"));
        Log.set(level);
    }
}
