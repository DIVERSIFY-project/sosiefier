package fr.inria.diversify.transformation.maven;

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 14:12
 */
public abstract class RunBuild extends Thread {
    protected String directory;
    protected boolean compileError = false;
    protected boolean allTestRun = false;
    String[] phases;
    protected Integer failure = null;
    protected int timeOut;
    protected boolean clojureTest;

    public abstract void run();

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

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setClojureTest(boolean clojureTest) {
        this.clojureTest = clojureTest;
    }

    public void setPhase(String[] phases) {
        this.phases = phases;
    }
}
