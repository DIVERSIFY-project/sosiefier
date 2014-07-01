package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.CompareAllStackTrace;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeReportForClient extends ComputeReport{

    protected File client;

    public static void main(String[] args) throws Exception {
        String resultDirectory = args[4];
        String sosiesDirectory = args[0];
        ComputeReportForClient computeReport = new ComputeReportForClient();
//        computeReport.setDiffToExclude(args[1]);
        computeReport.setClient(new File(args[1]));
        computeReport.setLogSosieDirectory(args[2]);
        computeReport.setOriginalReport(computeReport.buildReport(computeReport.loadJSON(args[3])));

        Map<String, Map<String, Report>> reportInternal = computeReport.buildAllReport(new File(sosiesDirectory), false);
        computeReport.writeSummary(reportInternal, resultDirectory + "/reportInternal");

        Map<String, Map<String, Report>> reportWhitSosie = computeReport.buildAllReport(new File(sosiesDirectory), true);
        computeReport.writeSummary(reportWhitSosie, resultDirectory+"/reportWithSosie");

        computeReport.writeSummary(computeReport.removeKnowDiffInSosie(reportInternal,reportWhitSosie), resultDirectory+"/reportWithSosie2");
    }


    protected Map<String, Report> buildReportFor(File sosieDir, boolean withSosie) throws Exception {
        Map<String, Report> reports;

        if(withSosie) {
            reports = buildReportFor(sosieDir, logSosieDirectory);
        } else {
            File originalLodDir = new File(client.getAbsolutePath()+"/log");
            File newLodDir = new File(client.getAbsolutePath()+"/oldLog");
            makeLogFor(sosieDir);
            moveLogFile(newLodDir,originalLodDir);
            reports = buildReportFor(sosieDir, newLodDir.getAbsolutePath());
        }
        return reports;
    }

    protected Map<String, Report> buildReportFor(File sosieDir, String sosieLogDir) throws Exception {
        String originalLodDir = client.getAbsolutePath()+"/log";
        Map<String, Report> report;
        int oldSize = 1;
        int newSize;

        makeLogFor(sosieDir);
        CompareAllStackTrace un = new CompareAllStackTrace(originalLodDir, sosieLogDir, diffToExclude, null);
        un.findDiff();
        report = un.reports();
        Log.debug(un.summary());
        report = mergeReports(report, un.reports());
        newSize = report.entrySet().stream()
                        .mapToInt(entry -> entry.getValue().size())
                        .sum();

        while(oldSize != newSize) {
            makeLogFor(sosieDir);
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

    protected void makeLogFor(File sosieDir) throws Exception {
        File logDir = new File(client.getAbsolutePath()+"/log");

        deleteLog(logDir);

        installProgam(sosieDir);
        FileUtils.copyFileToDirectory(new File(sosieDir.getAbsolutePath()+"/log/id"), logDir);
        runClient();

        deleteUselessLog(logDir);
    }

    protected void installProgam(File programDirectory) throws Exception {
        MavenBuilder builder = new MavenBuilder(programDirectory.getAbsolutePath(), "src/main/java");

        builder.setTimeOut(100);
        builder.setPhase(new String[]{"clean", "install"});
        builder.runBuilder();
        int status = builder.getStatus();

        int count = 0;
        while(status != 0 && count < 5) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        if(status != 0) {
            throw new Exception("error during the build of " + programDirectory.getAbsolutePath());
        }
    }

    protected void runClient() throws Exception {
        runProgram(client);
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

    public void setClient(File client) {
        this.client = client;
    }
}
