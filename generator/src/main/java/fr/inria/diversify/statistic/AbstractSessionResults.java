package fr.inria.diversify.statistic;


import java.io.IOException;

/**
 * Created by Simon on 28/08/14.
 */
public abstract class AbstractSessionResults {

    //Name of the session. Mostly the project being run
    protected String name;

    protected String beginTime;

    /**
     * Amount of sosies found during the session
     */
    protected int sosieCount;

    /**
     * Amount of failed tests runs during the session
     */
    protected int testFailedCount;

    /**
     * Amount of locate compile failed  runs during the session
     */
    protected int compileFailedCount;

    /**
     * Amount of locate compile failed  runs during the session
     */
    protected int execSosieCount;


    public abstract void saveReport(String report) throws IOException;

    public int getSosieCount() {
        return sosieCount;
    }

    public int getTestFailedCount() {
        return testFailedCount;
    }

    public int getCompileFailedCount() {
        return compileFailedCount;
    }

    /**
     * A nice string with the time of the construction of the session
     */
    public String getBeginTime() {
        return beginTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        String ret = "name: " + name + "\n";
        ret += "\ttrial: " + (testFailedCount + sosieCount + compileFailedCount);
        ret += "\n\texec sosie: " + execSosieCount;
        ret += "\n\tsosie: " + sosieCount;
        ret += "\n\tcompile: " + (sosieCount + testFailedCount);
        ret += "\n\tnot compile: " + compileFailedCount;

        return ret;
    }
}
