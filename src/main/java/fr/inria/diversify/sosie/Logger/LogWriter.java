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

    public static void writeVar(int id,Thread thread, String methodSignatureId, Object... var) {
        FileWriter fileWriter;
        try {
            fileWriter = init(thread);

            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append(id+"");
//            string.append(simpleSeparator);
//            string.append(classId);
            string.append(simpleSeparator);
            string.append(methodSignatureId);
            synchronized (fileWriter) {
                fileWriter.append(string.toString());
            }
        } catch (Exception e) {
            return;
        }
        StringBuilder vars = new StringBuilder();
        for (int i = 0; i < var.length/2; i = i + 2) {
            StringBuilder string = new StringBuilder();
            try {
                string.append(separator);
                string.append(var[i].toString());
                string.append(simpleSeparator);
                string.append(var[i + 1].toString());
                vars.append(string);
            } catch (Exception e) {}
        }
        synchronized (fileWriter) {
            try {
                if (vars.toString().equals(previousVarLog.get(thread))) {
                    fileWriter.append(separator);
                    fileWriter.append("P");
                } else {
                    fileWriter.append(vars.toString());
                    previousVarLog.put(thread,vars.toString());
                }
            } catch (Exception e) {}
        }
    }

    public static void methodCall(Thread thread, String methodSignatureId) {
        try {
            FileWriter fileWriter = init(thread);

            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("C"); //new call
            string.append(simpleSeparator);
            string.append(methodSignatureId);
//            string.append(simpleSeparator);
//            string.append(methodSignatureId);

            synchronized (fileWriter) {
                fileWriter.append(string.toString());
            }
        } catch (Exception e) {
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

    public static void writeAssert(Thread thread, String className, String methodSignature, String assertName, Object... var) {
        try {
            FileWriter fileWriter = init(thread);

            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("A");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(separator);
            string.append(assertName);

            synchronized (fileWriter) {
                fileWriter.append(string.toString());
            }
            StringBuilder vars = new StringBuilder();
            for (int i = 0; i < var.length; i++) {
                string = new StringBuilder();
                try {
                    string.append(separator);
                    string.append(var[i].toString());
                    vars.append(string);
                } catch (Exception e) {}
            }
            synchronized (fileWriter) {
                fileWriter.append(vars.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeException(Thread thread, String className, String methodSignature, Object exception) {
        try {
            FileWriter fileWriter = init(thread);

            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("E");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(separator);
            if(exception != null)
                string.append(exception.toString());
            else
                string.append("NullException");

            synchronized (fileWriter) {
                fileWriter.append(string.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCatch(Thread thread, String className, String methodSignature, Object exception) {
        try {
            FileWriter fileWriter = init(thread);

            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("Ca");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(separator);
            if(exception != null)
                string.append(exception.toString());
            else
                string.append("NullException");

            synchronized (fileWriter) {
                fileWriter.append(string.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void close() {
        for (FileWriter flw : fileWriters.values())
            synchronized (flw) {
                try {
                    flw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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