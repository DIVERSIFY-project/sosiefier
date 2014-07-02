package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackElement.*;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.sosie.logger.InstruCompactLog;
import fr.inria.diversify.util.Log;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class to read stack elements from a file
 * <p/>
 * Created by marodrig on 01/07/2014.
 */
public class StackElementBinaryReader extends StackElementReader {

    //Map bein readed
    private Map<Integer, String> idMap;

    //Current log depth being readed
    private int currentDepth;

    @Override
    public List<StackTrace> loadLog(String dir, boolean recursive) throws IOException {

        //Load results
        List<StackTrace> result = new ArrayList<>();

        idMap = new HashMap<>();

        //Load all files recursively
        File directory = new File(dir);
        for (File f : directory.listFiles()) {
            if (recursive && f.isDirectory())
                result.addAll(loadLog(f.getAbsolutePath(), recursive));
            else {
                try {
                    Log.debug("parse file: {}", f.getAbsoluteFile());
                    result.addAll(loadLog(f));
                } catch (IOException e) {
                    Log.debug("error for: {}", f.getAbsoluteFile());
                }
            }
        }
        return result;
    }

    /**
     * Reads a single file from file
     *
     * @param f Name of the file
     * @return List of stack traces
     */
    public List<StackTrace> loadLog(File f) throws IOException {
        return loadLog(new DataInputStream(new BufferedInputStream(new FileInputStream(f))));
    }


    /**
     * Reads a single file from a DataInputStream
     *
     * @param dataInputStream
     * @return
     */
    public List<StackTrace> loadLog(DataInputStream dataInputStream) throws IOException {

        idMap = new HashMap<>();

        List<StackTrace> result = new ArrayList<StackTrace>();
        int magic = 0;
        StackTrace currentStackTrace = null;

        while (magic != InstruCompactLog.LOG_CLOSE) {

            magic = dataInputStream.readByte();
            switch (magic) {
                case InstruCompactLog.LOG_TEST:
                    currentStackTrace = new StackTrace();
                    readTest(dataInputStream, currentStackTrace);
                    result.add(currentStackTrace);
                    break;
                case InstruCompactLog.LOG_METHOD:
                    readMethod(dataInputStream, currentStackTrace);
                    break;
                case InstruCompactLog.LOG_VAR:
                    readVar(dataInputStream, currentStackTrace);
                    break;
                case InstruCompactLog.LOG_EXCEPTION:
                    readExceptions(dataInputStream, currentStackTrace);
                    break;
                case InstruCompactLog.LOG_CATCH:
                    readCatch(dataInputStream, currentStackTrace);
                    break;
                case InstruCompactLog.LOG_ASSERT:
                    readAssert(dataInputStream, currentStackTrace);
                    break;
                default:
                    throw new IOException("Unknown magic number, File is corrupted or not proper format");
            }
        }
        //dataInputStream.g
        //dataInputStream.reset();
        return result;
    }

    /**
     * Read vars from the stream
     *
     * @param stream Stream to read from
     * @param trace  Trace of the catch
     * @throws IOException
     */
    private void readVar(DataInputStream stream, StackTrace trace) throws IOException {
        /*
        os.writeByte(LOG_VAR);

                writeSignatures(os);
                String vars = buildVars(thread, separator, simpleSeparator, var);
                os.writeInt(vars.length());
                if ( vars != previousVarLog.get(thread) ) {
                    os.writeUTF(vars);
                }
                else { os.writeUTF("P"); }
        * */
        int id = stream.readInt();
        readSignatureChunk(stream);
        int methdId = stream.readInt();
        currentDepth = stream.readInt();
        int len = stream.readInt();
        String s = "";
        for (int i = 0; i < len; i++) {
            s += stream.readUTF();
        }
        StackTraceVariable v = new StackTraceVariable(s, currentDepth, idMap);
        trace.setDepth(currentDepth);
        trace.addElement(v);
    }

    /**
     * Read a catch from the stream
     *
     * @param stream Stream to read from
     * @param trace  Trace of the catch
     * @throws IOException
     */
    private void readCatch(DataInputStream stream, StackTrace trace) throws IOException {
        currentDepth = stream.readInt();
        int id = stream.readInt();
        readSignatureChunk(stream);
        int classId = stream.readInt();
        int methdId = stream.readInt();
        int excepId = stream.readInt();
        StackTraceCatch c = new StackTraceCatch(":D Feel Happy!!", currentDepth);
        trace.setDepth(currentDepth);
        trace.addElement(c);

    }

    /**
     * Reads a chunk of the signatures map
     *
     * @param stream
     */
    private void readSignatureChunk(DataInputStream stream) throws IOException {
        int size = stream.readInt();
        for (int i = 0; i < size; i++) {
            String id = stream.readUTF();
            int key = stream.readInt();
            idMap.put(key, id);
        }
    }

    /**
     * Read a test call from the stream
     *
     * @param stream Stream to read from
     * @param trace  Trace of the test
     * @throws IOException
     */
    private void readTest(DataInputStream stream, StackTrace trace) throws IOException {
        readSignatureChunk(stream);
        int id = stream.readInt();
        String name = idMap.get(id);
        trace.setName(name);
    }

    /**
     * Read a assert from the stream
     *
     * @param stream Stream to read from
     * @param trace  Trace of the test
     * @throws IOException
     */
    private void readAssert(DataInputStream stream, StackTrace trace) throws IOException {
        //why are we reading all this?
        readSignatureChunk(stream);
        int classId = stream.readInt();
        int methdId = stream.readInt();
        int assrtID = stream.readInt();
        int len = stream.readInt();
        for (int i = 0; i < len; i++) {
            String s = stream.readUTF();
        }
        //I guess in the future  will need it... but why not now?
        //trace.addElement(new StackTraceCatch(":D Feel happy!", currentDepth));
        //trace.setDepth(currentDepth);
    }

    /**
     * Read exceptions from the stream
     *
     * @param stream Stream to read from
     * @param trace  Trace of the test
     * @throws IOException
     */
    private void readExceptions(DataInputStream stream, StackTrace trace) throws IOException {
        //why are we reading all this?
        readSignatureChunk(stream);
        int classId = stream.readInt();
        int methdId = stream.readInt();
        int excepId = stream.readInt();
        //I guess in the future  will need it... but why not now?
        StackTraceException e = new StackTraceException(":D Feel happy!", currentDepth);
        trace.addElement(e);
        trace.setDepth(currentDepth);
    }

    /**
     * Read a method call from the stream
     *
     * @param stream Stream to read from
     * @param trace  Trace where the method is going to be stored
     * @throws IOException
     */
    protected void readMethod(DataInputStream stream, StackTrace trace) throws IOException {
        readSignatureChunk(stream);
        int id = stream.readInt();
        currentDepth = stream.readInt();
        StackTraceCall call = new StackTraceCall(id, currentDepth, idMap);
        trace.addElement(call);
        trace.setDepth(currentDepth);
    }

}
