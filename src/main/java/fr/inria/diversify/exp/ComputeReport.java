package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.CompareAllStackTrace;
import fr.inria.diversify.sosie.compare.StackElementTextReader;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.TestReport;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeReport {
    File localRepository;
    String sosieSosieSummary = "";
    String originalSosieSummary = "";

    Report globalSosieSosieReport;
    Report globalOriginalSosieReport;

    Set<String> errorSosie;

    List<StackTrace> originalLog;
    protected int minReportSize;

    public ComputeReport() {
        errorSosie = new HashSet<>();
    }

    public static void main(String[] args) throws Exception {
//        Log.DEBUG();
        ComputeReport computeReport = new ComputeReport();
        String resultDirectory = args[2];
        String sosiesDirectory = args[0];

//        computeReport.setOriginalLogDirectory(new File(args[1]));

        computeReport.buildAllReport(new File(sosiesDirectory), new File(resultDirectory));
        computeReport.writeSummary(resultDirectory);
    }

    public void writeSummary(String directory) throws IOException, JSONException {
        sosieSosieSummary += "global: \n" + globalSosieSosieReport.summary() + "\n";
        originalSosieSummary += "global: \n" + globalOriginalSosieReport.summary() + "\n";

        Log.info("globalSosieSosieReport: ");
        Log.info( globalSosieSosieReport.summary2());
        Log.info("globalOriginalSosieReport: ");
        Log.info( globalOriginalSosieReport.summary2());

        File file = new File(directory + "/sosieSosieSummary");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(sosieSosieSummary);
        writer.close();

        file = new File(directory + "/originalSosieSummary");
        file.createNewFile();
        writer = new FileWriter(file);
        writer.write(originalSosieSummary);
        writer.close();

        writeErrorReport(directory);

        writeCSVReport(
                       globalOriginalSosieReport.buildAllTest(),
                       globalSosieSosieReport.buildAllTest(),
                       directory + "/globalReport.csv");
        writer.close();
    }

    public void buildAllReport(File sosiesDir, File resultDir) throws IOException {
        for(File sosie : sosiesDir.listFiles()) {
            if(sosie.isDirectory()) {
                try {
                    Log.info("build report for {}",sosie.getName());
                    setPartialLogging(sosie, false);

                    File sosieLogDir2 = new File(sosie+"/oLog");
                    if(sosieLogDir2.exists()) {
                        FileUtils.forceDelete(sosieLogDir2);
                    }
                    FileUtils.forceMkdir(sosieLogDir2);

                    File sosieLogDir1 = new File(makeLogFor(sosie));
                    moveLogFile(sosieLogDir2,sosieLogDir1);
                    makeLogFor(sosie);
                    List<StackTrace> stackTrace1 = loadLog(sosieLogDir1, false);
                    List<StackTrace> stackTrace2 = loadLog(sosieLogDir2, false);

                    Log.info("compare sosie/sosie");
                    Report sosieSosieReport = compareTrace(stackTrace1, stackTrace2, false);

                    Log.info("compare sosie/original");
                    Report originalSosieReport = compareTrace(stackTrace1, originalLog, false);

                    if(sosieSosieReport.size() > minReportSize
                            && originalSosieReport.size() > minReportSize) {

                        writeCSVReport(
                                       originalSosieReport.buildAllTest(),
                                       sosieSosieReport.buildAllTest(),
                                       resultDir.getAbsolutePath() + "/" + sosie.getName()+ ".csv");


                        sosieSosieSummary += sosie.getName() + ": \n" + sosieSosieReport.summary() + "\n";
                        globalSosieSosieReport = updateGlobalReport(globalSosieSosieReport, sosieSosieReport);

                        originalSosieSummary += sosie.getName() + ": \n" + originalSosieReport.summary() + "\n";
                        globalOriginalSosieReport = updateGlobalReport(globalOriginalSosieReport, originalSosieReport);
                    }
                } catch (Exception e) {
                    Log.info("error for sosie: {}",sosie.getName());
                   errorSosie.add(sosie.getName());
                }
            }
        }
    }

    public List<StackTrace> loadLog(File dir, boolean recursive) throws IOException {
        return new StackElementTextReader().loadLog(dir.getAbsolutePath(), recursive);
    }

    protected Report buildOriginalReport(File originalDir) throws Exception {
        Log.info("compare orignal/orignal: {}", originalDir);

        File originalLogDir2 = new File(originalDir.getAbsolutePath()+"/oLog");
        if(originalLogDir2.exists()) {
            FileUtils.forceDelete(originalLogDir2);
        }
        FileUtils.forceMkdir(originalLogDir2);

        setPartialLogging(originalDir, false);

        File originalLogDir1 = new File(makeLogFor(originalDir));
        moveLogFile(originalLogDir2, originalLogDir1);
        makeLogFor(originalDir);
        List<StackTrace> stackTrace1 = loadLog(originalLogDir1, false);
        List<StackTrace> stackTrace2 = loadLog(originalLogDir2, false);

        return compareTrace(stackTrace1, stackTrace2, false);
    }

    protected Report updateGlobalReport(Report global, Report update) {
        if(global == null) {
            global = new Report(update);
        } else {
            global.merge(update);
        }
        return global;
    }

    protected Report compareTrace(List<StackTrace> sosieLog, List<StackTrace> originalLog, boolean partialTrace) throws Exception {
//        Log.info("compare trace for {} with {}", originalLogDir, sosieLogDir);
        CompareAllStackTrace un = new CompareAllStackTrace(originalLog, sosieLog, partialTrace);
        un.findDiff();
        Report report = un.getReport();

        Log.info(report.summary());

        return report;
    }

    protected String makeLogFor(File programDirectory) throws Exception {
        File logDir = new File(programDirectory.getAbsolutePath()+"/log");

        deleteLog(logDir);
        runProgram(programDirectory);

        deleteUselessLog(logDir);

        return logDir.getAbsolutePath();
    }

    protected void runProgram(File directory) throws Exception {
        Log.info("run program: {}",directory.getAbsoluteFile());
        MavenBuilder builder = new MavenBuilder(directory.getAbsolutePath(), "src/main/java");

        builder.setTimeOut(600);
        builder.setSetting(localRepository);
        builder.setPhase(new String[]{ "clean", "test"});
        builder.runBuilder();
        int status = builder.getStatus();

        int count = 0;
        while(status != 0 && count < 4) {
            count++;
            builder.runBuilder();
            status = builder.getStatus();
        }
        if(status != 0) {
            throw new Exception("error during the build of " + directory.getAbsolutePath());
        }
    }

    protected void moveLogFile(File destDir, File srcDir) throws IOException {
        if(destDir.exists()) {
           FileUtils.forceDelete(destDir);
        }
        FileUtils.forceMkdir(destDir);
        FileUtils.copyDirectory(srcDir, destDir);
    }

    protected void deleteUselessLog(File logDirectory) throws IOException {
        for(File file : logDirectory.listFiles()) {
            String fileName = file.getName();
            if(!fileName.startsWith("logmain_")
                    && !fileName.equals("id")
                    && !fileName.equals("partialLogging") ) {
                FileUtils.forceDelete(file);
            }
        }
    }

    protected void deleteLog(File logDirectory) throws IOException {
        for(File file : logDirectory.listFiles()) {
            String fileName = file.getName();
            if(!fileName.equals("id") && !fileName.equals("partialLogging")) {
                FileUtils.forceDelete(file);
            }
        }
    }

    public void setOriginalLog(List<StackTrace> originalLog) {
        this.originalLog = originalLog;
    }

    protected Map<String,TestReport> buildReport(JSONObject object) throws JSONException {
        Map<String,TestReport> report = new HashMap();

        Iterator it = object.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            JSONObject o = object.getJSONObject(key);
            report.put(key, new TestReport(o));
        }
        return report;
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

    protected void writeCSVReport(TestReport so, TestReport ss, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        Map<String, String> soPoint = so.pointReport();
        Map<String, Integer> soExec = so.getNbOfExec();
        Map<String, String> ssPoint = ss.pointReport();
        Map<String, Integer> ssExec = ss.getNbOfExec();
        Set<String> allPoint = new HashSet();
        allPoint.addAll(ssPoint.keySet());
        allPoint.addAll(soPoint.keySet());

        writer.write("point;SS;SSExec;OS;OSExec\n");
        for(String point : allPoint) {
            writer.write(point + ";");

            writer.write(ssPoint.get(point)+";");
            writer.write(ssExec.get(point)+";");

            writer.write(soPoint.get(point)+";");
            writer.write(soExec.get(point)+"\n");
        }
        writer.close();
    }

    protected void writeErrorReport(String resultDir) throws IOException {
        File file = new File(resultDir + "/errorSosieRepport");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(errorSosie.toString());
        writer.close();
    }

    protected void setPartialLogging(File dir, boolean partialLogging) throws IOException {
        FileWriter partialLoggingFile = new FileWriter(dir.getAbsolutePath() + "/log/partialLogging");

        partialLoggingFile.write(partialLogging+"");
        partialLoggingFile.close();
    }

    public void setLocalRepository(File localRepository) {
        this.localRepository = localRepository;
    }

    public void setMinReportSize(int minReportSize) {
        this.minReportSize = minReportSize;
    }
}
