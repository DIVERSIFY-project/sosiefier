package fr.inria.diversify.transformation.builder;

import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.util.Set;

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 14:12
 */
public abstract class AbstractBuilder {
    protected String srcDir;
    protected String directory;
    protected boolean compileError;
    protected boolean allTestRun;
    String[] phases;
    protected Integer failure;
    protected int timeOut = -1;
    protected boolean clojureTest;
    protected Set<Thread> threadSet;


    public AbstractBuilder(String directory,String srcDir) {
        this.directory = directory;
        this.srcDir = srcDir;
    }

    protected void reset() {
        compileError = false;
        allTestRun = false;
       failure = null;
    }

    public void runBuilder() throws InterruptedException {
        initThreadGroup();
        reset();
        Thread thread = new Thread() {
            public void run() {
                runPrivate();
            }
        };
        thread.start();
        thread.join(1000 * timeOut);
        thread.interrupt();
        killUselessThread();
    }

    public void initTimeOut() throws InterruptedException {
        initThreadGroup();
        reset();
        Thread thread = new Thread() {
            public void run() {
                runPrivate();
            }
        };
        thread.start();

        int tmpTimeOut = 0;
        int factor = 12;
        while (failure == null) {
            tmpTimeOut = tmpTimeOut + factor;
            Thread.sleep(1000);
        }
        Log.debug("timeOut init: " + tmpTimeOut);
        timeOut = tmpTimeOut;
        thread.interrupt();
        killUselessThread();
    }

    public void initPom(String newPomFile) throws Exception {
        if(timeOut == -1)
            throw new Exception("timeout not set");
        FileUtils.copyFile(new File(newPomFile), new File(directory + "/pom.xml"));
    }

    protected abstract void runPrivate();

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    protected void killUselessThread() {
        killAllChildrenProcess();
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (!threadSet.contains(thread)) {
                thread.interrupt();
            }
        }
    }

    protected void killAllChildrenProcess() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("pkill -P " +pid);

            Thread.sleep(1000);
        } catch (Exception e) {
            Log.error("killallchildren ",e);
        }
        Log.debug("all children process kill");
    }

    public Integer getFailures() {
        return failure;
    }

    public boolean allTestRun() {
        return allTestRun;
    }

    public boolean getCompileError() {
        return compileError;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setClojureTest(boolean clojureTest) {
        this.clojureTest = clojureTest;
    }

    public void setPhase(String[] phases) {
        this.phases = phases;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
