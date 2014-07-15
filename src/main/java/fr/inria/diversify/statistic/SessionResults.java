package fr.inria.diversify.statistic;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/**
 * Class to store information of a session (i.e several runs of a Diversified program)
 * <p/>
 * Created by marcel on 22/06/14.
 */
public class SessionResults {

    private HashMap<Integer, int[]> runsPerSize;

    //Name of the session. Mostly the project being run
    private String name;

    private String beginTime;

    /**
     * Transformation size of a Run Result. As for now this number is constant during the whole session
     */
    //private int transformationSize;

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
     *
     * @param results
     */
    public void addRunResults(RunResults results) {
        //runResults.add(results);
        int[] r;
        if (!runsPerSize.containsKey(results.getTransformationSize())) {
            r = new int[4];
            Arrays.fill(r, 0);
            runsPerSize.put(results.getTransformationSize(), r);
        } else {
            r = runsPerSize.get(results.getTransformationSize());
        }
        if (results.getStatus() == 0) {
            sosieCount++;
            r[0]++;
        } else if (results.getStatus() == -1) {
            testFailedCount++;
            r[1]++;
        } else if (results.getStatus() == -2) {
            compileFailedCount++;
            r[2]++;
        }
        r[3]++;
        //transformationSize = results.getTransformationSize();
    }

    public SessionResults() {
        sosieCount = 0;
        testFailedCount = 0;
        compileFailedCount = 0;

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");
        Date date = new Date();
        beginTime = dateFormat.format(date);
        runsPerSize = new HashMap<>();
        name = "uknown project";
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
            //Build the table
            StringBuilder tbl = new StringBuilder();
            tbl.append("<table style=\"width:300px\">").
                    append("<tr>").
                    append("<th>Transformation size</th>").
                    append("<th>Total trials</th>").
                    append("<th>Sosies</th>").
                    append("<th>Build failures</th>").
                    append("<th>Compilation errors</th>").
                    append("</tr>");
            for (int key : runsPerSize.keySet()) {
                int[] r = runsPerSize.get(key);
                tbl.append("<tr><td>").
                        append(key).append("</td><td>").
                        append(r[3]).append("</td><td>").
                        append(r[0]).append("</td><td>").
                        append(r[1]).append("</td><td>").
                        append(r[2]).append("</td></tr>");
            }
            tbl.append("</table>");

            StringBuilder out = new StringBuilder();
            out.append("<!DOCTYPE html>");
            out.append("<html>");
            out.append("<head>");
            out.append("<title>Execution Queue</title>");
            out.append("<style> table,th,td { border:1px solid black; border-collapse:collapse } </style>");
            out.append("</head>");
            out.append("<body>");
            out.append("<p>").append(getName()).append("</p>");
            out.append(tbl);
            out.append("<ul><li>Sosie total:").append(sosieCount).append("</li>");
            out.append("<li>Failure total:").append(testFailedCount).append("</li>");
            out.append("<li>Compilation errors:").append(compileFailedCount).append("</li></ul>");
            out.append("</body>");
            out.append("</html>");

            fw = new FileWriter(f);
            fw.write(out.toString());
        } finally {
            if (fw != null) fw.close();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
