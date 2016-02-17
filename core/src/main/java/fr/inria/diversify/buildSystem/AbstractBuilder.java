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

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 14:12
 */
public abstract class AbstractBuilder {

    //Directory where the builder is going to be saved in case the user requested
    private String saveOutputDir;

    protected String directory;

    //Was there a compile error?
    protected boolean compileError;

    //Did all the test run
    protected boolean allTestRun;

    //Goals of the compiler
    protected String[] goals;

    //setting file for the compiler
    protected File setting;

    //Errors that we are OK with...
    protected List<String> acceptedErrors;

    //-3 nothing
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

    public AbstractBuilder(String directory) {
        this.directory = directory;
        failedTests = new ArrayList<>();
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
        failedTests = new ArrayList<>();
    }

    public void runBuilder() throws InterruptedException {
        runBuilder(null);
    }

    public void runBuilder(final String[] goals) throws InterruptedException {
        initThreadGroup();
        reset();
        Thread thread = new Thread() {
            public void run() {
                runPrivate(goals, true);
            }
        };
        thread.start();
        thread.join(1000 * timeOut);
        thread.interrupt();
        killUselessThread();
    }



    public void initTimeOut() throws InterruptedException {
        timeOut = runGoals(goals, true) * 4;
        Log.debug("timeOut init: " + timeOut);
    }

    public void startAndroidEmulation() throws InterruptedException {
        Log.debug("start android emulator");
        runGoals(new String[]{"android:emulator-start", "-Dandroid.emulator.avd=myandroid",
                "-Dandroid.emulator.options=\"-no-window -no-audio -no-boot-anim -wipe-data\"", "-Dandroid.emulator.wait=100000"}, false);
    }

    public void stopAndroidEmulation() throws InterruptedException {
        Log.debug("stop android emulator");
        runGoals(new String[]{"android:emulator-stop-all"}, false);
    }

    public int runGoals(final String[] goals, final boolean verbose) throws InterruptedException {
        initThreadGroup();
        reset();

        Thread thread = new Thread() {
            public void run() {
                runPrivate(goals, verbose);
            }
        };
        thread.start();

        int time = 0;
        while (status == -3) {
            time++;
            Thread.sleep(1000);
        }
        Log.debug("timeOut init: " + time);
        thread.interrupt();
        //See if we are in windows and not call this
        killUselessThread();

        return time;
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
     */
    protected abstract void runPrivate(String[] goals, boolean verbose);

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
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("pkill -P " + pid);

            Thread.sleep(1000);
        } catch (Exception e) {
            Log.error("killallchildren ", e);
        }
        Log.debug("all children process kill (pid: {})", pid);
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

    public void setGoals(String[] goals) {
        this.goals = goals;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setAcceptedErrors(List<String> ae) {
        acceptedErrors = ae;
    }

    public int getTimeOut() {
        return timeOut;
    }

    /**
     * Resets the locate count
     */
    public void resetRunCount() {

    }

    /**
     * Number of times the locate has been run
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

//    public void setStatus(int status) {
//        this.status = status;
//    }


    public String getDirectory() {
        return directory;
    }
}
