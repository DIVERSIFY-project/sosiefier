package fr.inria.diversify.sosie.logger;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class BinLogWriter {


    private static InstruLogWriter log = null;

    /**
     * This is an option. By the default the compact log is used.
     * @param log
     */
    public static void setLog(InstruLogWriter log) {
        BinLogWriter.log = log;
    }

    public static void methodCall(Thread thread, String methodSignatureId) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.methodCall(thread, methodSignatureId);
    }

    public static void methodOut(Thread thread) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.methodOut(thread);
    }

    public static void writeTestStart(Thread thread, String testSignature) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.writeTestStart(thread, testSignature);
    }

    public static void writeAssert(int id, Thread thread, String className,
                                     String methodSignature, String assertName, Object... var) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.writeAssert(id, thread, className, methodSignature, assertName, var);
    }

    public static void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.writeVar(id, thread, methodSignatureId, var);
    }

    public static void writeException(int id, Thread thread,
                                        String className, String methodSignature, Object exception) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.writeException(id, thread, className, methodSignature, exception);
    }

    public static void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        if ( log == null ) { log = new InstruCompactLog("LogDirName"); }
        log.writeCatch(id, thread, className, methodSignature, exception);
    }

    public  static void close() {
        if ( log != null ) {
            log.close();
        }
    }
}