package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.util.*;
import java.util.concurrent.Semaphore;

/**
 * Abstract classes for all loggers
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public abstract class InstruLogWriter {

    //Thread containing the test
    private final Thread thread;

    private final InstruLogWriter parent;
    //Dir where the logs are going to be stored
    private String logDir = "LogDirName";

    ///The call deep is how deep in the stack are we.
    protected Map<Thread, Integer> callDeep;

    ///Directory where the log is being stored
    protected File dir = null;

    ///Dictionary indicating if the methods of a thread are to be logged.
    protected Map<Thread, Boolean> logMethod;

    ///Semaphores for locking output streams
    protected Map<String, Semaphore> semaphores;

    ///Previous logs of variables status. Useful to validate whether they have change
    protected Map<Thread, Map<String, String>> previousVarLog;

    protected Boolean partialLogging = null;

    protected Set<Thread> partialLoggingThread;

    //Number of times a TP is called
    private HashMap<String, Integer> transplantPointCallCount;

    //Instrumented depths of the call
    private HashMap<String, Integer[]> depthInstruArray;

    //Number of times an assertion is called
    private HashMap<String, Integer> assertCallCount;

    public int getCallDeep(Thread t) {
        return callDeep.containsKey(t) ? callDeep.get(t) : 0;
    }

    //Signature of the last test method logged
    private String currentTestSignature;

    /**
     * Constructor for the logger
     *
     * @param logDir Directory where the logging is going to be stored
     */
    public InstruLogWriter(String logDir, InstruLogWriter parent) {
        if (dir == null) initDir(logDir);
        semaphores = new HashMap<String, Semaphore>();
        callDeep = new HashMap<Thread, Integer>();
        logMethod = new HashMap<Thread, Boolean>();

        setTransplantPointCallCount(parent.getTransplantPointCallCount());
        setAssertCallCount(parent.getAssertCallCount());

        this.parent = parent;
        thread = parent.getThread();

        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);
    }

    /**
     * Constructor for the logger
     *
     * @param logDir Directory where the logging is going to be stored
     */
    public InstruLogWriter(String logDir) {
        if (dir == null) initDir(logDir);
        semaphores = new HashMap<String, Semaphore>();
        callDeep = new HashMap<Thread, Integer>();
        logMethod = new HashMap<Thread, Boolean>();

        transplantPointCallCount = new HashMap<String, Integer>();

        assertCallCount = new HashMap<String, Integer>();

        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);
        parent = null;
        thread = Thread.currentThread();
    }

    /**
     * Gets the loggin path for the current thread
     *
     * @param thread Thread to log
     * @return The path with the log file
     */
    public String getThreadLogFilePath(Thread thread) {
        return dir.getAbsolutePath() + "/" + getThreadFileName(thread);
    }

    /**
     * Log a call to a method
     *
     * @param thread            Thread where the call is invoked
     * @param methodSignatureId Signature of the method
     */
    public abstract void methodCall(Thread thread, String methodSignatureId);

    /**
     * Method that logs and return from a method
     *
     * @param thread Thread where the method returns
     */
    public void methodOut(Thread thread) {
        decCallDepth(thread);
    }

    public abstract void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var);

    /**
     * Logs the beginning of a test method
     *
     * @param thread
     * @param testSignature
     */
    public void writeTestStart(Thread thread, String testSignature) {
        setCurrentTestSignature(testSignature);
        getTransplantPointCallCount().clear();
        getAssertCallCount().clear();
        if (depthInstruArray == null) depthInstruArray = new HashMap<String, Integer[]>();
        else depthInstruArray.clear();
    }

    private void incCallCount(HashMap<String, Integer> map, String id) {
        if (!map.containsKey(id)) {
            map.put(id, 1);
        } else {
            int k = map.get(id) + 1;
            map.put(id, k);
        }
    }

    /**
     * Count the call of a transplant point.
     *
     * @param id
     */
    public void writeSourcePositionCall(String id) {
        if (!getTransplantPointCallCount().containsKey(id)) {
            writeStartLogging(Thread.currentThread(), id);
        }
        incCallCount(getTransplantPointCallCount(), id);
    }

    /**
     * Counts an assert.
     * <p/>
     * Counts how many asserts per transformation line
     */
    public void countAssert(String id) {
        incCallCount(getAssertCallCount(), id);
    }

    public abstract void writeVar(int id, Thread thread, String methodSignatureId, Object... var);

    public abstract void writeException(int id, Thread thread, Object exception);

    public abstract void writeCatch(int id, Thread thread, Object exception);

    public abstract void close();


    /**
     * Increases the depth of the stack for a given thread
     *
     * @param thread Thread to increase depth
     */
    protected int incCallDepth(Thread thread) {
        if (callDeep == null)
            callDeep = new HashMap<Thread, Integer>();
        if (callDeep.containsKey(thread)) {
            int c = callDeep.get(thread) + 1;
            callDeep.put(thread, c);
            return c;
        } else {
            callDeep.put(thread, 1);
            return 1;
        }
    }

    /**
     * Resets the depth of the stack for a given thread
     *
     * @param thread Thread to reset depth
     */
    public void resetCallDepth(Thread thread) {
        if (callDeep != null && callDeep.containsKey(thread))
            callDeep.remove(thread);
    }

    /**
     * Decreases the depth of the stack for a given thread
     *
     * @param thread Thread to decrease depth
     */
    protected int decCallDepth(Thread thread) {
        Integer deep = callDeep.get(thread);
        if (deep != null && deep > 0) {
            deep--;
            callDeep.put(thread, deep);
            return deep;
        }
        return 0;
    }

    /**
     * Gets a boolean value indicating if the methods of a thread are to be logged.
     *
     * @param thread Log this thread?
     * @return True if log, false otherwise
     */
    protected boolean getLogMethod(Thread thread) {
        return logMethod == null || !logMethod.containsKey(thread) || logMethod.get(thread);
    }

    protected void stopLogMethod(Thread thread) {
        logMethod.put(thread, false);
    }

    protected void startLogMethod(Thread thread) {
        logMethod.put(thread, true);
    }

    /**
     * Initializes the directory where the files for each thread are going to be stored
     */
    protected void initDir(String logDir) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(logDir));
            dir = new File("log" + reader.readLine());
        } catch (IOException e) {
            dir = new File("log");
        }
        //Log.debug("LOG DIR:" + dir.getAbsolutePath());
        dir.mkdir();
    }

    /**
     * Returns the file name of the file where this thread's log is being stored
     *
     * @param thread
     * @return Relative filename of the file where this thread's log is being stored
     */
    protected String getThreadFileName(Thread thread) {
        return "log" + thread.getName();
    }

    /**
     * A print string representation for an Object o
     *
     * @param o Object that is going to be printed
     * @return A string representation of the object
     */
    protected String printString(Object o) {
        String string;
        if (o == null)
            string = "null";
        else if (o instanceof Object[]) {
            Object[] array = (Object[]) o;
            int iMax = array.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; ; i++) {
                b.append(printString(array[i]));
                if (i == iMax)
                    return b.append(']').toString();
                b.append(", ");
            }
        } else
            string = o.toString();
        return string;
    }

    protected String buildVars(Thread thread, String separator, String simpleSeparator, Object[] vars) {
        StringBuilder varsString = new StringBuilder();
        stopLogMethod(thread);
        Map<String, String> previousVars = previousVarLog.get(thread);
        for (int i = 0; i < vars.length / 2; i = i + 2) {
            StringBuilder tmp = new StringBuilder();
            try {
                String varName = vars[i].toString();
                String value;
                if (vars[i + 1] == null) {
                    value = "null";
                } else {
                    value = vars[i + 1].toString();
                }

                String previousValue = previousVars.get(varName);
                if (!value.equals(previousValue)) {
                    previousVars.put(varName, value);

                    tmp.append(separator);
                    tmp.append(varName);
                    tmp.append(simpleSeparator);
                    tmp.append(value);

                    varsString.append(tmp);
                }
            } catch (Exception e) {
            }
        }
        startLogMethod(thread);
        return varsString.toString();
    }

    public void startLogging(Thread thread, String id) {
        if (partialLoggingThread == null) {
            partialLoggingThread = new HashSet();
        }
        partialLoggingThread.add(thread);
        writeStartLogging(thread, id);
    }

    protected abstract void writeStartLogging(Thread thread, String id);

    protected boolean log(Thread thread) {
        return !getPartialLogging()
                || (partialLoggingThread != null && partialLoggingThread.contains(thread));
    }

    protected boolean getPartialLogging() {
        if (partialLogging == null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("log/partialLogging"));
                partialLogging = Boolean.parseBoolean(reader.readLine());
            } catch (IOException e) {
                partialLogging = false;
            }
        }
        return partialLogging;
    }

    public String getLogDir() {
        return logDir;
    }

    public void setLogDir(String logDir) {
        this.logDir = logDir;
    }

    /**
     * Logs the completion of a tests
     */
    public abstract void writeTestFinish();

    public abstract void testCount(String signature);

    public abstract void assertCount(String signature);

    protected synchronized HashMap<String, Integer> getTransplantPointCallCount() {
        return transplantPointCallCount;
    }

    protected synchronized void setTransplantPointCallCount(HashMap<String, Integer> value) {
        transplantPointCallCount = value;
    }

    protected synchronized HashMap<String, Integer> getAssertCallCount() {
        return assertCallCount;
    }

    public synchronized void setAssertCallCount(HashMap<String, Integer> assertCallCount) {
        this.assertCallCount = assertCallCount;
    }

    public InstruLogWriter getParent() {
        return parent;
    }

    //Thread containing the test
    public Thread getThread() {
        return thread;
    }

    public synchronized Integer[] getDepthArray(String key) {
        if (depthInstruArray == null) depthInstruArray = new HashMap<String, Integer[]>();
        return depthInstruArray.get(key);
    }

    public synchronized void setDepthArray(String id, int index, int value) {
        Integer[] arr = depthInstruArray.get(id);
        if (arr == null) {
            arr = new Integer[] {-1,-1,-1,-1,-1,-1};
            depthInstruArray.put(id, arr);
        }
        arr[index] = value;
    }

    public synchronized void setDepthArray(String id, int min, int mean, int max,
                                           int sMin, int sMean, int sMax) {
        Integer[] arr = depthInstruArray.get(id);
        if (arr == null) {
            arr = new Integer[6];
            depthInstruArray.put(id, arr);
        }
        arr[0] = min;
        arr[1] = mean;
        arr[2] = max;
        arr[3] = sMin;
        arr[4] = sMean;
        arr[5] = sMax;
    }


    protected String getCurrentTestSignature() {
        if (parent != null) {
            return parent.getCurrentTestSignature();
        }
        return currentTestSignature;
    }

    protected void setCurrentTestSignature(String currentTestSignature) {
        this.currentTestSignature = currentTestSignature;
    }

    public void depthOnlyMethodCall(Thread thread) {
        incCallDepth(thread);
    }
}
