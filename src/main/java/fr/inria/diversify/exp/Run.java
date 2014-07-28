package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.TestReport;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Simon on 18/07/14.
 */
public class Run {
    File localRepository;
    protected int minReportSize;

    public static void main(String[] args) throws Exception {
        String originalDir = args[0];
        String sosiesDir = args[1];
        String resultDir = args[2];
        String[] clients = Arrays.copyOfRange(args, 3, args.length);
//        Log.DEBUG();
        Run run = new Run();
        run.localRepository = run.makeTmpSetting(resultDir);

        Log.info("build report for original/original");
        List<StackTrace> originalLog = run.makeReportAndOLog(originalDir);

        File result = new File(resultDir + "/sosie");
        if(!result.exists()) {
            result.mkdirs();
        }

        Log.info("build report for sosie");
        ComputeReport computeReport = new ComputeReport();
        computeReport.setMinReportSize(run.minReportSize);
        computeReport.setOriginalLog(originalLog);

        computeReport.buildAllReport(new File(sosiesDir), result);
        computeReport.writeSummary(result.getAbsolutePath());
        FileUtils.copyFile(new File(result + "/globalReport.csv"),
                           new File(resultDir + "/original.csv"));


        for(String client : clients) {
            Log.info("build report for client: {}",client);
            FileUtils.copyFile(new File(originalDir+"/log/id"),new File(client+"/log/id"));
            run.setPartialLogging(originalDir, false);
            run.runProgram(originalDir, true);

          originalLog = run.makeReportAndOLog(client);

            File clientDir = new File(client);
            File clientResultDir = new File(resultDir + "/" + clientDir.getName());
            if(!clientResultDir.exists()) {
                clientResultDir.mkdirs();
            }

            run.setPartialLogging(client, false);

            ComputeReportForClient computeReportForClient = new ComputeReportForClient();
            computeReportForClient.setMinReportSize(run.minReportSize);
            computeReportForClient.setLocalRepository(run.localRepository);
            computeReportForClient.setClient(new File(client));
            computeReportForClient.setOriginalLog(originalLog);
            computeReportForClient.buildAllReport(new File(sosiesDir), clientResultDir);
            computeReportForClient.writeSummary(clientResultDir.getAbsolutePath());
            FileUtils.copyFile(new File(clientResultDir.getAbsolutePath() + "/globalReport.csv"),
                               new File(resultDir + "/" +clientDir.getName() + ".csv"));

        }

        if(run.localRepository.exists())
            FileUtils.forceDelete(run.localRepository);
    }

    protected void setPartialLogging(String dir, boolean partialLogging) throws IOException {
        FileWriter partialLoggingFile = new FileWriter(dir + "/log/partialLogging");

        partialLoggingFile.write(partialLogging+"");
        partialLoggingFile.close();
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
        while(status != 0 && count < 2) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        Log.info("run program: {}, install: {}, status: {}",programDirectory,install,builder.getStatus() );
        if(status != 0) {
            throw new Exception("error during the build of " + programDirectory);
        }
    }

    protected List<StackTrace> makeReportAndOLog(String originalDir) throws Exception {
        ComputeReport computeReport = new ComputeReport();
        computeReport.setLocalRepository(localRepository);
        Report  report = computeReport.buildOriginalReport(new File(originalDir));

        TestReport allTest = report.buildAllTest();
        computeReport.writeCSVReport(allTest,allTest, originalDir + "/report.csv");

        minReportSize = allTest.size();
        File originalLogDir = new File(originalDir + "/originalLog");
        if(originalLogDir.exists()) {
            FileUtils.forceDelete(originalLogDir);
        }
        originalLogDir.mkdirs();

        computeReport.moveLogFile(originalLogDir, new File(originalDir +"/log"));
        for(File file : originalLogDir.listFiles()) {
            if(!(file.getName().equals("id") || file.getName().startsWith("logmain"))) {
                FileUtils.forceDelete(file);
            }
        }
        return computeReport.loadLog(originalLogDir,false);
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
