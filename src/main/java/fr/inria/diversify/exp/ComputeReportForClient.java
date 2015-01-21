package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeReportForClient extends ComputeReport {
    protected File client;
    Map<String, Set<String>> errorClient;

    public ComputeReportForClient() {
        super();
        errorClient = new HashMap();
    }

    public static void main(String[] args) throws Exception {
        String resultDirectory = args[3];
        String sosiesDirectory = args[0];
        ComputeReportForClient computeReport = new ComputeReportForClient();
        computeReport.setClient(new File(args[1]));
//        computeReport.setOriginalLogDirectory(new File(args[2]));


        computeReport.buildAllReport(new File(sosiesDirectory), new File(resultDirectory));
        computeReport.writeSummary(resultDirectory);
    }


    public void buildAllReport(File sosiesDir, File resultDir) throws IOException {
        for(File sosie : sosiesDir.listFiles()) {
            if(sosie.isDirectory()) {
                try {
                    Log.info("locate report for {} with the sosie {}",client, sosie.getName());
                    setPartialLogging(sosie, false);
                    installProgram(sosie);

                    File sosieLogDir2 = new File(client+"/oLog");
                    if(sosieLogDir2.exists()) {
                        FileUtils.forceDelete(sosieLogDir2);
                    }
                    FileUtils.forceMkdir(sosieLogDir2);

                    File sosieLogDir1 = new File(makeLogFor(client));
                    moveLogFile(sosieLogDir2,sosieLogDir1);
                    makeLogFor(client);
                    List<StackTrace> stackTrace1 = loadLog(sosieLogDir1, false);
                    List<StackTrace> stackTrace2 = loadLog(sosieLogDir2, false);

                    Log.info("compare sosie/sosie");
                    Report sosieSosieReport = compareTrace(stackTrace1, stackTrace2, false);

                    Log.info("compare sosie/original");
                    Report originalSosieReport = compareTrace(stackTrace1, originalLog, false);
                    try {
                        writeGoodDiff(resultDir.getAbsolutePath(), sosie.getName(), sosieSosieReport, originalSosieReport);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    writeCSVReport(
                            originalSosieReport.buildAllTest(),
                            sosieSosieReport.buildAllTest(),
                            resultDir.getAbsolutePath() + "/" + sosie.getName()+ ".csv");


                    if(sosieSosieReport.size() > minReportSize
                            && originalSosieReport.size() > minReportSize) {

                    sosieSosieSummary += sosie.getName() + ": \n" + sosieSosieReport.summary() + "\n";
                    globalSosieSosieReport = updateGlobalReport(globalSosieSosieReport, sosieSosieReport);

                    originalSosieSummary += sosie.getName() + ": \n" + originalSosieReport.summary() + "\n";
                    globalOriginalSosieReport = updateGlobalReport(globalOriginalSosieReport, originalSosieReport);
                    } else {
                        if(!errorClient.containsKey(client.getAbsolutePath())) {
                            errorClient.put(client.getAbsolutePath(),new HashSet());
                        }
                        errorClient.get(client.getAbsolutePath()).add(sosie.getAbsolutePath());
                    }
                } catch (Exception e) {
                    if(!errorClient.containsKey(client.getAbsolutePath())) {
                        errorClient.put(client.getAbsolutePath(),new HashSet());
                    }
                    errorClient.get(client.getAbsolutePath()).add(sosie.getAbsolutePath());
                }
            }
        }
    }

    protected void writeGoodDiff(String resultDir, String sosieName , Report ss, Report os) throws JSONException, IOException {
        Object map = os.getDiffVarPerTestFor(ss.getSameVarPerTest());

        JSONObject json = new JSONObject();
        json.put("sosie",sosieName);
        json.put("diff", map);

        FileWriter writer = new FileWriter(resultDir+"/"+sosieName+"_good.json");
        json.write(writer);
        writer.close();
    }

    protected void installProgram(File programDirectory) throws Exception {
        Log.info("install program: {}",programDirectory.getAbsoluteFile());
        MavenBuilder builder = new MavenBuilder(programDirectory.getAbsolutePath());

        builder.setTimeOut(600);
        builder.setSetting(localRepository);
        builder.setGoals(new String[]{"clean", "install" });
        builder.runBuilder();
        int status = builder.getStatus();

        int count = 0;
        while(status != 0 && count < 5) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        if(status != 0) {
            throw new Exception("error during the locate of " + programDirectory.getAbsolutePath());
        }
    }

    protected void writeErrorReport(String resultDir) throws IOException {
        File file = new File(resultDir + "/errorClientRepport");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        writer.write(errorClient.toString());
        writer.close();
    }

    public void setClient(File client) {
        this.client = client;
    }
}
