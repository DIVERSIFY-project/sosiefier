package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.CompareAllStackTrace;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeReportForClient extends ComputeReport {
    protected File toRemove;
    protected File client;

    public static void main(String[] args) throws Exception {
        String resultDirectory = args[3];
        String sosiesDirectory = args[0];
        ComputeReportForClient computeReport = new ComputeReportForClient();
        computeReport.setToRemove(new File(args[4]));
        computeReport.setClient(new File(args[1]));
        computeReport.setLogSosieDirectory(args[2]);


        computeReport.buildAllReport(new File(sosiesDirectory), new File(resultDirectory));
        computeReport.writeSummary(resultDirectory);
    }


    protected Report buildReportFor(File sosieDir, boolean withSosie) throws Exception {
        Report reports;
        if(toRemove.exists())
            FileUtils.forceDelete(toRemove);

        if(withSosie) {
            reports = buildReportFor(sosieDir, logSosieDirectory);
        } else {
            File originalLodDir = new File(client.getAbsolutePath()+"/log");
            File newLodDir = new File(client.getAbsolutePath()+"/oldLog");
            makeLogFor(sosieDir);
            moveLogFile(newLodDir,originalLodDir);
            reports = buildReportFor(sosieDir, newLodDir.getAbsolutePath());
        }
        if(toRemove.exists())
            FileUtils.forceDelete(toRemove);
        return reports;
    }

    protected Report buildReportFor(File sosieDir, String sosieLogDir) throws Exception {
        String originalLodDir = client.getAbsolutePath()+"/log";
        Report report;
        int oldSize = 1;
        int newSize;

        makeLogFor(sosieDir);
        CompareAllStackTrace un = new CompareAllStackTrace(originalLodDir, sosieLogDir, null);
        un.findDiff();
        report = un.getReport();
        newSize = report.size();

        while(oldSize != newSize) {
            makeLogFor(sosieDir);
            un = new CompareAllStackTrace(originalLodDir, sosieLogDir, null);
            un.findDiff();
            Log.debug(report.summary());
            report.merge(un.getReport());
            oldSize = newSize;
            newSize = report.size();
        }

        Log.info(report.summary());
        return report;
    }

    protected String makeLogFor(File sosieDir) throws Exception {
        File logDir = new File(client.getAbsolutePath()+"/log");

        deleteLog(logDir);

        installProgam(sosieDir);
        FileUtils.copyFileToDirectory(new File(sosieDir.getAbsolutePath()+"/log/id"), logDir);
        runClient();

        deleteUselessLog(logDir);

        return logDir.getAbsolutePath();
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

    public void setToRemove(File toRemove) {
        this.toRemove = toRemove;
    }
}
