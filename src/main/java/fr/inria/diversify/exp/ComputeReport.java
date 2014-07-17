package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.sosie.compare.CompareAllStackTrace;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.TestReport;
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
    String sosieSosieSummary = "";
    String originalSosieSummary = "";

    Report globalSosieSosieReport;
    Report globalOriginalSosieReport;
    Report originalReport;

    String logSosieDirectory;

    public static void main(String[] args) throws Exception {
//        Log.DEBUG();
        String resultDirectory = args[3];
        String sosiesDirectory = args[0];
        ComputeReport computeReport = new ComputeReport();
        computeReport.setLogSosieDirectory(args[1]);
        computeReport.setOriginalReport(new Report(computeReport.loadJSON(args[2])));

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
        Log.info("globalFilterOriginalSosieReport: ");

        File file = new File(directory + "sosieSosieSummary");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(sosieSosieSummary);
        writer.close();

        file = new File(directory + "originalSosieSummary");
        file.createNewFile();
        writer = new FileWriter(file);
        writer.write(originalSosieSummary);
        writer.close();

        file = new File(directory + "_sosieSosie_Report.json");
        file.createNewFile();
        writer = new FileWriter(file);
        globalSosieSosieReport.toJSON().write(writer);
        writer.close();

        file = new File(directory + "_OriginalSosie_Report.json");
        file.createNewFile();
        writer = new FileWriter(file);

        globalOriginalSosieReport.toJSON().write(writer);

        writeCSVReport(originalReport.buildAllTest(),
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

                    Log.info("compare sosie/sosie");
                    Report sosieSosieReport = buildReportFor(sosie, false);

                    Log.info("compare sosie/original");
                    Report originalSosieReport = buildReportFor(sosie, true);

                    if(sosieSosieReport.size() > originalReport.size()/2
                            && originalSosieReport.size() > originalReport.size()/2) {

                        writeCSVReport(originalReport.buildAllTest(),
                                       originalSosieReport.buildAllTest(),
                                       sosieSosieReport.buildAllTest(),
                                       resultDir.getAbsolutePath() + "/" + sosie.getName()+ ".csv");


                        sosieSosieSummary += sosie.getName() + ": \n" + sosieSosieReport.summary() + "\n";
                        globalSosieSosieReport = updateGlobalReport(globalSosieSosieReport, sosieSosieReport);

                        originalSosieSummary += sosie.getName() + ": \n" + originalSosieReport.summary() + "\n";
                        globalOriginalSosieReport = updateGlobalReport(globalOriginalSosieReport, originalSosieReport);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    protected Report updateGlobalReport(Report global, Report update) {
        if(global == null) {
            global = new Report(update);
        } else {
            global.merge(update);
        }
        return global;
    }

    protected Report buildReportFor(File programDirectory, boolean withSosie) throws Exception {
        Report reports;

        if(withSosie) {
            reports = buildReportFor(programDirectory, logSosieDirectory);
        } else {
            File newLodDir = new File(programDirectory.getAbsolutePath()+"/oldLog");
            File originalLodDir = new File(makeLogFor(programDirectory));
            moveLogFile(newLodDir,originalLodDir);
            reports = buildReportFor(programDirectory, newLodDir.getAbsolutePath());
        }
        return reports;
    }

    protected Report buildReportFor(File programDirectory, String sosieLogDir) throws Exception {
        int oldSize = 1;
        int newSize;

        String originalLodDir = makeLogFor(programDirectory);
        Log.info("compare trace for {} with {}", originalLodDir, sosieLogDir);
        CompareAllStackTrace un = new CompareAllStackTrace(originalLodDir, sosieLogDir, null);
        un.findDiff();
        Report report = un.getReport();

        newSize = report.size();

        while(oldSize != newSize) {
            originalLodDir = makeLogFor(programDirectory);
            un = new CompareAllStackTrace(sosieLogDir,originalLodDir, null);
            un.findDiff();
            Log.debug(report.summary());
            report.merge(un.getReport());
            oldSize = newSize;
            newSize = report.size();
        }

        Log.info(report.summary());
        Log.info("remove log file");
        deleteLog(new File(originalLodDir));

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

    public void setLogSosieDirectory(String logSosieDirectory) {
        this.logSosieDirectory = logSosieDirectory;
    }

    public void setOriginalReport(Report originalReport) {
        this.originalReport = originalReport;
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

    protected void writeCSVReport(TestReport o, TestReport so, TestReport ss, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        Map<String, String> oPoint = o.pointReport();
        Map<String, Integer> oExec = o.getNbOfExec();
        Map<String, String> soPoint = so.pointReport();
        Map<String, Integer> soExec = so.getNbOfExec();
        Map<String, String> ssPoint = ss.pointReport();
        Map<String, Integer> ssExec = ss.getNbOfExec();
        Set<String> allPoint = new HashSet();
        allPoint.addAll(oPoint.keySet());
        allPoint.addAll(soPoint.keySet());

        writer.write("point;OO;OOExec;SS;SSExec;OS;OSExec\n");
        for(String point : allPoint) {
            writer.write(point + ";");
            writer.write(oPoint.get(point)+";");
            writer.write(oExec.get(point)+";");

            writer.write(ssPoint.get(point)+";");
            writer.write(ssExec.get(point)+";");

            writer.write(soPoint.get(point)+";");
            writer.write(soExec.get(point)+"\n");
        }
        writer.close();
    }

}
