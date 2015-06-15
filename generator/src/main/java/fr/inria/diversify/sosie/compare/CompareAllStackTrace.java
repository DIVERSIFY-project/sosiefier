package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.diff.*;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import org.json.JSONException;
import fr.inria.diversify.util.Log;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 18/04/14.
 */
@Deprecated
public class CompareAllStackTrace {
    protected List<StackTrace> originalStackTraces;
    protected List<StackTrace> sosieStackTraces;
    protected boolean partialTrace;

    protected Report reports;

//    public CompareAllStackTrace(String dirOriginal, String dirSosie, boolean partialTrace) throws IOException, JSONException {
//        originalStackTraces = loadLog(dirOriginal, false);
//        sosieStackTraces = loadLog(dirSosie, false);
//        this.partialTrace = partialTrace;
//        reports = new Report();
//    }

    public CompareAllStackTrace(List<StackTrace> originalStackTraces, List<StackTrace> sosieStackTraces, boolean partialTrace) throws IOException, JSONException {
        this.originalStackTraces = originalStackTraces;
        this.sosieStackTraces = sosieStackTraces;
        this.partialTrace = partialTrace;
        this.reports = new Report();
    }

    /**
     * search if the original and sosie (two set of trace) not diverge at the call level and variable level
     *
     * @throws java.io.IOException
     */
    public void findDiff() throws Exception {
        for (StackTrace original : originalStackTraces) {
            for (StackTrace sosie : sosieStackTraces) {
                if (sosie.getFullName().equals(original.getFullName())) {
                    Log.debug("compare: {}", sosie.toString());

                    AbstractCompareStackTrace cls;
                    if(partialTrace) {
                        cls = new ComparePartialStackTrace(original,sosie);
                    } else {
                        cls = new CompareStackTrace(original, sosie);
                    }
                    cls.findDiff();
                    TestReport testReport = cls.getTestReport();
                    reports.putTestReport(original.getName(), testReport);
                }
            }
        }
    }


    protected List<StackTrace> loadLog(String dir, boolean recursive) throws IOException {
        return new StackElementTextReader().loadLog(dir, recursive);
    }

    public Report getReport() throws JSONException {
        return reports;
    }

    public void setSosieStackTraces(List<StackTrace> sosieStackTraces) {
        this.sosieStackTraces = sosieStackTraces;
    }
}
