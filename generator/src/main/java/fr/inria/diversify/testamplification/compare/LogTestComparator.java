package fr.inria.diversify.testamplification.compare;

import fr.inria.diversify.testamplification.compare.diff.*;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.util.*;

/**
 * Created by Simon on 15/01/15.
 */
public class LogTestComparator {
    protected List<Test> originalTests;
    protected List<Test> sosieTests;



    public LogTestComparator(Collection<Test> original, Collection<Test> test) {
        originalTests = new ArrayList<>(original);
        sosieTests = new ArrayList<>(test);
    }

    public Diff compare() throws JSONException {
        Diff result = new Diff();
        for(Test original : originalTests) {
            for (Test sosie : sosieTests) {
                if(original.getSignature().equals(sosie.getSignature())) {
                    TestDiff testdiff = compareTest(original, sosie);
                    if(testdiff.size() != 0) {
                        result.add(testdiff);
                    }
                    break;
                }
            }
        }
        return result;
    }

    protected TestDiff compareTest(Test original, Test sosie) {
        TestDiff result = new TestDiff(original.getSignature());
        Log.trace("compare test {}", original.getSignature());

        List<Integer> allId = new ArrayList<>(original.getAllId());
        allId.addAll(sosie.getAllId());

        for(int id : allId) {
            AbstractMonitoringPoint originalMonitoringPoint = original.getMonitoringPoint(id);
            AbstractMonitoringPoint sosieMonitoringPoint = sosie.getMonitoringPoint(id);

            if(originalMonitoringPoint == null || sosieMonitoringPoint == null) {
                MonitoringPointDiff diff = new MonitoringPointDiff(id);
                diff.setClassDiff(true);
                result.add(diff);
            } else {
                MonitoringPointDiff diff = originalMonitoringPoint.compare(sosieMonitoringPoint);
                if(diff.size() != 0) {
                    result.add(diff);
                    Log.trace(diff.toString());
                }
            }
        }

         return result;
    }
}
