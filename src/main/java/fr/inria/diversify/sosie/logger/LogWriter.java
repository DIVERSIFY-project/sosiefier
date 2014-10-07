package fr.inria.diversify.sosie.logger;

import java.util.HashMap;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class LogWriter {


    private static HashMap<Thread, InstruLogWriter> logs = null;

    private static Thread currentTestThread = null
            ;

    /**
     * This is an option. By the default the verbose log is used.
     * @param log
     */
    public static void setLog(HashMap<Thread, InstruLogWriter> log) {
        LogWriter.logs = log;
    }

    protected static InstruLogWriter getLog() {
        return getLog(Thread.currentThread());
    }

    protected static InstruLogWriter getLog(Thread thread) {
        if ( logs == null ) { logs = new HashMap<Thread, InstruLogWriter>(); }
        if ( logs.containsKey(thread) ) {
            return logs.get(thread);
        } else {
            InstruVerboseLog l;
            if ( currentTestThread == null ) {
                l = new InstruVerboseLog("LogDirName");
            } else {
                l = new InstruVerboseLog("LogDirName", logs.get(currentTestThread));
            }
            logs.put(thread, l);
            return l;
        }
    }

    public static void methodCall(Thread thread, String methodSignatureId) {
        getLog(thread).methodCall(thread, methodSignatureId);
    }

    public static void methodOut(Thread thread) {
        getLog(thread).methodOut(thread);
    }

    public static void writeTestStart(Thread thread, String testSignature) {
        getLog(thread).writeTestStart(thread, testSignature);
        currentTestThread = thread;
    }

    public static void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var) {
        getLog(thread).writeAssert(id, thread, className, methodSignature, assertName, var);
    }

    public static void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        getLog(thread).writeVar(id, thread, methodSignatureId, var);
    }

    public static void writeException(int id, Thread thread,
                                        String className, String methodSignature, Object exception) {
        getLog(thread).writeException(id, thread, className, methodSignature, exception);
    }

    public static void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        getLog(thread).writeCatch(id, thread, className, methodSignature, exception);
    }

    public static void countAssert(String s){
        getLog().countAssert(s);
    }

    /**
     * Counts the transplant source position. Is boolean to be able to insert it in boolean expressions
     * @param sourcePosition
     * @return false always
     */
    public static boolean writeSourcePositionCall(String sourcePosition) {
        getLog().writeSourcePositionCall(sourcePosition);
        return false;
    }

    /**
     * Perform actions on the completion of the test
     */
    public static void writeTestFinish() {
        getLog().writeTestFinish();
        currentTestThread = null;
    }

    public  static void close() {
        for ( InstruLogWriter l : logs.values() ) {
            l.close();
        }
    }

    public static void startLogging(Thread thread, String id) {
        getLog(thread).startLogging(thread, id);
    }
}