package fr.inria.diversify.logger.logger;


import java.util.HashMap;

/**
 * User: Simon
 * Date: 15/04/15
 */
public class Logger {
    private static HashMap<Thread, LogWriter> logs = null;

    /**
     * This is an option. By the default the verbose log is used.
     * @param log
     */
    public static void setLog(HashMap<Thread, LogWriter> log) {
        Logger.logs = log;
    }

    protected static LogWriter getLog() {
        return getLog(Thread.currentThread());
    }

    protected static LogWriter getLog(Thread thread) {
        if ( logs == null ) { logs = new HashMap<Thread, LogWriter>(); }
        if ( logs.containsKey(thread) ) {
            return logs.get(thread);
        } else {
            LogWriter l = new LogWriter(thread);
            logs.put(thread, l);
            return l;
        }
    }

    public static void logAssertArgument(Thread thread, int idAssert, Object invocation) {
        getLog(thread).logAssertArgument(idAssert,invocation);
    }

    public static void branch(Thread thread, String id) {
        getLog(thread).branch(id);
    }

    public static void methodIn(Thread thread, String id) {
        getLog(thread).methodIn(id);
    }

    public static void methodOut(Thread thread, String id) {
        getLog(thread).methodOut(id);
    }

    public static void writeField(Thread thread, int methodId, int localPositionId, int varId, Object var) {
        getLog(thread).writeVar(methodId, varId, localPositionId, var);
    }

    public static void writeTestStart(Thread thread, Object receiver, String testName) {
        getLog(thread).writeTestStart(testName, receiver);
    }

    public static void writeTestStart(Thread thread , String testName) {
        getLog(thread).writeTestStart(testName);
    }

    public static void writeTestFinish(Thread thread) {
        getLog(thread).writeTestFinish();
    }

    public  static void close() {
        for ( LogWriter l : logs.values() ) {
            l.close();
        }
    }
}
