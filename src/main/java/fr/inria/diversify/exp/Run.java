package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.TestReport;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Simon on 18/07/14.
 */
public class Run {
    File localRepository;

    public static void main(String[] args) throws Exception {
        String originalDir = args[0];
        String sosiesDir = args[1];
        String resultDir = args[2];
        String[] clients = Arrays.copyOfRange(args, 3, args.length);

        Run run = new Run();
        run.localRepository = run.makeTmpSetting(resultDir);

        Log.info("build report for sosie/sosie");
        run.makeReportAndOLog(originalDir);

        File result = new File(resultDir + "/sosie");

        if(!result.exists()) {
            result.mkdirs();
        }
        Log.info("build report for original/sosie");
        ComputeReport computeReport = new ComputeReport();
        computeReport.setLogSosieDirectory(originalDir + "/oLog");

        computeReport.buildAllReport(new File(sosiesDir), result);
        computeReport.writeSummary(result.getAbsolutePath());
        FileUtils.copyFile(new File(result + "/globalReport.csv"),
                           new File(resultDir + "/original.csv"));


        for(String client : clients) {
            Log.info("build report for client: {}",client);
            run.runProgram(originalDir, true);
            run.makeReportAndOLog(client);

            File clientDir = new File(client);
            File clientResultDir = new File(resultDir + "/" + clientDir.getName());
            if(!clientResultDir.exists()) {
                clientResultDir.mkdirs();
            }

            ComputeReportForClient computeReportForClient = new ComputeReportForClient();
            computeReportForClient.setLocalRepository(run.localRepository);
            computeReportForClient.setClient(new File(client));
            computeReportForClient.setLogSosieDirectory(client+"/oLog");
            computeReportForClient.buildAllReport(new File(sosiesDir), clientResultDir);
            computeReportForClient.writeSummary(clientResultDir.getAbsolutePath());
            FileUtils.copyFile(new File(clientResultDir.getAbsolutePath() + "/globalReport.csv"),
                               new File(resultDir + "/" +clientDir.getName() + ".csv"));

        }

        if(run.localRepository.exists())
            FileUtils.forceDelete(run.localRepository);
    }



    protected void runProgram(String programDirectory, boolean install) throws Exception {
        MavenBuilder builder = new MavenBuilder(programDirectory, "src/main/java");

        builder.setTimeOut(1000);
        builder.setSetting(localRepository);
        if(install) {
            builder.setPhase(new String[]{ "clean", "install"});
        } else {
            builder.setPhase(new String[]{ "clean", "test"});
        }
        builder.runBuilder();
        int status = builder.getStatus();

        int count = 0;
        while(status != 0 && count < 5) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        Log.info("run program: {}, install: {}, status: {}",programDirectory,install,builder.getStatus() );
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
        ComputeReport computeReport = new ComputeReport();
        computeReport.setLocalRepository(localRepository);
        Report report = computeReport.buildReportFor(new File(originalDir), false);

        Log.info("report of {}: {}", originalDir, report.summary());

        TestReport allTest = report.buildAllTest();
        computeReport.writeCSVReport(allTest,allTest, originalDir + "/report.csv");
    }

    protected File makeTmpSetting(String resultDirName) throws IOException {
        File resultDir = new File(resultDirName);
        if(!resultDir.exists()) {
            resultDir.mkdirs();
        }
        File localRepository = new File(resultDirName + "/repository_" +System.currentTimeMillis());
        if(localRepository.exists()) {
            FileUtils.forceDelete(localRepository);
        }
        localRepository.mkdirs();

        FileWriter writer = new FileWriter(resultDir + "/setting.xml");
        writer.write("<settings>\n\t<localRepository>");
        writer.write(localRepository.getAbsolutePath());
        writer.write("</localRepository>\n</settings>");
        writer.close();

        return localRepository;
    }
}
