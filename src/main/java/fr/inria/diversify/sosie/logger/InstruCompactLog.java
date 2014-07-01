package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Compact log in binary format to reduce the size of the log
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class InstruCompactLog extends InstruLogWriter {


    ///Magic number for method in log tuples
    public static final byte LOG_METHOD = 1;
    ///Magic number for class in log tuples
    public static final byte LOG_CLASS = 2;
    ///Magic number for tests in log tuples
    public static final byte LOG_TEST = 3;
    ///Magic number for asserts in log tuples
    public static final byte LOG_ASSERT = 4;
    ///Magic number for vars in log tuples
    public static final byte LOG_VAR = 5;
    ///Magic number for exceptions in log tuples
    public static final byte LOG_EXCEPTION = 6;
    ///Magic number for catchs in log tuples
    public static final byte LOG_CATCH = 7;
    ///Magic number for the end of the file
    public static final byte LOG_CLOSE = 8;

    ///DataInput for each thread. Each one saved in a different file
    private Map<Thread, DataOutputStream> streamsPerThread;

    ///Each method, class, test, exception has a signature that is assigned an integer value.
    // This way we save lots of space
    protected Map<String, Integer> idMap;

    //Current ID signature
    private int currentId;



    public InstruCompactLog(String logDir) {
        super(logDir);

        //Remember we are copying these files to another source file
        //so they must be maintain in java 1.5
        idMap = new HashMap<String, Integer>();
        currentId = 0;

        streamsPerThread = new HashMap<Thread, DataOutputStream>();
    }

    /**
     * Log a call to a method
     *
     * @param thread            Thread where the call is invoked
     * @param methodSignatureId Signature of the method
     */
    public void methodCall(Thread thread, String methodSignatureId) {
        try {
            if (getLogMethod(thread)) {
                int depth = incCallDepth(thread);
                DataOutputStream os = getStream(thread);
                os.writeByte(LOG_METHOD);
                os.writeInt(getSignatureId(methodSignatureId));
                os.writeInt(depth);
            }
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeTestStart(Thread thread, String testSignature) {
        try {
            //Each test runs in a 0 depth for what we care
            resetCallDepth(thread);
            int depth = incCallDepth(thread);
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_TEST);
            os.writeInt(getSignatureId(testSignature));
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }


    @Override
    public void writeAssert(int id, Thread thread, String className, String methodSignature, String assertName, Object... var) {
        try {
            //Each test runs in a 0 depth for what we care
            resetCallDepth(thread);
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_ASSERT);
            os.writeInt(getSignatureId(className));
            os.writeInt(getSignatureId(methodSignature));
            //The asserts are methods two...
            os.writeInt(getSignatureId(assertName));
            for (int i = 0; i < var.length; i++) {
                os.writeChars(printString(var[i]));
            }
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {

        String separator = ":;:";
        String simpleSeparator = ";";

        if (getLogMethod(thread)) {
            try {
                DataOutputStream os = getStream(thread);
                os.writeByte(LOG_VAR);
                os.writeInt(id);
                os.writeInt(getSignatureId(methodSignatureId));
                os.writeInt(callDeep.get(thread));
                String vars = buildVars(thread, separator, simpleSeparator, var);
                if ( vars != previousVarLog.get(thread) ) {
                    os.writeChars(vars);
                }
                else { os.writeChars("P"); }
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            } catch ( IOException e ) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void writeException(int id, Thread thread, String className, String methodSignature, Object exception) {

        try {
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_EXCEPTION);
            os.writeInt(callDeep.get(thread));
            os.writeInt(id);
            os.writeInt(getSignatureId(className));
            os.writeInt(getSignatureId(methodSignature));
            os.writeInt(getSignatureId(exception.toString()));

        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }


    @Override
    public void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {

        try {
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_CATCH);
            os.writeInt(callDeep.get(thread));
            os.writeInt(id);
            os.writeInt(getSignatureId(className));
            os.writeInt(getSignatureId(methodSignature));
            os.writeInt(getSignatureId(exception.toString()));
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {

        for (Thread thread : streamsPerThread.keySet()) {
            File f = new File(getThreadLogFilePath(thread) + ".id");
            String semaphore = "";
            try {
                DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

                os.writeByte(LOG_CLOSE);

                os.writeInt(idMap.keySet().size());
                for (String s : idMap.keySet()) {
                    os.write(idMap.get(s));
                    os.writeChars(s);
                }
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Gets the stream for a thread each one saved in a different file
     *
     * @param thread
     * @return
     */
    protected DataOutputStream getStream(Thread thread) throws InterruptedException {

        if (!streamsPerThread.containsKey(thread)) {
            String fileName = getThreadLogFilePath(thread);
            try {
                DataOutputStream s = new DataOutputStream(new BufferedOutputStream(
                        new FileOutputStream(fileName, true)));
                streamsPerThread.put(thread, s);
                semaphores.put(s.toString() + s.hashCode(), new Semaphore(1));

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        DataOutputStream s = streamsPerThread.get(thread);
        semaphores.get(s.toString() + s.hashCode()).tryAcquire(50, TimeUnit.MILLISECONDS);
        return s;
    }

    /**
     * Gets the id Map id for a signature
     * @param signature
     * @return
     */
    protected int getSignatureId(String signature) {
        if (!idMap.containsKey(signature)) {
            idMap.put(signature, currentId++);
            return currentId;
        }
        return idMap.get(signature);
    }

    /**
     * This method hash the values of var using their hash values
     *
     * @param var
     * @param os
     */
    private void printVars(Object[] var, DataOutputStream os) {

    }


    /*
    ///Each class name is assigned an integer value. This way we save lots of space
    protected Map<String, Integer> classID;

    ///Each class name is assigned an integer value. This way we save lots of space
    private Map<String, Integer> testID;

    ///Each class name is assigned an integer value. This way we save lots of space
    private Map<String, Integer> exceptionsID;
    */
    //Number of found method signatures so far. ID of the method signatures as they come
    /*
    //Number of class names so far. ID of the method signatures as they come
    private int foundClasses;

    //Number of tests names so far. ID of the method signatures as they come
    private int foundTest;

    //Number of exceptions names so far. ID of the method signatures as they come
    private int foundExceptions;
    */
}
