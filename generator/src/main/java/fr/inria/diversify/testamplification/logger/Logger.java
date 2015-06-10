package fr.inria.diversify.testamplification.logger;


import java.util.HashMap;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
@Deprecated
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
            LogWriter l = new AssertLogWriter();
            logs.put(thread, l);
            return l;
        }
    }

    public static void testCount(String methodSignatureId) {
        getLog().testCount(methodSignatureId);
    }

    public static void assertCount(String methodSignatureId) {
        getLog().assertCount(methodSignatureId);
    }

    public static void methodCall(Thread thread, String methodSignatureId) {
        getLog(thread).methodCall(thread, methodSignatureId);
    }

    public static void methodOut(Thread thread) {
        getLog(thread).methodOut(thread);
    }

    public static void logAssertArgument(Thread thread, int idAssertTarget, Object target, int idAssertInvocation, Object invocation) {
        getLog(thread).logAssertArgument(thread,idAssertTarget, target, idAssertInvocation, invocation);
    }

    public static void logAssertArgument(Thread thread, int idAssert, Object invocation) {
        getLog(thread).logAssertArgument(thread,idAssert,invocation);
    }

    public static void writeTestStart(Thread thread, Object thisObject, String testSignature) {
        getLog(thread).writeTestStart(thread, thisObject, testSignature);
    }

    public static void writeTestStart(Thread thread, String testSignature) {
        getLog(thread).writeTestStart(thread, testSignature);
    }

    public static void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var) {
        getLog(thread).writeAssert(id, thread, className, methodSignature, assertName, var);
    }

    public static void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        getLog(thread).writeVar(id, thread, methodSignatureId, var);
    }

    public static void writeException(int id, Thread thread, Object exception) {
        getLog(thread).writeException(id, thread, exception);
    }

    public static void writeCatch(int id, Thread thread, Object exception) {
        getLog(thread).writeCatch(id, thread, exception);
    }

    /**
     * Perform actions on the completion of the test
     */
    public static void writeTestFinish(Thread thread) {
        getLog().writeTestFinish(thread);
    }

    public  static void close() {
        for ( LogWriter l : logs.values() ) {
            l.close();
        }
    }
}