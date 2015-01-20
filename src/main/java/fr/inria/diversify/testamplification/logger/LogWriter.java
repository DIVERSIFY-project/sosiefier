package fr.inria.diversify.testamplification.logger;


import java.io.*;
import java.util.*;
import java.util.concurrent.Semaphore;

/**
 * Abstract classes for all loggers
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public abstract class LogWriter {

    //Thread containing the test
    private final Thread thread;

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


    public int getCallDeep(Thread t) {
        return callDeep.containsKey(t) ? callDeep.get(t) : 0;
    }


    /**
     * Constructor for the logger
     */
    public LogWriter() {
        if (dir == null) {
            initDir();
        }
        semaphores = new HashMap<String, Semaphore>();
        callDeep = new HashMap<Thread, Integer>();
        logMethod = new HashMap<Thread, Boolean>();


        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);
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
    protected void initDir() {
        String logDirName = "log";
        dir = new File(logDirName);

        while (!isLogDir(dir)) {
            logDirName = "../" + logDirName;
            dir = new File(logDirName);
        }
    }

    protected boolean isLogDir(File dir) {
        if(dir.exists()) {
            for(File fileInDir : dir.listFiles()) {
                if(fileInDir.getName().equals("id")) {
                    return true;
                }
            }
        }
        return false;
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

    /**
     * Logs the completion of a tests
     */
    public abstract void writeTestFinish(Thread thread);

    public abstract void testCount(String signature);

    public abstract void assertCount(String signature);

    //Thread containing the test
    public Thread getThread() {
        return thread;
    }

    public abstract void writeTestStart(Thread thread, String testSignature);
}
