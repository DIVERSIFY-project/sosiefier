package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class LogWriter {
    static private File dir;
    static private Map<Thread, FileWriter> fileWriters;
    static private String separator = ":;:";
    static private String simpleSeparator = ";";
    protected static String currentTestSignature;
    protected static Map<Thread, String> previousVarLog;
//    protected static Map<Thread, String> previousCall;

    protected synchronized static FileWriter init(Thread thread) throws IOException {
        if(fileWriters == null) {
            if(dir == null)
                initDir();

            previousVarLog = new HashMap<Thread, String>();
            fileWriters = new HashMap<Thread, FileWriter>();
            ShutdownHookLog shutdownHook = new ShutdownHookLog();
            Runtime.getRuntime().addShutdownHook(shutdownHook);
        }
        if(!fileWriters.containsKey(thread)) {
            String fileName = initFileName(thread);
            fileWriters.put(thread,new FileWriter(dir.getAbsolutePath()+"/"+fileName));
        }
        return fileWriters.get(thread);
    }

    protected static void initDir() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogDirName"));
            dir = new File("log"+reader.readLine());

        } catch (IOException e) {
            dir = new File("log");
        }
        dir.mkdir();
    }

    protected static String initFileName(Thread thread) {
        return "log" + thread.getName() + "_" + currentTestSignature;
    }

    public static void writeLog(int id,Thread thread, String classId, String methodSignatureId, Object... var) {
        FileWriter fileWriter = null;
        try {
            fileWriter = init(thread);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder string = new StringBuilder();
        synchronized (fileWriter) {
            try {
                string.append("$$$\n");
                string.append(id+"");
                string.append(simpleSeparator);
                string.append(classId);
                string.append(simpleSeparator);
                string.append(methodSignatureId);
                fileWriter.append(string.toString());
                fileWriter.flush();
            } catch (Exception e) {
                return;
            }
            StringBuilder vars = new StringBuilder();
            for (int i = 0; i < var.length/2; i = i + 2) {
                string = new StringBuilder();
                try {
                    string.append(separator);
                    string.append(var[i].toString());
                    string.append(simpleSeparator);
                    string.append(var[i + 1].toString());
                    vars.append(string);
                    //  System.out.println(string.toString());
                } catch (Exception e) {}
            }
            try {
                if (vars.toString().equals(previousVarLog.get(thread))) {
                    fileWriter.append(separator);
                    fileWriter.append("P");
                } else {
                    fileWriter.append(vars.toString());
                    previousVarLog.put(thread,vars.toString());
                }
                fileWriter.flush();
            } catch (Exception e) {}

        }
    }

    public static void methodCall(Thread thread, String classId, String methodSignatureId) {
        FileWriter fileWriter = null;
        try {
            fileWriter = init(thread);
        } catch (IOException e) {
            e.printStackTrace();
        }
        synchronized (fileWriter) {
            try {
                fileWriter.append("$$$\n");
                fileWriter.append("C"); //new call
                fileWriter.append(simpleSeparator);
                fileWriter.append(classId);
                fileWriter.append(simpleSeparator);
                fileWriter.append(methodSignatureId);
                fileWriter.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeError(int id,Thread thread, String className, String methodSignature, StackTraceElement[] stackTrace) {
        FileWriter fileWriter = null;
        try {
            fileWriter = init(thread);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.append("$$$\n");
            fileWriter.append("NT"); //new throws
            fileWriter.append(separator);
            fileWriter.append(id+"");
            fileWriter.append(separator);
            fileWriter.append(className);
            fileWriter.append(separator);
            fileWriter.append(methodSignature);

            for(StackTraceElement stackTraceElement :stackTrace) {
                fileWriter.append(separator);
                fileWriter.append(stackTraceElement.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTestStart(String testSignature) {
        currentTestSignature = testSignature;

        if(fileWriters != null) {
            synchronized (fileWriters) {
                close();
                fileWriters.clear();
            }
        }
    }

    public static void writeException(Thread thread, String className, String methodSignature, Object exception) {
        FileWriter fileWriter = null;
        try {
            fileWriter = init(thread);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.append("$$$\n");
            fileWriter.append("T");
            fileWriter.append(simpleSeparator);
            fileWriter.append(className);
            fileWriter.append(simpleSeparator);
            fileWriter.append(methodSignature);

            fileWriter.append(separator);
            if(exception != null)
                fileWriter.append(exception.toString());
            else
                fileWriter.append("NullException");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        for (FileWriter flw : fileWriters.values())
            try {
                flw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


    protected static Map<String,String> loadIdMap(String file) throws IOException {
        Map<String,String> map = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();

        while (line != null) {

            String[] tmp = line.split(" ");
            map.put(tmp[1],tmp[0]);
            line = reader.readLine();
        }
        return map;
    }
}