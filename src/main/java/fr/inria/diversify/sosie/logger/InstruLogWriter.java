package fr.inria.diversify.sosie.logger;

/*
import fr.inria.diversify.sosie.logger.ShutdownHookLog;
import fr.inria.diversify.util.Log;
*/

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * Abstract classes for all loggers
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public abstract class InstruLogWriter {

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

    ///Previous logs of variables status. Useful to check whether they have change
    protected Map<Thread, Map<String, String>> previousVarLog;

    //Number of times a transplantation point is called
    protected HashMap<Integer, Integer> transplantPointCallCount;

    //Number of test a transplantation point is called on
    protected HashMap<Integer, Integer> testCallsPerTransplantation;

    //Transplantation points called in this test
    protected HashSet<Integer> transplantPointCalledInThisTest;

    //Number of assertions per transplantation
    protected HashMap<Integer, Integer> assertionsPerTransplantation;

    protected Boolean partialLogging = null;

    protected Set<Thread> partialLoggingThread;

    public int getCallDeep(Thread t) {
        return callDeep.containsKey(t) ? callDeep.get(t) : 0;
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
        transplantPointCallCount = new HashMap<Integer, Integer>();
        assertionsPerTransplantation = new HashMap<Integer, Integer>();
        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);
        //transplantPointCalledInThisTest = new HashSet<Integer>();
        //testCallsPerTransplantation = new HashMap<Integer, Integer>();
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

    /**
     * Logs the begining of a test method
     *
     * @param thread
     * @param testSignature
     */
    public void writeTestStart(Thread thread, String testSignature) {
        if (transplantPointCalledInThisTest == null) {
            testCallsPerTransplantation = new HashMap<Integer, Integer>();
            transplantPointCalledInThisTest = new HashSet<Integer>();
        }
        transplantPointCalledInThisTest.clear();
    }

    public abstract void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var);

    /**
     * Counts an assert.
     *
     * Counts how many asserts per transformation line
     */
    public void countAssert() {
        for (Integer i : transplantPointCalledInThisTest) {
            if (!assertionsPerTransplantation.containsKey(i)) {
                assertionsPerTransplantation.put(i, 1);
            } else {
                int k = assertionsPerTransplantation.get(i) + 1;
                assertionsPerTransplantation.put(i, k);
            }
        }
    }

    public abstract void writeVar(int id, Thread thread, String methodSignatureId, Object... var);

    public abstract void writeException(int id, Thread thread,
                                        String className, String methodSignature, Object exception);

    public abstract void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception);

    public abstract void close();

    /**
     * Count the call of a transplant point.
     *
     * @param transplantationPoint
     */
    public void countSourcePositionCall(int transplantationPoint) {

        //Count point calls
        if (!transplantPointCallCount.containsKey(transplantationPoint)) {
            transplantPointCallCount.put(transplantationPoint, 1);
        } else {
            int k = transplantPointCallCount.get(transplantationPoint) + 1;
            transplantPointCallCount.put(transplantationPoint, k);
        }

        //Count test calls
        if (transplantPointCalledInThisTest != null) {

            //Add just once the test to the transplantation point
            if (!transplantPointCalledInThisTest.contains(transplantationPoint)) {
                transplantPointCalledInThisTest.add(transplantationPoint);

                if (!testCallsPerTransplantation.containsKey(transplantationPoint)) {
                    testCallsPerTransplantation.put(transplantationPoint, 1);
                } else {
                    int k = testCallsPerTransplantation.get(transplantationPoint) + 1;
                    testCallsPerTransplantation.put(transplantationPoint, k);
                }
            }
        }
    }


    /**
     * Writes the source position calls information to file
     *
     * @param filePath
     */
    protected void writeSourcePositionCallToFile(String filePath) {
        try {
            if (transplantPointCallCount.size() > 0) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath), 8 * 1024);
                for (Map.Entry<Integer, Integer> p : transplantPointCallCount.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(p.getKey())
                            .append(", ")
                            .append(p.getValue());
                    if (transplantPointCalledInThisTest != null) {
                        sb.append(", ")
                                .append(testCallsPerTransplantation.get(p.getKey()))
                                .append(", ");
                        if (assertionsPerTransplantation.containsKey(p.getKey())) {
                            sb.append(assertionsPerTransplantation.get(p.getKey()));
                        } else {
                            sb.append(0);
                        }
                    }
                    sb.append("\r\n");
                    writer.write(sb.toString());
                }
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

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
    protected void resetCallDepth(Thread thread) {
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
}
