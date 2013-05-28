package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.statistic.StatisticDiversification;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify {

    protected String sourceDir;
    protected String tmpDir;
    protected CodeFragmentList codeFragments;
    protected CoverageReport coverageReport;
    protected List<Transformation> transformations;
    protected Set<Thread> threadSet;

    public Diversify(CodeFragmentList codeFragments, CoverageReport coverageReport, String sourceDir, String tmpDir) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        this.tmpDir = tmpDir;

        this.sourceDir = sourceDir;
    }

    public void run(int n) throws Exception {
        transformations = new ArrayList<Transformation>();
        int error = 0;
        prepare(sourceDir, tmpDir);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            initThreadGroup();

            Replace rp = new Replace(codeFragments, coverageReport, tmpDir);
            try {
                Transformation tf = rp.replace();
                List<String> errors = runTest(tmpDir);
                tf.setJUnitResult(errors);
                transformations.add(tf);
            }
            catch (Exception e) {
//                e.printStackTrace();
                System.out.println("compile error "+(error++));
            }
            rp.restore();
            killUselessThread();

        }
    }

    public void printResult(String output) {
        try {
            writeTransformation(output + "_transformation.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
        StatisticDiversification stat = new StatisticDiversification(transformations);
        stat.writeStat(output);
    }

    public void writeTransformation(String FileName) throws IOException, JSONException {
        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));

        for (int i = 0; i < transformations.size(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("Transformation_" + System.currentTimeMillis(), transformations.get(i).toJSONObject());
            out.write(obj.toString());
            out.newLine();
        }
        out.close();
    }

    protected void prepare(String dirSource, String dirTarget) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cp -r " + dirSource + " " + dirTarget);
        p.waitFor();
    }

    protected List<String> runTest(String directory) throws InterruptedException, CompileException {
        RunMaven rt = new RunMaven(directory, "test");
        rt.start();
        int count = 0;
        while (rt.getResult() == null && count < 30) {
            count++;
            Thread.sleep(1000);
        }
        if(rt.getCompileError())
            throw new CompileException("error ");

        return rt.getResult();
    }

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
        for(Thread thread: Thread.getAllStackTraces().keySet())  {
            if(!threadSet.contains(thread)) {
                thread.stop();
            }
        }
    }
}
