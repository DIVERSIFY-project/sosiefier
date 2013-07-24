package fr.inria.diversify.sosie.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class LogWriter {
    static private FileWriter fileWriter;
    static private Map<Thread, String> threadId;
    static private String separator = ":;:";


    protected static void init() throws IOException {
        String fileName = initFileName();
        fileWriter = new FileWriter(fileName);

        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);

        threadId = new HashMap<Thread, String>();
    }

    private static String initFileName() {
        String fileName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogfileName"));
            fileName = reader.readLine();
        } catch (IOException e) {
            fileName = "log"+System.currentTimeMillis();
        }
        return fileName;
    }

    public static void writeLog(int id,Thread thread, String className, String methodSignature, Object... var) {
        if(fileWriter == null)
            try {
                init();
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            fileWriter.append(id+"");
            fileWriter.append(separator);
            fileWriter.append(getThreadId(thread));
            fileWriter.append(separator);
            fileWriter.append(className);
            fileWriter.append(separator);
            fileWriter.append(methodSignature);

            for (int i = 0; i < var.length/2; i = i + 2) {
                fileWriter.append(separator);
                fileWriter.append(var[i].toString());
                fileWriter.append(separator);
                fileWriter.append(var[i+1]+"");
            }

            fileWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        if(fileWriter != null)
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static String getThreadId(Thread thread) {
        String id = threadId.get(thread);
        if(id == null) {
            id = thread.getName();
            threadId.put(thread, id);
        }
        return id;
    }
}
