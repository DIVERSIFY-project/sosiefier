package fr.inria.diversify.sosie.logger;

//import fr.inria.diversify.util.Log;

import java.io.*;
import java.lang.StackTraceElement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Verbose log for humans to understand
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class InstruVerboseLog extends InstruLogWriter {

    ///File writer for each thread. Each one saved in a different file
    private Map<Thread, PrintWriter> fileWriters;

    private String separator = ":;:";

    private String simpleSeparator = ";";

    //TPs called in this test
    protected HashSet<Integer> transplantPointCalledInThisTest;

    int nullCallDepths = 0;

    private static boolean findDepthDiffs = false;

    /**
     * Constructor of the verbose log
     *
     * @param logDir    Directory of the logger
     * @param parentLog Parent log (the logger of the thread launching the test)
     */
    public InstruVerboseLog(String logDir, InstruLogWriter parentLog) {
        super(logDir, parentLog);
        previousVarLog = new HashMap();
        fileWriters = new HashMap<Thread, PrintWriter>();
        setCurrentTestSignature(parentLog.getCurrentTestSignature());
    }

    public InstruVerboseLog(String logDir) {
        super(logDir);
        previousVarLog = new HashMap();
        fileWriters = new HashMap<Thread, PrintWriter>();
    }

    public void methodCall(Thread thread, String methodSignatureId) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
            try {
                incCallDepth(thread);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("$$$\n");
                stringBuilder.append("M"); //new method call
                stringBuilder.append(callDeep.get(thread));
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(methodSignatureId);

                String string = stringBuilder.toString();
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                releaseFileWriter(semaphore);
            }
        }
    }

    public void methodOut(Thread thread) {
        decCallDepth(thread);
    }

    public void writeTestStart(Thread thread, String testSignature) {

        super.writeTestStart(thread, testSignature);

        nullCallDepths = 0;

        String semaphore = "";
        try {
            partialLoggingThread = null;

//            previousVarLog.get(thread).clear();
            resetCallDepth(thread);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("$$$\n");
            stringBuilder.append("NewTest");
            stringBuilder.append(simpleSeparator);
            stringBuilder.append(testSignature);
            stringBuilder.append(simpleSeparator);
            stringBuilder.append(System.currentTimeMillis());

            String string = stringBuilder.toString();
            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    public void writeAssert(int id, Thread thread, String className, String methodSignature, String assertName, Object... var) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("A");
            string.append(simpleSeparator);
            string.append(id + "");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(simpleSeparator);
            string.append(assertName);

            StringBuilder vars = new StringBuilder();
            for (int i = 0; i < var.length; i++) {
                try {
                    vars.append(separator);
                    vars.append(printString(var[i]));

                } catch (Exception e) {
                }
                string.append(vars.toString());
            }
            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    /**
     * Updates the depth of the test
     * @param id ID of the call position
     * @param depth Depth of the call position
     */
    /**
     * Updates the depth of the test
     *
     * @param id ID of the call position
     */
    private void updateDepth(Thread t, String id, int count, boolean exists) {
        Integer depth = callDeep.get(t); //Attempt the fast way first
        Integer sDepth = -1;

        if (depth == null) {
            depth = getDepth();
            nullCallDepths++;
        }

        if (findDepthDiffs) {
            sDepth = getDepth();
            if (sDepth < depth) {
                System.out.println("SDepth: " + getDepth());
                throw new RuntimeException("Uppps");
            }
        }

        Integer[] arr = getDepthArray(id);
        if (arr == null) setDepthArray(id, depth, depth, depth, sDepth, sDepth, sDepth);
        else {
            //Instrumented
            if (depth < arr[0] && depth != -1) arr[0] = depth;
            if (depth != -1) {
                if (arr[1] != -1) arr[1] = (arr[1] * count + depth) / (count + 1);
                else arr[1] = depth;
            }
            if (depth > arr[2]) arr[2] = depth;

            if (findDepthDiffs) {
                //Stack traced
                if (sDepth < arr[3]) arr[3] = sDepth;
                if (arr[4] != -1) arr[4] = (arr[4] * count + sDepth) / (count + 1);
                else arr[4] = sDepth;
                if (sDepth > arr[5]) arr[5] = sDepth;
            }
        }
    }

    public void writeSourcePositionCall(String id) {
        Thread t = Thread.currentThread();
        if (getTransplantPointCallCount().containsKey(id)) {
            int k = getTransplantPointCallCount().get(id);
            updateDepth(t, id, k, true);
            getTransplantPointCallCount().put(id, k + 1);
        } else {
            updateDepth(t, id, 1, true);
            getTransplantPointCallCount().put(id, 1);
            writeStartLogging(t, id);
        }
    }

    @Override
    public void countAssert(String id) {

        Thread thread = getParent() == null ? Thread.currentThread() : getParent().getThread();

        if (getAssertCallCount().containsKey(id)) {
            int k = getAssertCallCount().get(id);
            getAssertCallCount().put(id, k + 1);
        } else {
            String semaphore = "";
            if (getLogMethod(thread)) {
                try {
                    getAssertCallCount().put(id, 1);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("$$$\n");
                    stringBuilder.append("SA"); //start logging
                    stringBuilder.append(simpleSeparator);
                    stringBuilder.append(id);
                    stringBuilder.append(simpleSeparator);
                    stringBuilder.append(System.currentTimeMillis());

                    String string = stringBuilder.toString();
                    PrintWriter fileWriter = getFileWriter(thread);
                    semaphore = fileWriter.toString() + fileWriter.hashCode();
                    fileWriter.append(string);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startLogMethod(thread);
                    releaseFileWriter(semaphore);
                }
            }
        }
    }


    /**
     * Get how deep in the stack is the call position
     *
     * @return
     */
    private int getDepth() {
        //Search first in the current thread
        Thread thread = Thread.currentThread();
        StackTraceElement[] a = thread.getStackTrace();
        String ct = getCurrentTestSignature();

        int result = -1;
        int i = 3;
        while (i < a.length) {
            String sig = a[i].getClassName();
            if (ct.contains(sig)) {
                result = i;
            }
            sig += "." + a[i].getMethodName();
            if (sig.equals(getCurrentTestSignature())) {
                return i - 4; //The log depth of this method +4 of the call
            }
            i++;
        }
        if (result == -1) {
            result = a.length - 9;
            if (result < 0) {
                throw new RuntimeException("What now!!!");
            }
            return result;
        }
        return result;
    }

    protected void writeStartLogging(Thread thread, String id) {
        String semaphore = "";
        if (getLogMethod(thread)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("$$$\n");
                stringBuilder.append("S"); //start logging
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(id);
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(System.currentTimeMillis());
                stringBuilder.append(simpleSeparator);
                //stringBuilder.append(getDepth());
                Integer[] d = getDepthArray(id);
                stringBuilder.append(d[1]);
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(d[4]);


                String string = stringBuilder.toString();
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                startLogMethod(thread);
                releaseFileWriter(semaphore);
            }
        }
    }


    public void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
            try {
                StringBuilder string = new StringBuilder();
                string.append("$$$\n");
                string.append("V");
                string.append(callDeep.get(thread));
                string.append(simpleSeparator);
                string.append(id + "");
                string.append(simpleSeparator);
                string.append(methodSignatureId);

                String varsString = buildVars(thread, id + methodSignatureId, var);
                if (varsString.isEmpty())
                    return;

                string.append(varsString);

                startLogMethod(thread);
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                startLogMethod(thread);
                releaseFileWriter(semaphore);
            }
        }
    }

    protected String buildVars(Thread thread, String methodSignatureId, Object[] vars) {
        StringBuilder varsString = new StringBuilder();
        stopLogMethod(thread);
        Map<String, String> previousVars = previousVarLog.get(thread);
        for (int i = 0; i < vars.length / 2; i = i + 2) {
            try {
                String varName = vars[i].toString();
                String value;
                if (vars[i + 1] == null) {
                    value = "null";
                } else {
                    value = vars[i + 1].toString();
                }

                String previousValue = previousVars.get(methodSignatureId + ":" + varName);
                if (!value.equals(previousValue)) {
                    previousVars.put(methodSignatureId + ":" + varName, value);
                    varsString.append(separator);
                    varsString.append(varName);
                    varsString.append(simpleSeparator);
                    varsString.append(value);
                }
            } catch (Exception e) {
            }
        }
        startLogMethod(thread);
        return varsString.toString();
    }


    public void writeException(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
            try {
                StringBuilder string = new StringBuilder();
                string.append("$$$\n");
                string.append("E");
                string.append(callDeep.get(thread));
                string.append(simpleSeparator);
                string.append(id + "");
                string.append(simpleSeparator);
                string.append(className);
                string.append(simpleSeparator);
                string.append(methodSignature);
                string.append(simpleSeparator);
                if (exception != null) string.append(exception.toString());
                else string.append("NullException");

                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                releaseFileWriter(semaphore);
            }
        }
    }

    public void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
            try {
                StringBuilder string = new StringBuilder();
                string.append("$$$\n");
                string.append("C");
                string.append(callDeep.get(thread));
                string.append(simpleSeparator);
                string.append(id + "");
                string.append(simpleSeparator);
                string.append(className);
                string.append(simpleSeparator);
                string.append(methodSignature);
                string.append(simpleSeparator);
                if (exception != null) string.append(exception.toString());
                else string.append("NullException");

                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                releaseFileWriter(semaphore);
            }
        }
    }

    @Override
    public void writeTestFinish() {

        if (nullCallDepths > 0)
            System.out.println(nullCallDepths + " depth with slow method at " + getCurrentTestSignature());


        for (Thread thread : fileWriters.keySet()) {
            String semaphore = "";
            try {
                PrintWriter flw = getFileWriter(thread);
                //Writes the subtotal of transplantation points called
                writeSubTotal("TPC", flw, getTransplantPointCallCount());

                //Writes the subtotal of assertions called
                writeSubTotal("ASC", flw, getAssertCallCount());

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\nTE");
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(System.currentTimeMillis());
                semaphore = flw.toString() + flw.hashCode();
                flw.append(stringBuilder.toString());
                flw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseFileWriter(semaphore);
        }
    }

    public void close() {
        for (Thread thread : fileWriters.keySet()) {
            String semaphore = "";
            try {
                PrintWriter flw = getFileWriter(thread);
                semaphore = flw.toString() + flw.hashCode();
                flw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseFileWriter(semaphore);
        }
    }

    /**
     * Writes a sub-total count to the PrintWriter
     *
     * @param flw PrintWriter where the data is going to be printed
     * @param map Map containing the subtotals
     */
    private void writeSubTotal(String subTotalId, PrintWriter flw, HashMap<String, Integer> map) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                //Don't spend more space in login an occurrence of something we already log

                sb.append("\n").
                        append(subTotalId).
                        append(simpleSeparator).
                        append(e.getKey()).
                        append(simpleSeparator).
                        append(e.getValue()).
                        append(simpleSeparator).
                        append(System.currentTimeMillis());
                if (subTotalId.equals("TPC")) {
                    Integer[] depth = getDepthArray(e.getKey());
                    if (depth == null) depth = new Integer[]{-1, -1, -1, -1, -1, -1};
                    for (int i = 0; i < depth.length; i++) {
                        sb.append(simpleSeparator).
                                append(depth[i]);
                    }
                }
            }
        }
        flw.write(sb.toString());
    }

    protected Map<String, String> loadIdMap(String file) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();

        while (line != null) {
            String[] tmp = line.split(" ");
            map.put(tmp[1], tmp[0]);
            line = reader.readLine();
        }
        return map;
    }

    protected synchronized PrintWriter getFileWriter(Thread thread) throws IOException, InterruptedException {
        if (!fileWriters.containsKey(thread)) {
            String fileName = getThreadLogFilePath(thread) + "_" + System.currentTimeMillis();
            previousVarLog.put(thread, new HashMap<String, String>());
            PrintWriter f = new PrintWriter(new BufferedWriter(new FileWriter(fileName), 1024 * 8));
            fileWriters.put(thread, f);
            semaphores.put(f.toString() + f.hashCode(), new Semaphore(1));
        }
        PrintWriter f = fileWriters.get(thread);
        semaphores.get(f.toString() + f.hashCode()).tryAcquire(50, TimeUnit.MILLISECONDS);
        return f;
    }


    protected void releaseFileWriter(String id) {
        if (semaphores.containsKey(id))
            semaphores.get(id).release();
    }

}
