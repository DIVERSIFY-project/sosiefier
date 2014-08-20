package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.AbstractTransformation;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Class to store information of a session (i.e several runs of a Diversified program)
 * <p/>
 * Created by marcel on 22/06/14.
 */
public class SessionResults {

    private HashMap<Integer, int[]> runsPerSize;

    //Max incremental series number
    private int maxSeries = Integer.MIN_VALUE;

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
     * <p/>
     * Note: do not expose runResults. Some calculations are made when adding and removing results and can be affected
     * if the array is exposed, i.e witha getRunResults method or similar.
     */
    private HashMap<String, RunResults> runResults;

    //Build reports for the transformations
    private HashMap<String, String> buildReportsPath;

    //Build reports for the json files
    private HashMap<String, String> jsonFilesPath;

    /**
     * Add a run result
     *
     * @param results
     */
    public void addRunResults(RunResults results, String jsonFilePath, String buildPath) {
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

        maxSeries = maxSeries < results.getIncrementalSeries() ? results.getIncrementalSeries() : maxSeries;
        //maxSize =  maxSize < results.getTransformationSize() ? results.getTransformationSize() : maxSize;

        String s = results.getTransformationSize() + ";" + results.getIncrementalSeries();
        runResults.put(s, results);
        buildReportsPath.put(s, buildPath);
        jsonFilesPath.put(s,jsonFilePath);
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
        runResults = new HashMap<>();
        buildReportsPath = new HashMap<>();
        jsonFilesPath = new HashMap<>();
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
            StringBuilder out = new StringBuilder();
            out.append("<!DOCTYPE html>");
            out.append("<html>");
            out.append("<head>");
            out.append("<title>Execution Queue</title>");
            out.append("<style> table,th,td { border:1px solid black; border-collapse:collapse } </style>");
            out.append("</head>");
            out.append("<body>");

            try {
                //Build the series table
                ArrayList<Integer> sizes = new ArrayList<>(runsPerSize.keySet());
                Collections.sort(sizes);

                //Build the resume table
                StringBuilder tbl = new StringBuilder();
                tbl.append("<table style=\"width:300px\">").
                        append("<tr>").
                        append("<th>Transformation size</th>").
                        append("<th>Total trials</th>").
                        append("<th>Sosies</th>").
                        append("<th>Build failures</th>").
                        append("<th>Compilation errors</th>").
                        append("</tr>");
                for (int key : sizes) {
                    int[] r = runsPerSize.get(key);
                    tbl.append("<tr><td>").
                            append(key).append("</td><td>").
                            append(r[3]).append("</td><td>").
                            append(r[0]).append("</td><td>").
                            append(r[1]).append("</td><td>").
                            append(r[2]).append("</td></tr>");
                }
                tbl.append("</table>");

                out.append("<p>").append(getName()).append("</p>");
                out.append(tbl);
                out.append("<ul><li>Sosie total:").append(sosieCount).append("</li>");
                out.append("<li>Failure total:").append(testFailedCount).append("</li>");
                out.append("<li>Compilation errors:").append(compileFailedCount).append("</li></ul>");

                StringBuilder tbl2 = new StringBuilder("<table>\n" +
                        "  <tr>\n" +
                        "    <th>Status</th>\n" +
                        "    <th>Color</th>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>OK</td>\n" +
                        "    <td bgcolor=\"#44DD44\"></td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Test failed</td>\n" +
                        "    <td bgcolor=\"#FFDD44\"></td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Build failed</td>\n" +
                        "    <td bgcolor=\"#EE4444\"></td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Exception</td>\n" +
                        "    <td bgcolor=\"#BB8888\"></td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>No tested</td>\n" +
                        "    <td bgcolor=\"#FF88FF\"></td>\n" +
                        "  </tr>\n" +
                        "</table>");

                tbl2.append("<table> <tr> <th>ID</th>");
                for (int row = 0; row < sizes.size(); row++) {
                    tbl2.append("<th>").append(sizes.get(row)).append("</th>");
                }
                tbl2.append("</tr>");

                tbl2.append("<p>Legend</p>");

                for (int row = 0; row <= maxSeries; row++) {
                    tbl2.append("<tr>");
                    tbl2.append("<td>").append(row).append("</td>");
                    for (int col = 0; col < sizes.size(); col++) {
                        String color = "#FFFFFF";
                        String[] colors = {"#44DD44", "#FFDD44", "#EE4444", "#BB8888", "#FF88FF"};
                        String k = sizes.get(col) + ";" + row;
                        if (runResults.containsKey(k)) {
                            RunResults r = runResults.get(k);
                            int sIndex = r.getStatus();
                            if (sIndex <= 0 && sIndex >= AbstractTransformation.EXCEPTION) {
                                color = colors[Math.abs(sIndex)];
                                tbl2.append("<td bgcolor=").
                                        append(color).
                                        append("> SZ:").
                                        append(r.getTransformationSize()).
                                        append(" ID:").
                                        append(r.getIncrementalSeries()).
                                        append(" <a href=/").
                                        append(buildReportsPath.get(k)).
                                        append(">Build</a>").
                                        append(" <a href=/").
                                        append(jsonFilesPath.get(k)).
                                        append(">JSON</a>");
                            }
                        } else {
                            tbl2.append("<td>");
                        }
                        tbl2.append("</td>");
                    }
                    tbl2.append("</tr>");
                }
                out.append(tbl2);
            } catch (Exception e) {
                out.append("Ups! Something went wrong: ").
                        append(e.getClass().toString()).
                        append(" ").
                        append(e.getMessage());
            }
            out.append("</body>");
            out.append("</html>");
            fw = new FileWriter(f);
            fw.write(out.toString());
        } finally

        {
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
