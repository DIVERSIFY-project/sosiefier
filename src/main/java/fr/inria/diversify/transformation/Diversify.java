package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import org.codehaus.plexus.util.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify {

    protected String projectDir;
    protected String tmpDir;
    protected List<Transformation> transformations;
    protected Set<Thread> threadSet;
    protected String srcDir;
    protected boolean clojureTest;
    protected int timeOut;
    protected AbstractTransformationQuery transQuery;

    public Diversify(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.tmpDir = "output_diversify";
        this.srcDir = "src/main/java";
        this.projectDir = projectDir;
        clojureTest = false;
        timeOut = 200;

        transformations = new ArrayList<Transformation>();
    }

    public void run(int n) throws Exception {
        String dir = prepare(projectDir, tmpDir);

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            run(transQuery.getTransformation(), dir);
        }
//        FileUtils.forceDelete(new File(dir));
    }

    public void run(List<Transformation> trans) throws Exception {
        String dir = prepare(projectDir, tmpDir);
        for (Transformation tran : trans) {
            run(tran, dir);
        }
        FileUtils.forceDelete(new File(dir));
    }

    protected void run(Transformation trans, String tmpDir) throws Exception {
        initThreadGroup();
        System.out.println("output dir: " + tmpDir + "/" + srcDir);
        try {
            trans.apply(tmpDir + "/" + srcDir);
            int failures = runTest(tmpDir);
            trans.setJUnitResult(failures);
            transformations.add(trans);

        } catch (Exception e) {
            System.out.println("compile error ");

        }
        trans.restore(tmpDir + "/" + srcDir);
        killUselessThread();

    }

    public void printResult(String output) {
        try {
            writeTransformation(output + System.currentTimeMillis() + "_transformation.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        StatisticDiversification stat = new StatisticDiversification(transformations);
//        stat.writeStat(output);
    }

    public void writeTransformation(String FileName) throws IOException, JSONException {
        if (transformations.isEmpty())
            return;
        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));
        JSONArray obj = new JSONArray();
        for (Transformation transformation : transformations) {
            try {
                obj.put(transformation.toJSONObject());
            } catch (Exception e) {}
        }
        out.write(obj.toString());
        out.newLine();
        out.close();
    }

    protected String prepare(String dirSource, String dirTarget) throws IOException, InterruptedException {
        String dir = dirTarget + "/tmp_" + System.currentTimeMillis();
//        FileUtils.copyDirectory(new File(dirSource), new File(dir));
        copyDirectory(new File(dirSource), new File(dir));
        return dir;
    }

    protected Integer runTest(String directory) throws InterruptedException, CompileException {
        RunMaven rt = new RunMaven(directory, "test", clojureTest);
        rt.start();
        int count = 0;
        while (rt.getFailures() == null && count < timeOut) {
            count++;
            Thread.sleep(1000);
        }
        System.out.println(rt.getCompileError() + " " + rt.allTestRun() + " " + rt.getFailures());
        if (rt.getCompileError())
            throw new CompileException("error ");

        if (!rt.allTestRun())
            return -1;
        return rt.getFailures();
    }

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
        killChild();
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (!threadSet.contains(thread)) {
                thread.stop();
            }
        }
    }

    protected void copyDirectory(File sourceLocation, File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }

            String[] children = sourceLocation.list();
            for (String aChildren : children) {
                copyDirectory(new File(sourceLocation, aChildren),
                        new File(targetLocation, aChildren));
            }
        } else {
            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);

            // Copy the bits from instream to outstream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
    }

    public void setTmpDirectory(String tmpDir) {
        this.tmpDir = tmpDir;
    }

    public void setClojureTest(Boolean clojureTest) {
        this.clojureTest = clojureTest;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setSourceDirectory(String sourceDirectory) {
        this.srcDir = sourceDirectory;
    }

    public void killChild() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("pkill -TERM -P " + pid);
            p.waitFor();

        } catch (Exception e) {}

    }
}
