package fr.inria.diversify.logger.stack;

import fr.inria.diversify.logger.logger.KeyWord;
import fr.inria.diversify.logger.stack.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * A class to read stack elements from a file
 * 
 * <p/>
 * Created by marodrig on 01/07/2014.
 */
public class StackElementReader {
    Set<String> testToExclude;
    Map<String, StackTrace> stackTraceByTest;


    public List<StackTrace> loadLog(String dir, boolean recursive) throws IOException {
        List<StackTrace> list = new ArrayList();
        File file = new File(dir);
        Map<Integer, String> idMap = loadIdMap(dir + "/id");

        Log.debug("load trace in directory: {}", file.getAbsolutePath());
        for (File f : file.listFiles()) {
            if (recursive && f.isDirectory())
                list.addAll(loadLog(f.getAbsolutePath(), recursive));
            else {
                try {
                    Log.debug("parse file: {}", f.getAbsoluteFile());
//                    Map<String, List<String>> splitByTest = splitByTest(f);
//                    for (String key : splitByTest.keySet()) {
//                        StackTrace st = new StackTrace();
//                        st.parseTrace(key, splitByTest.get(key), idMap);
//                        list.add(st);
//                    }
                } catch (Exception e) {
                    Log.debug("error for: {}", f.getAbsoluteFile());
                }
            }
        }
        Log.debug("number of stackTrace: {}",list.size());
        return list;
    }


    protected void parseTestCoverageFile(File file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String currentTest = null;

        String logEntry = "";
        List<String> currentTrace = new LinkedList<>();

        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
            logEntry = logEntry + line;
            if (logEntry.endsWith("$$")) {
                logEntry = logEntry.substring(0, logEntry.length() - 2);
                if(logEntry.startsWith(KeyWord.testStartObservation)) {
                    if(currentTest != null) {
                        testToExclude.add(currentTest);
                    }
                    currentTest = logEntry.substring(KeyWord.testStartObservation.length() + 1, logEntry.length());
                }
                else if(logEntry.startsWith(KeyWord.testEndObservation)) {
                    if(currentTest != null) {
                        addTest(currentTrace, currentTest);
                    }
                } else {
                    currentTrace.add(logEntry);
                }
                logEntry = "";
            }
        }
    }


    protected void addTest(List<String> trace, String testName) throws Exception {
        if(testToExclude.contains(testName)) {
            return;
        }
        if(!trace.isEmpty()) {
            testToExclude.add(testName);
            StackTrace stackTrace = new StackTrace();
            stackTrace.parseTrace(testName, trace, null);

            stackTraceByTest.put(testName, stackTrace);
        }
        ;
    }
    /**
     * Loads the ID map from file
     * @param file File to load the ID map from
     * @return The map
     * @throws IOException
     */
    protected Map<Integer,String> loadIdMap(String file) throws IOException {
        Map<Integer,String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        while (line != null) {
            String[] tmp = line.split(" ");
            map.put(Integer.parseInt(tmp[0]),line.substring(tmp[0].length(), line.length()));
            line = reader.readLine();
        }
        return map;
    }
}
