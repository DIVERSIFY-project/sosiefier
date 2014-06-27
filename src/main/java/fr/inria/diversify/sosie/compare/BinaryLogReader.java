package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;

import java.io.*;
import java.util.List;

/**
 * A class to help in reading a binary stack trace.
 *
 * Created by marodrig on 27/06/2014.
 */
public class BinaryLogReader {

    /**
     * Read a binary log contained in a file
     * @param f File with the binary log
     * @return An stack trace
     */
    /*
    public StackTrace readBinaryLogFile(File f) throws FileNotFoundException {
        DataInputStream si = new DataInputStream(new
                BufferedInputStream(new FileInputStream(f)));

    }
*/
    /**
     * Reads all binary logs of a directory
     * @param dirPath Path of the directory
     * @return A lis of stack traces for all logs
     */
    /*
    public List<StackTrace> readBinaryLogDir(String dirPath) {
        File dir = new File(dirPath);
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".binlog");
            }
        };

        for (File f: dir.listFiles(filter) ) {

        }
    }*/

}
