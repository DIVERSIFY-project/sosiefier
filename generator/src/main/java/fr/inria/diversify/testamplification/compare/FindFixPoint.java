package fr.inria.diversify.testamplification.compare;


import fr.inria.diversify.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Simon on 03/02/15.
 */
public class FindFixPoint {
    Map<String , Map<Integer, Boolean[]>> fixValue;
    Map<String , Map<Integer, Object[]>> values;

    protected void find(Test test) {
        Log.debug("test {}", test.getSignature());
        String[] tmp = test.getSignature().split("\\.");
        String testName = tmp[tmp.length - 1];
        find(testName, test.getLog(0));

    }

    protected void find(String testName, LogTest log) {
        log.reset();
        if(!values.containsKey(testName)) {
            values.put(testName, new HashMap<>());
        }
        Map<Integer, Object[]> testValues = values.get(testName);
        Map<Integer, Boolean[]> testFix = fixValue.get(testName);
        while(log.hasNext()) {
            Assert assertPoint = log.next();
            int id = assertPoint.getAssertId();
            if(!testValues.containsKey(id)) {
                testValues.put(id, assertPoint.getValues());
                testFix.put(id, new Boolean[assertPoint.getValues().length]);
            } else {
                Object[] currentValues = assertPoint.getValues();
                Object[] oldValues = testValues.get(id);
                for(int i = 0; i < currentValues.length; i++) {
                    testFix.get(id)[i] = testFix.get(id)[i] && currentValues[i].equals(oldValues[i]);
                }
            }
        }
    }

    public int nbOfFixPoint() {
        int count = 0;
        for(Map<Integer, Boolean[]> map : fixValue.values()) {
            for(Boolean[] fix : map.values()) {
                for(Boolean b : fix) {
                    if(b) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int nbOfPoint() {
        int count = 0;
        for(Map<Integer, Boolean[]> map : fixValue.values()) {
            for(Boolean[] fix : map.values()) {
                count += fix.length;
            }
        }
        return count;
    }
}
