package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackElement.*;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
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
public class StackElementTextReader extends StackElementReader {

    @Override
    public List<StackTrace> loadLog(String dir, boolean recursive) throws IOException {
        List<StackTrace> list = new ArrayList<>();
        File file = new File(dir);
        Map<Integer, String> idMap = loadIdMap(dir + "/id");
        int idMapSize = idMap.size();

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
        return list;
    }


    protected Map<String, List<String>> splitByTest(File file) throws Exception {
        Map<String, List<String>> traceByTest = new HashMap<>();
        Set<String> testToExclude = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();
        String tmp = "";

        if(line == null)
            throw new Exception("empty file");

        List<String> trace = new LinkedList<>();
        traceByTest.put("null",trace);
        while (line != null) {
            if(!line.isEmpty()) {
                if(line.endsWith("$$$")) {
                    try {
                        if(line.startsWith("NewTest")) {
                            String test = line.substring(8, line.length() - 3);
                            if(traceByTest.containsKey(test)) {
                                testToExclude.add(test);
                                trace = traceByTest.get(test);
                            } else {
//                                Log.debug("New test: {}",test);
                                trace = new LinkedList<>();
                                traceByTest.put(test, trace);
                            }
                        } else {
                            trace.add(tmp + line.substring(0, line.length() - 3));
                        }
                        tmp = "";
                    } catch (Exception e) {
                        Log.error("malformed line: {}",line);
                        tmp = "";
                    }
                }
                else {
                    tmp = tmp + line;
                }
            }
            line = reader.readLine();
        }
        if(!tmp.equals(""))
            trace.add(tmp);

        Log.debug("all test: {}, to exclude: {}", traceByTest.size(), testToExclude.size());
        for(String test: testToExclude)
            traceByTest.remove(test);


        return traceByTest;
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
