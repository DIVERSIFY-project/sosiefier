package fr.inria.diversify.logger.stack;

import fr.inria.diversify.logger.stack.diff.Report;
import fr.inria.diversify.logger.stack.diff.TestReport;
import fr.inria.diversify.logger.stack.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Simon on 18/04/14.
 */
public class CompareAllStackTrace {
    protected List<StackTrace> originalStackTraces;
    protected List<StackTrace> sosieStackTraces;
    protected boolean partialTrace;

    protected Report reports;

    public CompareAllStackTrace(List<StackTrace> originalStackTraces, List<StackTrace> sosieStackTraces, boolean partialTrace) throws IOException, JSONException {
        this.originalStackTraces = originalStackTraces;
        this.sosieStackTraces = sosieStackTraces;
        this.partialTrace = partialTrace;
        this.reports = new Report();
    }

    /**
     * search if the original and sosie (two set of trace) not diverge at the call level and variable level
     *
     * @throws IOException
     */
    public void findDiff() throws Exception {
        for (StackTrace original : originalStackTraces) {
            for (StackTrace sosie : sosieStackTraces) {
                if (sosie.getFullName().equals(original.getFullName())) {
                    Log.debug("compare: {}", sosie.toString());

                    AbstractCompareStackTrace cls = new CompareStackTrace(original, sosie);

                    cls.findDiff();
                    TestReport testReport = cls.getTestReport();
                    reports.putTestReport(original.getName(), testReport);
                }
            }
        }
    }


    protected List<StackTrace> loadLog(String dir, boolean recursive) throws IOException {
        return new StackElementReader().loadLog(dir, recursive);
    }

    public Report getReport() throws JSONException {
        return reports;
    }

    public void setSosieStackTraces(List<StackTrace> sosieStackTraces) {
        this.sosieStackTraces = sosieStackTraces;
    }
}
