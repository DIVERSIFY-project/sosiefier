package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.diff.CallDiff;
import fr.inria.diversify.sosie.compare.diff.Diff;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
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

    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        Main clm = new Main();
        clm.init();
    }

    protected void init() throws Exception {
        initLogLevel();
        try {
            if(DiversifyProperties.getProperty("builder").equals("maven")) {
                MavenDependencyResolver t = new MavenDependencyResolver();
                t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
            }
        } catch (Exception e) {}

        initSpoon();

        dirOriginal = DiversifyProperties.getProperty("dirOriginal");
        dirSosie = DiversifyProperties.getProperty("dirSosie");
        diffToExclude = DiversifyProperties.getProperty("excludeDiff");

        if(DiversifyProperties.getProperty("logTrace").equals("same"))
            same();
        else
            diff();
    }

    protected void same() throws Exception {
        try {
            CompareAllStackTrace un = new CompareAllStackTrace(dirOriginal, dirSosie, diffToExclude);
            Set<Diff> diff = un.findDiff();
            writeDiff(DiversifyProperties.getProperty("result") + "/excludeDiff",  diffUnion(diff, un.getDiffToExclude()));
            String previousReport = DiversifyProperties.getProperty("previousReport");
            if(previousReport != null) {
                writeReport(DiversifyProperties.getProperty("result") + "/report.json", un.buildReport(loadJSON(previousReport)));
            } else {
                writeReport(DiversifyProperties.getProperty("result") + "/report.json", un.buildReport());
            }

        } catch (Exception e) {
            Log.error("error",e);
            e.printStackTrace();
        }
    }


    protected void diff() throws Exception {
        try {
            CompareAllStackTrace un = new CompareAllStackTrace(dirOriginal, dirSosie, diffToExclude);
            Set<Diff> diff = un.findDiff();
            writeDiff(DiversifyProperties.getProperty("result")+"/excludeDiff",diff);
        } catch (Exception e) {
            Log.error("error",e);
            e.printStackTrace();
        }
    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
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
        File file = new File(fileName);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        for(Diff diff : diffs) {
            diff.write(writer);
            writer.write("\n");
        }
        writer.close();
    }

    protected void writeReport(String fileName, JSONObject jsonObject) throws IOException {
        Log.debug("write report in {}", fileName);
        File file = new File(fileName);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        writer.write(jsonObject.toString());
        writer.close();
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
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }
}
