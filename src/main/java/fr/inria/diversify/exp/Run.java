package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.TestReport;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Simon on 18/07/14.
 */
public class Run {


    public static void main(String[] args) throws Exception {
        String originalDir = args[0];
        String sosiesDir = args[1];
        String resultDir = args[2];
        String toDelete = args[3];
        String[] clients = Arrays.copyOfRange(args, 4, args.length);

        Run run = new Run();

        run.makeReportAndOLog(originalDir);

        for(String client : clients) {
            run.runProgram(originalDir, true);
            run.makeReportAndOLog(client);

            File clientDir = new File(client);
            File clientResultDir = new File(resultDir + "/" + clientDir.getName());
            if(!clientResultDir.exists()) {
                clientResultDir.mkdirs();
            }

            ComputeReportForClient computeReport = new ComputeReportForClient();
            computeReport.setToRemove(new File(toDelete));
            computeReport.setClient(new File(client));
            computeReport.setLogSosieDirectory(client+"/oLog");
            computeReport.buildAllReport(new File(sosiesDir), clientResultDir);
            computeReport.writeSummary(clientResultDir.getAbsolutePath());
            FileUtils.copyFile(new File(clientResultDir.getAbsolutePath() + "/*.csv"),
                               new File(resultDir + "/" +clientDir.getName() + ".csv"));

        }
        File result = new File(resultDir + "/sosie");

        if(!result.exists()) {
            result.mkdirs();
        }

        ComputeReport computeReport = new ComputeReport();
        computeReport.setLogSosieDirectory(originalDir + "/oLog");

        computeReport.buildAllReport(new File(sosiesDir), result);
        computeReport.writeSummary(result.getAbsolutePath());
        FileUtils.copyFile(new File(result + "/globalReport.csv"),
                           new File(resultDir + "/original.csv"));

        File toRemove = new File(toDelete);
        if(toRemove.exists())
            FileUtils.forceDelete(toRemove);
    }



    protected void runProgram(String programDirectory, boolean install) throws Exception {
        MavenBuilder builder = new MavenBuilder(programDirectory, "src/main/java");

        builder.setTimeOut(100);
        if(install) {
            builder.setPhase(new String[]{"clean", "test"});

        } else {
            builder.setPhase(new String[]{"clean", "install"});
        }
        builder.runBuilder();
        int status = builder.getStatus();

        int count = 0;
        while(status != 0 && count < 5) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        if(status != 0) {
            throw new Exception("error during the build of " + programDirectory);
        }
    }

    protected void makeReportAndOLog(String originalDir) throws Exception {
        makeReport(originalDir);

        runProgram(originalDir, false);
        File logDir = new File(originalDir + "/log");
        File oLogDir = new File(originalDir + "/oLog");
        if(oLogDir.exists()) {
            FileUtils.forceDelete(oLogDir);
        }
        FileUtils.forceMkdir(oLogDir);
        FileUtils.copyDirectory(logDir, oLogDir);

        for(File file : oLogDir.listFiles()) {
            if(!(file.getName().equals("id") || file.getName().startsWith("logmain"))) {
                FileUtils.forceDelete(file);
            }
        }
    }

    protected void makeReport(String originalDir) throws Exception {
        ComputeOriginalReport computeReport = new ComputeOriginalReport();

        Report report = computeReport.buildReportFor(new File(originalDir), false);

        Log.info("report of {}: {}", originalDir, report.summary());

        TestReport allTest = report.buildAllTest();
        computeReport.writeCSVReport(allTest,allTest, originalDir + "/report.csv");
    }
}
