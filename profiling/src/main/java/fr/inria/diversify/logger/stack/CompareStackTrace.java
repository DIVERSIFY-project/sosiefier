package fr.inria.diversify.logger.stack;

import fr.inria.diversify.logger.stack.stackElement.StackTraceCall;
import fr.inria.diversify.logger.stack.stackTraceOperation.StackTrace;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Simon on 17/04/14.
 */
public class CompareStackTrace extends AbstractCompareStackTrace {

    public CompareStackTrace(StackTrace st1, StackTrace st2) {
       super(st1,st2);
    }


    public List<String> findDiff() {
        List<String> diffs = new LinkedList();


        originalStackTrace.reset();
        sosieStackTrace.reset();
        int oVar = 0, sVar = 0, call = 0;
        while(originalStackTrace.hasNext() && sosieStackTrace.hasNext()) {
            if (originalStackTrace.nextIsVar() || sosieStackTrace.nextIsVar()) {
                if(originalStackTrace.nextIsVar()) {
//                    nextVar(originalStackTrace, sosieStackTrace.getStartLogging());
                    originalStackTrace.next();
                    oVar++;
                }
                if(sosieStackTrace.nextIsVar()) {
//                    nextVar(sosieStackTrace, sosieStackTrace.getStartLogging());
                    sosieStackTrace.next();
                    sVar++;
                }
            } else {
                call++;
                sosieStackTrace.next();
                originalStackTrace.next();
            }

            StackTraceCall top1 = originalStackTrace.getTop();
            StackTraceCall top2 = sosieStackTrace.getTop();
            boolean sameTop = top1.equals(top2);

            if(sameTop) {
                testReport.addSameMethodCall(top1);
                if(originalStackTrace.getVariablesValueChange() || sosieStackTrace.getVariablesValueChange()) {
                    Set<String> vd = varDiff(originalStackTrace, sosieStackTrace);
                    if (!vd.isEmpty()) {
                        diffs.addAll(vd);
                    }
                }
            } else {
                testReport.addDiffMethodCall(top1);
                testReport.addDiffMethodCall(top2);
//                Log.info("stack trace diff: st1 size: {}, st2 size: {},\nst1 top: {}, st2 top: {}",deep1,deep2,top1,top2);
                findNewSyncro(20, 1, originalStackTrace, sosieStackTrace);
            }
        }
        return diffs;
    }
}
