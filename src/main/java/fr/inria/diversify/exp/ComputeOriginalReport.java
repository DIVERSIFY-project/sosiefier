package fr.inria.diversify.exp;

import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeOriginalReport extends ComputeReport {
    public static void main(String[] args) throws Exception {
        String originalDirectory = args[0];
        ComputeOriginalReport computeReport = new ComputeOriginalReport();

        Map<String, Report> report = computeReport.buildReportFor(new File(originalDirectory), false);

        File file = new File(originalDirectory + "/report.json");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        writer.write(computeReport.reportToJSON(report).toString());
        Log.info("global: {}", report.get("allTest").summary());
        writer.close();

        file = new File(originalDirectory + "/report.txt");
        file.createNewFile();
        writer = new FileWriter(file);

        writer.write(report.get("allTest").summary());
        writer.close();

    }

    protected JSONObject reportToJSON(Map<String, Report> report) throws JSONException {
        JSONObject object = new JSONObject();

        for(String test: report.keySet()) {
            object.put(test,report.get(test).buildReport());
        }

        return object;
    }
}
