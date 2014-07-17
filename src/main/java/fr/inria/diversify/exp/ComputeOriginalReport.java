package fr.inria.diversify.exp;

import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.TestReport;
import fr.inria.diversify.util.Log;

import java.io.File;

/**
 * Created by Simon on 01/07/14.
 */
public class ComputeOriginalReport extends ComputeReport {
    public static void main(String[] args) throws Exception {
        Log.DEBUG();
        String originalDirectory = args[0];
        ComputeOriginalReport computeReport = new ComputeOriginalReport();

        Report report = computeReport.buildReportFor(new File(originalDirectory), false);


//        report.toJSON().write(writer);
        Log.info("global: {}", report.summary());
//        writer.close();

        TestReport allTest = report.buildAllTest();
        computeReport.writeCSVReport(allTest,allTest, originalDirectory + "/report.csv");

//        File file = new File(originalDirectory + "/report.txt");
//        file.createNewFile();
//        writer = new FileWriter(file);
//
//        writer.write(report.summary());
//        writer.close();

    }
}
