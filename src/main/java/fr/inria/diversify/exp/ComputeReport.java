package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.CompareAllStackTrace;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeReport {
    String diffToExclude;
//    Map<String,Report> globalReport;
//    Map<String, Map<String,Report>> globalReport;
//    Map<String, Map<String,Report>> globalReport;

    String logSosieDirectory;

    public static void main(String[] args) throws IOException {
       ComputeReport computeReport = new ComputeReport();
       computeReport.setDiffToExclude(args[1]);

        if(args.length == 4) {
            computeReport.setLogSosieDirectory(args[2]);
        }
        Map<String, Map<String, Report>> reportInternal = computeReport.buildAllReport(new File(args[0]), false);
        computeReport.writeSummary(reportInternal, args[0] + "/reportInternal");

        Map<String, Map<String, Report>> reportWhitSosie = computeReport.buildAllReport(new File(args[0]), true);
        computeReport.writeSummary(reportWhitSosie, args[0]+"/reportWithSosie");
    }

    public Map<String, Map<String,Report>> buildAllReport(File programsDir, boolean withSosie) {
        Map<String, Map<String,Report>> reports = new HashMap();

        for(File sosie : programsDir.listFiles()) {
            if(sosie.isDirectory()) {
                try {
                    Log.info("update report with {}",sosie.getName());
                    reports.put(sosie.getName(), buildReportFor(sosie, withSosie));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return reports;
    }

    public void writeSummary(Map<String, Map<String,Report>> reports, String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        Report global = buildGlobalReport(reports);
        writer.write("global:\n" + global + "\n");
        Log.info("global: {}", global.summary());

        for(String key : reports.keySet()) {
            writer.write(key + ":\n");
            writer.write(reports.get(key).get("allTest").summary() + "\n");
        }
        writer.close();
    }

    protected Report buildGlobalReport(Map<String, Map<String,Report>> reports) {
        Report global = null;
        for(String key : reports.keySet()) {
            if(global == null) {
                global = new Report(reports.get(key).get("allTest"));
            }
            global.merge2(reports.get(key).get("allTest"));
        }
        return global;
    }

    protected Map<String, Report> buildReportFor(File programDirectory, boolean withSosie) throws Exception {
        Map<String, Report> reports;

        if(withSosie) {
            reports = buildReportFor(programDirectory, logSosieDirectory);
        } else {
            File originalLodDir = new File(programDirectory.getAbsolutePath()+"/log");
            File newLodDir = new File(programDirectory.getAbsolutePath()+"/oldLog");
            makeLogFor(programDirectory);
            moveLogFile(newLodDir,originalLodDir);
            reports = buildReportFor(programDirectory, newLodDir.getAbsolutePath());
        }
        return reports;
    }

    protected Map<String, Report> buildReportFor(File programDirectory, String sosieLogDir) throws Exception {
        String originalLodDir = programDirectory.getAbsolutePath()+"/log";
        Map<String, Report> report = new HashMap();
        int oldSize = 1;
        int newSize;

        makeLogFor(programDirectory);
        CompareAllStackTrace un = new CompareAllStackTrace(originalLodDir, sosieLogDir, diffToExclude, null);
        un.findDiff();
        report = un.reports();
        Log.debug(un.summary());
        report = mergeReports(report, un.reports());
        newSize = report.entrySet().stream()
                        .mapToInt(entry -> entry.getValue().size())
                        .sum();

        while(oldSize != newSize) {
            makeLogFor(programDirectory);
            un = new CompareAllStackTrace(originalLodDir, sosieLogDir, diffToExclude, null);
            un.findDiff();
            report = un.reports();
            Log.debug(un.summary());
            report = mergeReports(report, un.reports());
            oldSize = newSize;
            newSize = report.entrySet().stream()
                            .mapToInt(entry -> entry.getValue().size())
                            .sum();
        }

        Log.info(report.get("allTest").summary());
        return report;
    }

    protected Map<String,Report> mergeReports(Map<String, Report> report1, Map<String, Report> report2) {
        for(String key : report2.keySet()) {
            if(report1.containsKey(key)) {
                report1.get(key).merge2(report2.get(key));
            } else {
                report1.put(key,report2.get(key));
            }
        }
        return report1;
    }

    protected void makeLogFor(File programDirectory) throws Exception {
        File logDir = new File(programDirectory.getAbsolutePath()+"/log");

        deleteLog(logDir);
        runProgram(programDirectory);

        deleteUselessLog(logDir);
    }

    protected void runProgram(File directory) throws Exception {
        MavenBuilder builder = new MavenBuilder(directory.getAbsolutePath(), "src/main/java");

        builder.setTimeOut(100);
        builder.setPhase(new String[]{"clean", "test"});
        builder.runBuilder();
        int status = builder.getStatus();

        int count = 0;
        while(status != 0 && count < 5) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        if(status != 0) {
            throw new Exception("error during the build of " + directory.getAbsolutePath());
        }
    }

    protected void moveLogFile(File oldDir, File newDir) throws IOException {
        if(oldDir.exists()) {
           FileUtils.forceDelete(oldDir);
        }
        FileUtils.forceMkdir(oldDir);
        FileUtils.copyDirectory(newDir, oldDir);
    }

    protected void deleteUselessLog(File logDirectory) throws IOException {
        for(File file : logDirectory.listFiles()) {
            String fileName = file.getName();
            if(fileName.startsWith("logThread")
                    || fileName.startsWith("logTime")
                    || fileName.startsWith("logpool")
                    || fileName.startsWith("logFinalizer")) {
                FileUtils.forceDelete(file);
            }
        }
    }

    protected void deleteLog(File logDirectory) throws IOException {
        for(File file : logDirectory.listFiles()) {
            String fileName = file.getName();
            if(!fileName.equals("id")) {
                FileUtils.forceDelete(file);
            }
        }
    }

    public void setDiffToExclude(String diffToExclude) {
        this.diffToExclude = diffToExclude;
    }

    public void setLogSosieDirectory(String logSosieDirectory) {
        this.logSosieDirectory = logSosieDirectory;
    }

    protected JSONObject loadJSON(String file) throws IOException, JSONException {
        Log.debug("load json file: {}", file);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return new JSONObject(sb.toString());
    }
}
