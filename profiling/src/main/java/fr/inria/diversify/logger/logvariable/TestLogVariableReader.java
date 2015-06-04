package fr.inria.diversify.logger.logvariable;

import fr.inria.diversify.logger.logvariable.diff.Pool;
import fr.inria.diversify.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Simon on 15/01/15.
 */
public class TestLogVariableReader {
    Set<String> testToExclude;
    Map<String, TestLogVariable> traceByTest;
    Map<Integer, String> idToClass;
    Map<Integer,  String[]> getters;
    private Map<Integer, Object[]> previousValues;
    static Map<Integer, String> idMap;


    public Collection<TestLogVariable> loadLog(String dir) throws IOException {
        File file = new File(dir);
        loadIdMap(dir + "/info");

        Collection<TestLogVariable> testLogVariables = new LinkedList<>();
        Log.debug("load trace in directory: {}", file.getAbsolutePath());
        for (File f : file.listFiles()) {
            if (f.isFile() && f.getName().startsWith("log")) {
            try {
                Log.debug("parse file: {}", f.getAbsoluteFile());
                testLogVariables.addAll(splitByTest(f));
            } catch (Exception e) {
                Log.debug("error for: {}", f.getAbsoluteFile());
                e.printStackTrace();
            }
        }

        }
        Log.debug("number of test: {}", testLogVariables.size());
        MultiMonitoringPoint.dico.putAll(idToClass);

        return testLogVariables;
    }

    int count = 0;
    protected SingleMonitoringPoint parseMonitoringPoint(String assertLog) {
        SingleMonitoringPoint monitoringPoint = null;

            String[] split = assertLog.split(";");
            int assertId = Pool.getCanonicalVersion(Integer.parseInt(split[1]));
            int classId = Pool.getCanonicalVersion(Integer.parseInt(split[2]));
            String className = Pool.getCanonicalVersion(idToClass.get(classId));
            monitoringPoint = new SingleMonitoringPoint(assertId, className, getters.get(classId));

            count++;
            Object[] pValues = previousValues.get(classId);
            if (split.length != 3) {
                List<String> tmp = split(assertLog, ":;:");

                Object[] values = parseValues(tmp.subList(1, tmp.size()));

                if (pValues == null) {
                    pValues = values;
                    previousValues.put(classId, pValues);
                } else {
                    char[] masque = split[3].toCharArray();

                    int index = 0;
                    for (int i = 0; i < masque.length - 1; i++) {
                        if (masque[i] == '1') {
                            try {
                                pValues[i] = values[index];
                            }catch (Exception e) {
                                pValues[i] = "";
                            }
                            index++;
                        }
                    }
                }
            }
        monitoringPoint.setValues(Arrays.copyOf(pValues, pValues.length));

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
        split.add(toSplit.substring(begin,toSplit.length()));
        return split;
    }


    protected Object[] parseValues(List<String> values) {
        Object[] parseValues = new Object[values.size()];
        for(int i = 0; i < values.size(); i++) {
            parseValues[i] = parseValue(values.get(i));
        }
        return parseValues;
    }

    protected Object parseValue(String value) {
        //value is a Map
        if(value.startsWith("{") && value.endsWith("}")) {

            Set<Object> set = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(",\\s?")) {
                set.add(parseValue(s));
            }
            return Pool.getCanonicalVersion(set);
        }
        //value is a array or a list or set
        if(value.startsWith("[") && value.endsWith("]")) {
            Set<Object> list = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(",\\s?")) {
                list.add(parseValue(s));
            }
            return Pool.getCanonicalVersion(list);
        }
        //toString() is not define
        if(value.split("@").length > 1) {
            return parseValue(value.split("@")[0]);
        }
        //toString() is not define
        if( value.split("\\$").length > 1) {
            return parseValue(value.split("\\$")[0]);
        }
        return Pool.getCanonicalVersion(value);
    }

    protected Collection<TestLogVariable> splitByTest(File file) throws Exception {
        reset();
        List<AbstractMonitoringPoint> monitoringPoint = new LinkedList();
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
                    String type = logEntry.substring(0, 2);
                    logEntry = logEntry.substring(0, logEntry.length() - 2);
                    switch (type) {
                        case "TS" :
                            if (currentTest != null) {
                                testToExclude.add(currentTest);
                            }
                            monitoringPoint = new LinkedList<>();
                            currentTest = parseTestName(logEntry);
                            break;
                        case "TE" :
                            if(currentTest != null) {
                                addTest(currentTest, monitoringPoint);
                                currentTest = null;
                            }
                            break;
                        case "Cl" :
                            parseClass(logEntry);
                            break;
                        case "Gt" :
                            parseGetters(logEntry);
                            break;

                        case "As":
                            SingleMonitoringPoint point = parseMonitoringPoint(logEntry);
                            AbstractMonitoringPoint previous = monitoringPoint.stream()
                                    .filter(p -> p.getId() == point.getId())
                                    .findFirst()
                                    .orElse(null);
                            if(previous != null) {
                                if(previous instanceof SingleMonitoringPoint) {
                                    MultiMonitoringPoint multi = previous.toMulti();
                                    if(point.getValues() != null) {
                                        multi.add(point);
                                    }
                                    monitoringPoint.remove(previous);
                                    monitoringPoint.add(multi);
                                }
                            } else {
                                monitoringPoint.add(point);
                            }
                            break;
                        default:
                            //do nothing
                    }
                    logEntry = "";
                }
            }
            if(logEntry.startsWith("TE") && currentTest != null) {
                addTest(currentTest, monitoringPoint);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        for(String test: testToExclude)
            traceByTest.remove(test);

        return traceByTest.values();
    }



    protected void addTest(String testName, List<AbstractMonitoringPoint> assertLogs) {
        if(!traceByTest.containsKey(testName)) {
            traceByTest.put(testName, new TestLogVariable(testName));
        }
        traceByTest.get(testName).addAllMonitoringPoint(assertLogs);
    }

    protected void parseGetters(String logEntry) {
        String[] split = logEntry.split(";");
        String[] methods = new String[split.length - 2];

        for(int i = 2; i < split.length; i++) {
            methods[i - 2] = Pool.getCanonicalVersion(split[i]);
        }
        getters.put(Integer.parseInt(split[1]), methods);
    }

    protected void parseClass(String logEntry) {
            String[] split = logEntry.split(";");
            if(split.length == 4 && split[1].startsWith("[")) {
                idToClass.put(Integer.parseInt(split[3]), split[1].substring(0,split[1].length() - 1));
            } else {
                idToClass.put(Integer.parseInt(split[2]), split[1]);
            }
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
    protected Map<Integer,String> loadIdMap(String file) throws IOException {
        if(idMap == null) {
            idMap = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                if(line.startsWith("id")) {
                    String[] tmp = line.split(" ");
                    Integer id = Integer.parseInt(tmp[1]);
                    idMap.put(id, line.substring(tmp[2].length(), line.length()));
                }
                line = reader.readLine();
            }
        }
        return idMap;
    }

    protected void reset() {
        previousValues = new HashMap<>();
        idToClass = new HashMap<>();
        getters = new HashMap<>();
        traceByTest = new HashMap();
        testToExclude = new HashSet();
    }
}
