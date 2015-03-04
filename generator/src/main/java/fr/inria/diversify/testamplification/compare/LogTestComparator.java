package fr.inria.diversify.testamplification.compare;

import fr.inria.diversify.testamplification.compare.diff.AssertDiff;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.LogDiff;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
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
                if(original.getSignature().equals(sosie.getSignature()) && sosie.size() == 1) {
                    result.add(compareTest(original, sosie));
                    break;
                }
            }
        }
        return result;
    }

    int countExcludeTest;
    protected TestDiff compareTest(Test original, Test sosie) {
        TestDiff result = new TestDiff(original.getSignature());
        countExcludeTest = 50;
        Log.trace("compare test {}", original.getSignature());

        LogDiff logResult = compareLog(original.getLog(0), sosie.getLog(0));
        if(logResult == null) {
            result = new TestDiff(original.getSignature());
            result.excludeThisTest();
            return result;
        } else {
            if (!logResult.isEmpty()) {
                result.add(logResult);
            }
        }
        return result;
    }

    protected LogDiff compareLog(LogTest original, LogTest sosie) {
        LogDiff result = new LogDiff();
        original.reset();
        sosie.reset();

        if(!original.hasNext()) {
            if (!sosie.hasNext()) {
                return result;
            } else {
                result.setAllDiff(sosie.size());
                return result;
            }
        } else {
            if(!sosie.hasNext()) {
                result.setAllDiff(original.size());
                return result;
            }
        }

        Assert originalAssert = original.next();
        Assert sosieAssert = sosie.next();

        while(original.hasNext() && sosie.hasNext()) {
            if (countExcludeTest < 0) {
                return null;
            }
            if (originalAssert.getAssertId() == sosieAssert.getAssertId()) {
                result.add(compareAssert(originalAssert, sosieAssert));

                originalAssert = original.next();
                sosieAssert = sosie.next();
            } else {
                Set<Integer> notSyncro = findSyncro(original, sosie);
                result.addAll(notSyncro);
                if(notSyncro.isEmpty()) {
                   break;
                } else {
                    originalAssert = original.next();
                    sosieAssert = sosie.next();
                }
            }
        }
        return result;
    }

    private Set<Integer> findSyncro(LogTest original, LogTest sosie) {
        countExcludeTest--;
        int oNON = original.numberOfNext();
        int sNON = sosie.numberOfNext();
        int borne = Math.min(original.numberOfNext(),sosie.numberOfNext());

        if(oNON < sNON) {
            return findSyncro(original, sosie, borne);
        } else {
            return findSyncro(sosie, original, borne);
        }
    }

    private Set<Integer> findSyncro(LogTest original, LogTest sosie, int borne) {
        Assert originalAssert = original.peek();
        Assert sosieAssert;
        Set<Integer> assertNotSyncro = new HashSet<>();
        Set<Integer> sosieNotSyncro = new HashSet<>();

        for(int i = 0; i < borne; i++) {
            sosieNotSyncro.clear();
            assertNotSyncro.add(originalAssert.getAssertId());
            assertNotSyncro.add(sosie.peek().getAssertId());
            for (int j = i; j < borne - i; j++) {
                sosieAssert = sosie.next();
                if (compareAssert(originalAssert, sosieAssert) == null) {
                    assertNotSyncro.addAll(sosieNotSyncro);
                    return assertNotSyncro;
                }
                sosieNotSyncro.add(sosieAssert.getAssertId());
            }

            sosie.previous(borne - i);
            originalAssert = original.next();
        }
        original.previous(borne);
        assertNotSyncro.addAll(sosieNotSyncro);
        return assertNotSyncro;
    }

    protected AssertDiff compareAssert(Assert originalAssert, Assert sosieAssert) {
        if (originalAssert.getAssertId() == sosieAssert.getAssertId()) {
            int borne = Math.min(originalAssert.getValues().length, sosieAssert.getValues().length);
            for (int i = 0; i < borne; i++) {
                Object oValue = originalAssert.getValues()[i];
                Object sValue = sosieAssert.getValues()[i];
                if (!oValue.equals(sValue)) {
                    return new AssertDiff(originalAssert, sosieAssert);
                }
            }
        } else {
            return new AssertDiff(originalAssert, sosieAssert);
        }
        return null;
    }

    protected void printResult(List<TestDiff> result) {
        for(TestDiff test : result) {
            Log.info("test: {}", test.getSignature());
            for (LogDiff log : test.getDiff()) {
                for(AssertDiff assertDiff : log.getAssertDiffs()) {
                    Log.info("{}",assertDiff);
                }
                Log.info("--------------");
            }
        }
    }
}
