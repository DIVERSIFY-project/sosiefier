package fr.inria.diversify.buildSystem;

import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 14:12
 */
public abstract class AbstractBuilder {

    //Directory containing the source
    protected String srcDir;

    //Directory where the builder is going to be saved in case the user requested
    private String saveOutputDir;

    protected String directory;

    //Was there a compile error?
    protected boolean compileError;

    //Did all the test run
    protected boolean allTestRun;

    //Phases of the compiler
    protected String[] phases;

    //setting file for the compiler
    protected File setting;

    //List containing all errors
    protected List<String> errors;

    //Errors that we are OK with...
    protected List<String> acceptedErrors;

    //-3 nothing ¿?
    //-2 not compile
    //-1 compile, error in test
    //0 compile, all test green
    protected Integer status = -3;

    //Time out in milliseconds to stop the compiler
    protected int timeOut = -1;

    protected boolean clojureTest;

    protected Set<Thread> threadSet;

    //Number of time the run builder has been called
    protected int runCount;

    //Save the output to file for further analysis?
    private boolean saveOutputToFile;

    public void setSaveOutputToFile(boolean value) {
        saveOutputToFile = value;
    }

    /**
     * Gets wheter output to file for further analysis or not
     *
     * @return
     */
    public boolean getSaveOutputToFile() {
        return saveOutputToFile;
    }

    protected List<String> failedTests;

    public List<String> getFailedTests() {
        return failedTests;
    }


//    /**
//     * Resettable latch to wait for the builder
//     */
//    protected CountDownLatch latch;

    public AbstractBuilder(String directory, String srcDir) {
        this.directory = directory;
        this.srcDir = srcDir;
        errors = new ArrayList<>();
        acceptedErrors = new ArrayList<>();
        runCount = 0;
        saveOutputToFile = false;
        saveOutputDir = "buildoutput";
//        latch = new CountDownLatch(1);
    }

    protected void reset() {
        compileError = false;
        allTestRun = false;
        status = -3;
        errors = new ArrayList<>();
    }

    public void runBuilder() throws InterruptedException {

        /*
        if (System.getProperty("os.name").contains("Windows")) {
            //Increases the number
            reset();
            runCount++;
            runPrivate();
        } else {
        */

            initThreadGroup();
            reset();
            runCount++;
            Thread thread = new Thread() {
                public void run() {
                    runPrivate();
                }
            };
            thread.start();
            //Wait until the maven thread is over...
//            latch.await();
//            latch = new CountDownLatch(1);

            thread.join(1000 * timeOut);

            thread.interrupt();
            //So we can kill it afterwards
            killUselessThread();
        //}
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
        int factor = 6;
        while (status == -3) {
            tmpTimeOut = tmpTimeOut + factor;
            Thread.sleep(1000);
        }
        Log.debug("timeOut init: " + tmpTimeOut);
        timeOut = tmpTimeOut;
        thread.interrupt();
        //See if we are in windows and not call this
        killUselessThread();
    }

    public void copyClasses(String classes) throws IOException {
        String[] tmp = classes.split("target");
        File destDir = new File(directory+"/"+tmp[0]+"/classes2");
        File classesDir = new File(directory+"/"+classes);
        FileUtils.deleteDirectory(destDir);
        FileUtils.copyDirectory(classesDir, destDir);
    }

    public void initPom(String newPomFile) throws Exception {
        if (timeOut == -1)
            throw new Exception("timeout not set");
        FileUtils.copyFile(new File(newPomFile), new File(directory + "/pom.xml"));
    }

    /**
     * Method to run in the compiler's thread
     *
     * @remark: IMPORTANT: latch.countDown() MUST BE CALLED FROM THE runPrivate Implementation. Otherwise ill never stop...
     */
    protected abstract void runPrivate();

    protected void initThreadGroup() {
        threadSet = Thread.getAllStackTraces().keySet();
    }

    /**
     * Kill the maven thread that may be hang in Linux
     */
    protected void killUselessThread() {
        if (!System.getProperty("os.name").contains("Windows")) {
            killAllChildrenProcess();
            for (Thread thread : Thread.getAllStackTraces().keySet()) {
                if (!threadSet.contains(thread)) {
                    thread.interrupt();
                }
            }
        }
    }

    protected void killAllChildrenProcess() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("PID :" + pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("pkill -P " + pid);

            Thread.sleep(1000);
        } catch (Exception e) {
            Log.error("killallchildren ", e);
        }
        Log.debug("all children process kill");
    }

    protected void saveOutputToFile(String output) {
        try {
            if (saveOutputToFile) {

                File f = new File(getSaveOutputDir());
                if (!f.exists()) {
                    f.mkdirs();
                }
                File newTextFile = new File(getSaveOutputDir() + "/buidOutput" + runCount + ".txt");

                FileWriter fileWriter = new FileWriter(newTextFile);
                fileWriter.write(output);
                fileWriter.close();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
            //Log.warn("Cannot save output for run " + runCount);
        }
    }

    public Integer getStatus() {
        return status;
    }

    public List<String> getTestFail() {
        return errors;
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

    public void setAcceptedErrors(List<String> ae) {
        acceptedErrors = ae;
    }

    /**
     * Resets the build count
     */
    public void resetRunCount() {

    }

    /**
     * Number of times the build has been run
     *
     * @return
     */
    public int getRunCount() {
        return runCount;
    }

    /**
     * Directory where the builder is going to be saved in case the user request so
     *
     * @return
     */
    public String getSaveOutputDir() {
        return saveOutputDir;
    }

    public void setSaveOutputDir(String saveOutputDir) {
        this.saveOutputDir = saveOutputDir;
    }

    public void setSetting(File setting) {
        this.setting = setting;
    }
}
