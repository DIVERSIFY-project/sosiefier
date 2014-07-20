package fr.inria.diversify.sosie.logger;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * A reader to read binary log files
 *
 * Created by marodrig on 17/07/2014.
 */
public class BinaryLogReader {

    public class LogChunk {
        private LogChunk(DataInputStream stream) throws IOException {

        }

        public LogChunk() {}
    }

    /**
     * A class representing a test chunk
     */
    public class TestChunk extends LogChunk {
        private String name;
        public String getName() { return name; }
        private TestChunk(DataInputStream stream) throws IOException {
            name = stream.readUTF();
        }
    }

    public class MethodCallChunk extends LogChunk {
        private int id;
        private String signature;
        private int currentDepth;
        public int getId() { return id; }
        public String getSignature() { return signature; }
        public int getCurrentDepth() { return currentDepth; }

        private MethodCallChunk(byte optByte, DataInputStream stream) throws IOException {
            int sizeID = (optByte >> 3) & 0x3;
            int depthID = (optByte >> 5) & 0x3;
            boolean newSignature = ((optByte >> 7) & 0x1) == 1;
            if ( newSignature ) {
                signature = stream.readUTF();
                id = readVariableSizeInt(stream, sizeID);
            }
            else {
                id = stream.readInt();
                signature = methodMap.get(id);
            }
            currentDepth = readVariableSizeInt(stream, depthID);
        }

    }

    public class VariableChunk extends LogChunk {
        private VariableChunk(DataInputStream stream) throws IOException {

        }
    }

    public class ExceptionChunk extends LogChunk {
        private ExceptionChunk(DataInputStream stream) throws IOException {
            super(stream);
        }
    }

    public class CatchChunk extends LogChunk {
        private CatchChunk(DataInputStream stream) throws IOException {
            super(stream);
        }
    }

    public class AssertChunk extends LogChunk {
        private AssertChunk(DataInputStream stream) throws IOException {
            super(stream);
        }
    }

    private int readVariableSizeInt(DataInputStream stream, int size) throws IOException {
        byte[] bytes = new byte[size];
        stream.read(bytes);
        int result = 0;
        for ( int i = 0; i < size; i++ ) {
            result |= bytes[i] >> (i * 8);
        }
        return result;
    }

    private DataInputStream stream;

    private boolean eof;

    //Map bein readed
    protected Map<Integer, String> idMap;

    //Map with the name of the methods
    protected Map<Integer, String> methodMap;

    public BinaryLogReader(File file) throws FileNotFoundException {
        this(new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
        eof = false;
    }

    public BinaryLogReader(DataInputStream stream) {
        idMap = new HashMap<>();
        methodMap = new HashMap<>();
        this.stream = stream;
        eof = false;
    }

    /**
     * Reads the next chunk of the trace.
     * @return The log chunk readed
     * @throws IOException In case we are unable to read from the stream
     */
    public LogChunk next() throws IOException {

        byte optByte = stream.readByte();
        //Only the first 3 bits of the optByte are the magic number
        byte magic = (byte)(optByte & 7);
        switch (magic) {
            case InstruBinaryLog.LOG_TEST:
                return new TestChunk(stream);
            case InstruBinaryLog.LOG_METHOD:
                return new MethodCallChunk(optByte, stream);
            case InstruBinaryLog.LOG_VAR:
                throw new NotImplementedException();

            case InstruBinaryLog.LOG_EXCEPTION:
                throw new NotImplementedException();

            case InstruBinaryLog.LOG_CATCH:
                throw new NotImplementedException();

            case InstruBinaryLog.LOG_ASSERT:
                throw new NotImplementedException();

            case InstruBinaryLog.LOG_CLOSE:
                eof = true;
                return null;

            default:
                throw new IOException("Unknown magic number, File is corrupted or not proper format");
        }
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

    public boolean eof() {
        return this.eof;
    }

}
