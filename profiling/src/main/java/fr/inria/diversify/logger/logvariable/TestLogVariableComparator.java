package fr.inria.diversify.logger.logvariable;

import fr.inria.diversify.logger.logvariable.diff.Diff;
import fr.inria.diversify.logger.logvariable.diff.MonitoringPointDiff;
import fr.inria.diversify.logger.logvariable.diff.TestDiff;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.util.*;

/**
 * Created by Simon on 15/01/15.
 */
public class TestLogVariableComparator {
    protected List<TestLogVariable> originalTests;
    protected List<TestLogVariable> sosieTests;

    public int nbPointFix = 0;
    public int nbPointNotFix = 0;


    public TestLogVariableComparator(Collection<TestLogVariable> original, Collection<TestLogVariable> test) {
        originalTests = new ArrayList<>(original);
        sosieTests = new ArrayList<>(test);
    }

    public Diff compare() throws JSONException {
        Diff result = new Diff();
        for(TestLogVariable original : originalTests) {
            for (TestLogVariable sosie : sosieTests) {
                if(original.getSignature().equals(sosie.getSignature())) {
                    SingleMonitoringPoint.initPoint();
                    TestDiff testdiff = compareTest(original, sosie);
                    if(testdiff.size() != 0) {
                        result.add(testdiff);
                    }
//                    Log.info("point fix: {}", SingleMonitoringPoint.nbOfFixPoint());
//                    Log.info("point non fix: {}",SingleMonitoringPoint.nbOfNotFixPoint());
                    nbPointFix += SingleMonitoringPoint.nbOfFixPoint();
                    nbPointNotFix += SingleMonitoringPoint.nbOfNotFixPoint();
//                    Log.info("total point fix: {}", nbPointFix);
//                    Log.info("total point non fix: {}",nbPointNotFix);
                    break;
                }
            }
        }
        return result;
    }

    protected TestDiff compareTest(TestLogVariable original, TestLogVariable sosie) {
        TestDiff result = new TestDiff(original.getSignature());
        Log.trace("compare test {}", original.getSignature());

        Set<Integer> allId = new HashSet<>(original.getAllId());
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
