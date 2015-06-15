package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
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
@Deprecated
public class StackElementTextReader extends StackElementReader {
    Set<String> testToExclude;
    Map<String, List<String>> traceByTest;
    String logEntry = "";

    @Override
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
                    Map<String, List<String>> splitByTest = splitByTest(f);
                    for (String key : splitByTest.keySet()) {
                        StackTrace st = new StackTrace();
                        st.parseFile(key, splitByTest.get(key), idMap);
                        list.add(st);
                    }
                } catch (Exception e) {
                    Log.debug("error for: {}", f.getAbsoluteFile());
                }
            }
        }
        Log.debug("number of stackTrace: {}",list.size());
        return list;
    }

    protected Map<String, List<String>> splitByTest(File file) throws Exception {
        traceByTest = new HashMap();
        testToExclude = new HashSet();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = "";

        while (true) {
            line = reader.readLine();
            if(line == null)
                break;
            if(line.startsWith("NewTest")) {
                try {
                    parseNewTest(reader, parseTestName(line));
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
        for(String test: testToExclude)
            traceByTest.remove(test);

        return traceByTest;
    }


    protected void addTest(List<String> trace, String testName) {
        if(traceByTest.containsKey(testName)) {
            testToExclude.add(testName);
        }
        if(!trace.isEmpty()) {
            traceByTest.put(testName, trace);
        }
    }

    protected void parseNewTest(BufferedReader reader, String testName) throws IOException {
        List<String> trace = new LinkedList();
        String line = reader.readLine();
        logEntry = "";

        while (line != null) {
            logEntry = logEntry + line;
            if(line.endsWith("$$$")) {
                if(logEntry.startsWith("NewTest")) {
                    testToExclude.add(parseTestName(logEntry));
                    testToExclude.add(testName);
                    return;
                }
                if(logEntry.startsWith("TE")) {
                    addTest(trace, testName);
                    return;
                }
                trace.add(logEntry.substring(0, line.length() - 3));
                logEntry = "";
            }

            line = reader.readLine();
        }
        testToExclude.add(testName);
    }

    protected String parseTestName(String logEntry) {
        return logEntry.substring(8, logEntry.length() - 3);
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
