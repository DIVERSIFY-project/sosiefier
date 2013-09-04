package fr.inria.diversify;

import fr.inria.diversify.transformation.CompileException;
import fr.inria.diversify.transformation.RunMaven;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.*;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 9/2/13
 * Time: 3:05 PM
 */
public abstract class Builder {
    protected String projectDir;
    protected String tmpDir;
    protected List<Transformation> transformations;
    protected Set<Thread> threadSet;
    protected String srcDir;
    protected boolean clojureTest;
    protected int timeOut;
    protected AbstractTransformationQuery transQuery;

    public abstract void run(int n) throws Exception;

    public abstract void run(List<Transformation> trans) throws Exception;

    public void printResult(String output) {
        try {
            String fileName = output + System.currentTimeMillis() + "_transformation.json";
            writeTransformation(fileName);
            Log.info("write result in {}",fileName);
        } catch (Exception e) {
            Log.error("error in Main.printResult",e);
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
        Log.info("compile error: " + rt.getCompileError() + ", run all test: " + rt.allTestRun() + ", number of failure: " + rt.getFailures());
        if (rt.getCompileError())
            throw new CompileException("compile error in maven");

        if (!rt.allTestRun())
            return -1;
        return rt.getFailures();
    }

    public void initTimeOut() throws InterruptedException {
        initThreadGroup();
        RunMaven rt = new RunMaven(projectDir, "test", clojureTest);
        rt.start();
        timeOut = 0;
        int factor = 3;
        while (rt.getFailures() == null) {
            timeOut = timeOut + factor;
            Thread.sleep(1000);
        }
        Log.debug("timeOut init: " + timeOut);
        killUselessThread();
    }

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
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

    public void setClojureTest(boolean clojureTest) {
        this.clojureTest = clojureTest;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setSourceDirectory(String sourceDirectory) {
        this.srcDir = sourceDirectory;
    }
}
