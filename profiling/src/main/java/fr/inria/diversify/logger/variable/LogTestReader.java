package fr.inria.diversify.logger.variable;

import fr.inria.diversify.logger.Pool;
import fr.inria.diversify.logger.logger.KeyWord;
import fr.inria.diversify.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Simon on 15/01/15.
 */
public class LogTestReader {
    Set<String> testToExclude;
    Map<String, Test> traceByTest;
//    private Map<String, String[]> previousVars;
//    private Map<String, Object[]> previousValues;
    Map<String, String> idMap;


    public Collection<Test> loadLog(String dir) throws IOException {
        File file = new File(dir);
        loadIdMap(dir + "/info");

        Log.debug("load trace in directory: {}", file.getAbsolutePath());
        for (File f : file.listFiles()) {
            if (f.isFile() && f.getName().startsWith("logmain")) {
                try {
                    Log.debug("parse file: {}", f.getAbsoluteFile());
                    splitByTest(f);
                } catch (Exception e) {
                    Log.debug("error for: {}", f.getAbsoluteFile());
                    e.printStackTrace();
                }
            }

        }
        Log.debug("number of test: {}", traceByTest.size());
        return traceByTest.values();
    }

    protected SingleMonitoringPoint parseMonitoringPoint(String assertLog) {
        String[] split = assertLog.split(";");
        String methodId = idMap.get(split[2]);

        String[] vv = split[3].split(KeyWord.separator);

        String var = idMap.get(vv[0]);
        Object value;
        if(vv.length == 1) {
            value = "";
        } else {
            value = parseValue(vv[1]);
        }

        SingleMonitoringPoint monitoringPoint = new SingleMonitoringPoint(methodId, var);
        monitoringPoint.addValue(value);

        return monitoringPoint;
    }


    protected  List<String> split(String toSplit, String by) {
        List<String> split = new ArrayList<>();
        int begin = 0;
        int end = toSplit.indexOf(by, begin);
        while (end != -1) {
            split.add(toSplit.substring(begin, end));
            begin = end + by.length();
            end = toSplit.indexOf(by, begin);
        }
        split.add(toSplit.substring(begin, toSplit.length()));
        return split;
    }

    protected Object parseValue(String value) {
        //value is a Map
        if(value.startsWith("{") && value.endsWith("}")) {

            Set<Object> set = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(",\\s?")) {
                set.add(parseValue(s));
            }
            return Pool.get(set);
        }
        //value is a array or a list or set
        if(value.startsWith("[") && value.endsWith("]")) {
            Set<Object> list = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(",\\s?")) {
                list.add(parseValue(s));
            }
            return Pool.get(list);
        }
        //toString() is not define
        if(value.split("@").length > 1) {
            return parseValue(value.split("@")[0]);
        }
        //toString() is not define
        if( value.split("\\$").length > 1) {
            return parseValue(value.split("\\$")[0]);
        }
        return Pool.get(value);
    }

    protected void splitByTest(File file) throws Exception {
        reset();
        List<SingleMonitoringPoint> monitoringPoint = new LinkedList();
        String currentTest = null;
        BufferedReader reader = new BufferedReader(new FileReader(file));

        reader.readLine();
        String line = "";
        String logEntry = "";
        try {

            while (line != null) {
                line = reader.readLine();
                logEntry = logEntry + line;

                if (logEntry.endsWith("$$")) {
                    logEntry = logEntry.substring(0, logEntry.length() - 2);
                    String[] split = logEntry.split(";");
                    switch (split[0]) {
                        case KeyWord.testStartObservation :
                            if (currentTest != null) {
                                testToExclude.add(currentTest);
                            }
                            monitoringPoint = new LinkedList<>();
                            currentTest = parseTestName(logEntry);
                            break;
                        case KeyWord.testEndObservation :
                            if(currentTest != null) {
                                addTest(currentTest, monitoringPoint);
                                currentTest = null;
                            }
                            break;
                        case KeyWord.variableObservation :
                            SingleMonitoringPoint point = parseMonitoringPoint(logEntry);
                            SingleMonitoringPoint previous = monitoringPoint.stream()
                                    .filter(p -> p.getId() == point.getId())
                                    .findFirst()
                                    .orElse(null);
                            if(previous != null) {
                                previous.addAllValue(point.getValues());
                            } else {
                                monitoringPoint.add(point);
                            }
                            break;
                        default:
                            break;
                    }
                    logEntry = "";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(String test: testToExclude)
            traceByTest.remove(test);
    }

    protected void addTest(String testName, List<SingleMonitoringPoint> assertLogs) {
        if(!traceByTest.containsKey(testName)) {
            traceByTest.put(testName, new Test(testName));
        }
        traceByTest.get(testName).addAllMonitoringPoint(assertLogs);
    }

    protected String parseTestName(String logEntry) {
        return logEntry.substring(3, logEntry.length());
    }

    /**
     * Loads the ID map from file
     * @param file File to load the ID map from
     * @return The map
     * @throws IOException
     */
    protected void loadIdMap(String file) throws IOException {
        if(idMap == null) {
            idMap = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                if(line.startsWith("id")) {
                    String[] tmp = line.split(";");
                    String id = Pool.get(tmp[1]);
                    idMap.put(id, Pool.get(tmp[2]));
                }
                line = reader.readLine();
            }
        }
    }

    protected void reset() {
//        previousValues = new HashMap<>();
//        previousVars = new HashMap<>();
        traceByTest = new HashMap();
        testToExclude = new HashSet();
    }
}
