package fr.inria.diversify.exp;

import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Simon on 23/10/2014.
 */
public class ReportBuilder {

    public static void main(String[] args) throws Exception {
        String originalDir = args[0];
        String resultDir = args[1];
        int count = Integer.parseInt(args[2]);
        //        Log.DEBUG();
        Run run = new Run();
        run.localRepository = run.makeTmpSetting(resultDir);

        for(int i = 0; i < count; i++) {
            run.makeReportAndOLog(originalDir, resultDir + "/original" + i);
        }

    }
}
