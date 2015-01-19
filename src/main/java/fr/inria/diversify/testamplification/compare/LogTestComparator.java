package fr.inria.diversify.testamplification.compare;

import fr.inria.diversify.testamplification.compare.result.AssertDiff;
import fr.inria.diversify.testamplification.compare.result.LogResult;
import fr.inria.diversify.testamplification.compare.result.TestResult;
import fr.inria.diversify.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    public void compare() {
        List<TestResult> result = new ArrayList<>(originalTests.size());
        for(Test original : originalTests) {
            for (Test sosie : sosieTests) {
                if(original.getSignature().equals(sosie.getSignature())) {
                    result.add(compareTest(original, sosie));
                    break;
                }
            }
        }

        printResult(result);
//        originalTests.stream()
//                .forEach(original -> sosieTests.stream()
//                    .filter(sosie -> original.getSignature().equals(sosie.getSignature()))
//                    .findFirst()
//                    .ifPresent(sosie -> compareTest(original, sosie)));
    }


    protected TestResult compareTest(Test original, Test sosie) {
        TestResult result = new TestResult(original.getSignature());

        Log.debug("compare test {}", original.getSignature());
        for (int i = 0; i < original.size(); i++) {
            if(sosie.size() < i  || !compareLog(original.getLog(i), sosie.getLog(i)).isEmpty()) {
                List<LogResult> currentResult = new ArrayList<>(sosie.size());
                for (int j = 0; j < sosie.size(); j++) {
                    LogResult logResult = compareLog(original.getLog(i), sosie.getLog(j));
                    if (logResult.isEmpty()) {
                        break;
                    } else {
                        currentResult.add(logResult);
                    }
                }
                LogResult smallerDiff = currentResult.stream()
                                                     .sorted()
                                                     .findFirst().orElse(null);
                result.add(smallerDiff);
            }
        }
        return result;
    }

    protected LogResult compareLog(LogTest original, LogTest sosie) {
        LogResult result = new LogResult();
        original.reset();
        sosie.reset();
        Assert originalAssert = original.next();
        Assert sosieAssert = sosie.next();

        while(original.hasNext() && sosie.hasNext()) {

            if (originalAssert.getAssertId() == sosieAssert.getAssertId()) {
                result.add(compareAssert(originalAssert, sosieAssert));

                originalAssert = original.next();
                sosieAssert = sosie.next();
            } else {
                if(!findSyncro(original, sosie)) {
                    originalAssert = original.next();
                    sosieAssert = sosie.next();
                }
            }
        }
        return result;
    }

    private boolean findSyncro(LogTest original, LogTest sosie) {
        int maxOperation = 10;
        Assert originalAssert = original.peek();
        Assert sosieAssert;

        for(int i = 0; i < maxOperation; i++) {
            for (int j = 0; j < maxOperation - i; j++) {
                if(sosie.hasNext()) {
                    sosieAssert = sosie.next();
                    if (originalAssert.getAssertId() == sosieAssert.getAssertId()) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            sosie.previous(maxOperation - i);
            if(original.hasNext()) {
                originalAssert = original.next();
            } else {
                return false;
            }
        }
        original.previous(maxOperation);

        return false;
    }

    protected AssertDiff compareAssert(Assert originalAssert, Assert sosieAssert) {
        if(originalAssert.getAssertId() == sosieAssert.getAssertId()) {
            for(int i = 0; i < originalAssert.getValues().length; i++) {
                String oValue = originalAssert.getValues()[i];
                String sValue = sosieAssert.getValues()[i];
                if(!oValue.equals(sValue)) {
                    return new AssertDiff(originalAssert, sosieAssert);
                }
            }
        } else {
           return new AssertDiff(originalAssert, sosieAssert);
        }
        return null;
    }

    protected void printResult(List<TestResult> result) {
        for(TestResult test : result) {
            for (LogResult log : test.getDiff()) {
                for(AssertDiff assertDiff : log.getDiff()) {
                    Log.info("{}",assertDiff);
                }
            }
        }
    }

}
