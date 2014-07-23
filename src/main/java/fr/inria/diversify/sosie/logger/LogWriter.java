package fr.inria.diversify.sosie.logger;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class LogWriter {


    private static InstruLogWriter log = null;

    /**
     * This is an option. By the default the verbose log is used.
     * @param log
     */
    public static void setLog(InstruLogWriter log) {
        LogWriter.log = log;
    }

    public static void methodCall(Thread thread, String methodSignatureId) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.methodCall(thread, methodSignatureId);
    }

    public static void methodOut(Thread thread) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.methodOut(thread);
    }

    public static void writeTestStart(Thread thread, String testSignature) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.writeTestStart(thread, testSignature);
    }

    public static void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.writeAssert(id, thread, className, methodSignature, assertName, var);
    }

    public static void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.writeVar(id, thread, methodSignatureId, var);
    }

    public static void writeException(int id, Thread thread,
                                        String className, String methodSignature, Object exception) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.writeException(id, thread, className, methodSignature, exception);
    }

    public static void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.writeCatch(id, thread, className, methodSignature, exception);
    }

    public  static void close() {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.close();
    }

    public static void startLogging(Thread thread, String id) {
        if ( log == null ) { log = new InstruVerboseLog("LogDirName"); }
        log.startLogging(thread, id);
    }
}