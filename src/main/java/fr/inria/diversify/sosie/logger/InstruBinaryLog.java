package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.nio.ByteBuffer;
import java.security.KeyPair;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Compact log in binary format to reduce the size of the log
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class InstruBinaryLog extends InstruLogWriter {

    ///Magic number for method in log tuples
    public static final byte LOG_METHOD = 1;

    ///Magic number for transplantation point in log tuples
    public static final byte LOG_TRANSPLANT_CALL = 2;

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

    ///Class, test, exception has a signature that is assigned an integer value.
    // This way we save lots of space
    protected Map<String, Integer> idMap;

    ///Each method has a signature that is assigned an numeric value.
    // This way we save space
    protected Map<String, Integer> methodMap;

    //Current ID signature
    private int currentId;

    //Current ID signature for methods
    private int methodId;

    //We write the id map as we go. That way we may store it in the same file
    private int lastHashEntry = 0;

    //List of new hash entries before the last call of a write method
    ArrayList<HashMap.Entry<String, Integer>> lastSignatures;

    public InstruBinaryLog(String logDir) {
        super(logDir);

        //ATTENTION!!!: Remember we are copying these files to another source file
        //so they must be maintain in java 1.5
        lastSignatures = new ArrayList<HashMap.Entry<String, Integer>>();
        idMap = new HashMap<String, Integer>();
        currentId = 0;
        methodId = 0;
        methodMap = new HashMap<String, Integer>();
        streamsPerThread = new HashMap<Thread, DataOutputStream>();
    }

    protected void writeSignatures(DataOutputStream os) {
        try {
            os.writeInt(lastSignatures.size());
            for (HashMap.Entry<String, Integer> e : lastSignatures) {
                os.writeUTF(e.getKey());
                os.writeInt(e.getValue());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        lastSignatures.clear();
    }

    /**
     * Calculate the size in bytes a number takes
     * @param value
     * @return
     */
    private byte valueSize(int value) {
        byte size = 3;
        if ( value < 256 ) { size = 0; }
        else if ( value < 65536 ) { size = 1; }
        else if ( value < 16777216 ) { size = 2; }
        return size;
    }

    /**
     * Converts a integer into a byte array
     * @return A byte array
     */
    private byte[] fromIntToByte(int value, int valueSize) {
        byte[] result = new byte[valueSize];
        for (int i = 0; i < valueSize; i++) {
            result[i] = (byte) (value >> (i * 8));
        }
        return result;
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
                int id;

                boolean mustWriteSignature = !methodMap.containsKey(methodSignatureId);
                if (mustWriteSignature) {
                    methodId++;
                    methodMap.put(methodSignatureId, methodId);
                    id = methodId;
                } else {
                    id = methodMap.get(methodSignatureId);
                }
                DataOutputStream os = getStream(thread);
                int depth = incCallDepth(thread);
                //Write options byte for this method
                byte valueSizeId = valueSize(id);
                byte valueSizeDepth = valueSize(depth);

                //Write the options byte to file
                byte optByte = 0;
                optByte = (byte) (optByte | valueSizeId << 3);
                optByte = (byte) (optByte | valueSizeDepth << 5);
                optByte = (byte) (optByte | (mustWriteSignature ? (byte)1 : (byte)0) << 7);
                os.write(optByte);

                //Write the signature in case we need it
                if ( mustWriteSignature ) {
                    os.writeUTF(methodSignatureId);
                }
                //Write the id
                os.write(fromIntToByte(id, valueSizeId + 1));
                ///Write the depth
                os.write(fromIntToByte(depth, valueSizeDepth + 1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeTestStart(Thread thread, String testSignature) {
        try {
            //Each test runs in a 0 depth for what we care
            resetCallDepth(thread);
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_TEST);
            //int id = getSignatureId(testSignature);
            //Does not seem probable that the same test is called several times
            writeSignatures(os);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeSourcePositionCall(String transplantationPoint) {

    }

    @Override
    public void countAssert(String assertSignature) {

    }


    @Override
    public void writeAssert(int id, Thread thread, String className, String methodSignature, String assertName, Object... var) {
        try {
            //Each test runs in a 0 depth for what we care
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_ASSERT);
            int classID = getSignatureId(className);
            int methdID = getSignatureId(methodSignature);
            int assrtID = getSignatureId(assertName);
            writeSignatures(os);
            os.writeInt(classID);
            os.writeInt(methdID);
            os.writeInt(assrtID);
            os.writeInt(var.length);
            for (int i = 0; i < var.length; i++) {
                os.writeUTF(printString(var[i]));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {

        String separator = ":;:";
        String simpleSeparator = ";";

//        if ( previousVarLog == null ) { previousVarLog = new HashMap<Thread, String>(); }

        if (getLogMethod(thread)) {
            try {
                DataOutputStream os = getStream(thread);
                os.writeByte(LOG_VAR);
                int methdID = getSignatureId(methodSignatureId);
                writeSignatures(os);
                os.writeInt(id);
                os.writeInt(methdID);
                os.writeInt(getCallDeep(thread));
                String vars = buildVars(thread, separator, simpleSeparator, var);
                os.writeInt(vars.length());
                if ( previousVarLog.containsKey(thread) &&
                     !vars.equals(previousVarLog.get(thread)) ) {
                    os.writeUTF(vars);
                } else {
//                    previousVarLog.put(thread, vars);
                    os.writeUTF(separator+"P");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void writeException(int id, Thread thread, String className, String methodSignature, Object exception) {

        try {
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_EXCEPTION);
            int classId = getSignatureId(className);
            int methdId = getSignatureId(methodSignature);
            int excepId = getSignatureId(exception.toString());
            writeSignatures(os);
            os.writeInt(id);
            os.writeInt(getCallDeep(thread));
            os.writeInt(classId);
            os.writeInt(methdId);
            os.writeInt(excepId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {

        try {
            DataOutputStream os = getStream(thread);
            os.writeByte(LOG_CATCH);
            os.writeInt(getCallDeep(thread));
            os.writeInt(id);
            int classId = getSignatureId(className);
            int methdId = getSignatureId(methodSignature);
            int excepId = getSignatureId(exception.toString());
            writeSignatures(os);
            os.writeInt(classId);
            os.writeInt(methdId);
            os.writeInt(excepId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        for (Thread thread : streamsPerThread.keySet()) {
            //String semaphore = "";
            try {
                DataOutputStream os = getStream(thread);
                os.writeByte(LOG_CLOSE);
                os.flush();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    protected void writeStartLogging(Thread thread, String id) {

    }

    @Override
    public void writeTestFinish() {

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
                BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(fileName, true), 16 * 1024);
                DataOutputStream s = new DataOutputStream(bf);
                streamsPerThread.put(thread, s);
                //semaphores.put(s.toString() + s.hashCode(), new Semaphore(1));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        DataOutputStream s = streamsPerThread.get(thread);
        //semaphores.get(s.toString() + s.hashCode()).tryAcquire(50, TimeUnit.MILLISECONDS);
        return s;
    }


    /**
     * Gets the id Map id for a signature
     *
     * @param signature
     * @return
     */
    protected int getSignatureId(String signature) {
        if (!idMap.containsKey(signature)) {
            //Add the entry to log it now
            currentId++;
            HashMap.Entry<String, Integer> e = new HashMap.SimpleImmutableEntry<String, Integer>(signature, currentId);
            lastSignatures.add(e);
            //The map to know all the entries
            idMap.put(signature, currentId);
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
