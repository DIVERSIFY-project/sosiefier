package fr.inria.diversify.testamplification.logger;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Simon on 17/12/14.
 */
@Deprecated
public class DeepLogWriter extends LogWriter {
    protected static Map<String, List<Integer>> deepCallByMethod = new HashMap<String, List<Integer>>();
    protected static List<Integer> deepCallForCurrentTest;
    protected static Map<Integer, List<Integer>> deepExceptionByMethod = new HashMap<Integer, List<Integer>>();
    protected static List<Integer> deepExceptionForCurrentTest;
    protected static String currentTest;
    protected static Map<String, PrintWriter> fileWriters = new HashMap<String, PrintWriter>();
    protected char separator = ';';

    public DeepLogWriter() {
        super();
    }

    @Override
    public void methodCall(Thread thread, String methodSignatureId) {
        if (getLogMethod(thread) && currentTest != null) {
            try {
                incCallDepth(thread);
                int deep = getCallDeep(thread);
//                if(!deepCallByMethod.containsKey(methodSignatureId)) {
//                    deepCallByMethod.putDataToJSON(methodSignatureId, new LinkedList<Integer>());
//                }
//                deepCallByMethod.get(methodSignatureId).add(deep);

                deepCallForCurrentTest.add(deep);
            } catch (Exception e) {}
        }
    }

    public void methodOut(Thread thread) {
        decCallDepth(thread);
    }

    @Override
    public void writeException(int id, Thread thread, Object exception) {
        if (getLogMethod(thread) && currentTest != null) {
            try {
                incCallDepth(thread);
                int deep = getCallDeep(thread);
//                if(!deepExceptionByMethod.containsKey(id)) {
//                    deepExceptionByMethod.putDataToJSON(id, new LinkedList<Integer>());
//                }
//                deepExceptionByMethod.get(id).add(deep);

                deepExceptionForCurrentTest.add(deep);
            } catch (Exception e) {}
        }
    }



    @Override
    public void writeTestFinish(Thread thread) {
        try {
            PrintWriter fileWriter = getFileWriter("testCall");
            fileWriter.append(currentTest);
            fileWriter.append(separator);
//            fileWriter.append(mean(deepCallForCurrentTest)+"");
//            fileWriter.append(separator);
//            fileWriter.append(median(deepCallForCurrentTest)+"");
//            fileWriter.append(separator);
            fileWriter.append(join(deepCallForCurrentTest, ","));
            fileWriter.append("\n");

            fileWriter = getFileWriter("testException");
            fileWriter.append(currentTest);
            fileWriter.append(separator);
//            fileWriter.append(mean(deepCallForCurrentTest)+"");
//            fileWriter.append(separator);
//            fileWriter.append(median(deepCallForCurrentTest)+"");
//            fileWriter.append(separator);
            fileWriter.append(join(deepExceptionForCurrentTest, ","));
            fileWriter.append("\n");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        currentTest = null;
    }

    protected String join(List<?> list, String delim) {
        int len = list.size();
        if (len == 0)
            return "";
        StringBuilder sb = new StringBuilder(list.get(0).toString());
        for (int i = 1; i < len; i++) {
            sb.append(delim);
            sb.append(list.get(i).toString());
        }
        return sb.toString();
    }

    @Override
    public void writeTestStart(Thread thread, Object thisObject, String testSignature) {
        currentTest = thisObject.getClass().getName() + "." +testSignature;
        resetCallDepth(thread);
        deepCallForCurrentTest = new LinkedList<Integer>();
        deepExceptionForCurrentTest = new LinkedList<Integer>();
    }

    protected synchronized PrintWriter getFileWriter(String key) throws IOException, InterruptedException {
        if (!fileWriters.containsKey(key)) {
            fileWriters.put(key, new PrintWriter(new BufferedWriter(new FileWriter(dir.getAbsolutePath() + "/" + key +"_"+System.currentTimeMillis()))));
        }
        return fileWriters.get(key);
    }

    public void close() {
        for (PrintWriter writer : fileWriters.values()) {
            writer.close();
        }
    }
}
