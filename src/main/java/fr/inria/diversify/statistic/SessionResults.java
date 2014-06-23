package fr.inria.diversify.statistic;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Class to store information of a session (i.e several runs of a Diversified program)
 *
 * Created by marcel on 22/06/14.
 */
public class SessionResults {

    private String beginTime;

    /**
     * Transformation size of a Run Result. As for now this number is constant during the whole session
     */
    private int transformationSize;

    /**
     * Amount of sosies found during the session
     */
    private int sosieCount;

    /**
     * Amount of failed tests runs during the session
     */
    private int testFailedCount;

    /**
     * Amount of build compile failed  runs during the session
     */
    private int compileFailedCount;

    /**
     * List of results for every run in this session.
     *
     * Note: do not expose runResults. Some calculations are made when adding and removing results and can be affected
     * if the array is exposed, i.e witha getRunResults method or similar.
     */
    //private ArrayList<RunResults> runResults;

    /**
     * Add a run result
     * @param results
     */
    public void addRunResults(RunResults results) {
        //runResults.add(results);
        if ( results.getStatus() == 0 ) sosieCount++;
        else if ( results.getStatus() == -1 ) testFailedCount++;
        else if ( results.getStatus() == -2 ) compileFailedCount++;
        transformationSize = results.getTransformationSize();
    }

    public SessionResults() {
        sosieCount = 0;
        testFailedCount = 0;
        compileFailedCount = 0;

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");
        Date date = new Date();
        beginTime = dateFormat.format(date);
        //runResults = new ArrayList<>();
    }

    /**
     * Save a text report of the session behavior.
     *
     * @param report
     */
    public void saveReport(String report) throws IOException {
        File f = new File(report);
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write("Total trials: " + (sosieCount + compileFailedCount + testFailedCount) + "\r\n");
            fw.write("Transformation size: " + transformationSize + "\r\n");
            fw.write("Sosies: " + sosieCount+ "\r\n");
            fw.write("Test failed trials: " + testFailedCount+ "\r\n");
            fw.write("Compile failed trials: " + compileFailedCount+ "\r\n");
        } finally {
            if ( fw != null ) fw.close();
        }
    }

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
}
