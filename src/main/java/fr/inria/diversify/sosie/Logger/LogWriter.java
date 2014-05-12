package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class LogWriter {
    static private File dir;
    static private Map<String, Semaphore> semaphores;
    static private Map<Thread, FileWriter> fileWriters;
    static private String separator = ":;:";
    static private String simpleSeparator = ";";
    protected static String currentTestSignature;
    protected static Map<Thread, String> previousVarLog;

    protected synchronized static FileWriter getFileWriter(Thread thread) throws IOException, InterruptedException {
        if (fileWriters == null) {
            if (dir == null)
                initDir();

            previousVarLog = new HashMap<Thread, String>();
            fileWriters = new HashMap<Thread, FileWriter>();
            semaphores = new HashMap<String, Semaphore>();
            ShutdownHookLog shutdownHook = new ShutdownHookLog();
            Runtime.getRuntime().addShutdownHook(shutdownHook);
        }
        if (!fileWriters.containsKey(thread)) {
            String fileName = initFileName(thread);
            FileWriter f = new FileWriter(dir.getAbsolutePath() + "/" + fileName);
            fileWriters.put(thread, f);
            semaphores.put(f.toString()+f.hashCode(), new Semaphore(1));
        }
        FileWriter f = fileWriters.get(thread);
        semaphores.get(f.toString()+f.hashCode()).tryAcquire(50, TimeUnit.MILLISECONDS);
        return f;
    }

    protected static void releaseFileWriter(String id) {
        if(semaphores.containsKey(id))
            semaphores.get(id).release();
    }

    protected static void initDir() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogDirName"));
            dir = new File("log" + reader.readLine());

        } catch (IOException e) {
            dir = new File("log");
        }
        dir.mkdir();
    }

    protected static String initFileName(Thread thread) {
        return "log" + thread.getName() + "_" + currentTestSignature;
    }

    public static void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("V");
            string.append(thread.getStackTrace().length);
            string.append(simpleSeparator);
            string.append(id + "");
//            string.append(simpleSeparator);
//            string.append(classId);
            string.append(simpleSeparator);
            string.append(methodSignatureId);

            StringBuilder vars = new StringBuilder();
            for (int i = 0; i < var.length / 2; i = i + 2) {
                StringBuilder tmp = new StringBuilder();
                try {
                    tmp.append(separator);
                    tmp.append(var[i].toString());
                    tmp.append(simpleSeparator);
                    if (var[i + 1] == null)
                        tmp.append("null");
                    else
                        tmp.append(var[i + 1].toString());
                    vars.append(tmp);
                } catch (Exception e) {
                }
            }

            if (vars.toString().equals(previousVarLog.get(thread))) {
                string.append(separator);
                string.append("P");
            } else {
                string.append(vars.toString());
                previousVarLog.put(thread, vars.toString());
            }

            FileWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString()+ fileWriter.hashCode();
            fileWriter.append(string.toString());

        } catch (Exception e) {  e.printStackTrace();}
        finally {
            releaseFileWriter(semaphore);
        }

    }

    public static void methodCall(Thread thread, String methodSignatureId) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("M"); //new method call
            string.append(thread.getStackTrace().length);
            string.append(simpleSeparator);
            string.append(methodSignatureId);

            FileWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString()+ fileWriter.hashCode();
            fileWriter.append(string.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            releaseFileWriter(semaphore);
        }
    }

    public static void writeTestStart(String testSignature) {
        currentTestSignature = testSignature;

        if (fileWriters != null) {
            synchronized (fileWriters) {
                close();
                fileWriters.clear();
            }
        }
    }

    public static void writeAssert(int id, Thread thread, String className, String methodSignature, String assertName, Object... var) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("A");
            string.append(simpleSeparator);
            string.append(id + "");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(simpleSeparator);
            string.append(assertName);

            StringBuilder vars = new StringBuilder();
            for (int i = 0; i < var.length; i++) {
                try {
                    vars.append(separator);
                    vars.append(printString(var[i]));

                } catch (Exception e) {}
                string.append(vars.toString());
            }
            FileWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString()+ fileWriter.hashCode();
            fileWriter.append(string.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            releaseFileWriter(semaphore);
        }
    }

    private static String printString(Object o) {
        String string;
        if (o == null)
            string = "null";
        else if (o instanceof Object[]) {
            Object[] array = (Object[]) o;
            int iMax = array.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; ; i++) {
                b.append(printString(array[i]));
                if (i == iMax)
                    return b.append(']').toString();
                b.append(", ");
            }
        } else
            string = o.toString();
        return string;
    }

    public static void writeException(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("E");
            string.append(thread.getStackTrace().length);
            string.append(simpleSeparator);
            string.append(id + "");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);;
            string.append(methodSignature);
            string.append(simpleSeparator);
            if (exception != null)
                string.append(exception.toString());
            else
                string.append("NullException");

            FileWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString()+ fileWriter.hashCode();
            fileWriter.append(string.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            releaseFileWriter(semaphore);
        }
    }

    public static void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("C");
            string.append(thread.getStackTrace().length);
            string.append(simpleSeparator);
            string.append(id + "");
            string.append(simpleSeparator);;
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(simpleSeparator);
            if (exception != null)
                string.append(exception.toString());
            else
                string.append("NullException");

            FileWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString()+ fileWriter.hashCode();
            fileWriter.append(string.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            releaseFileWriter(semaphore);
        }
    }

    public static void close() {
        for (Thread thread : fileWriters.keySet()) {
            String semaphore = "";
            try {
                FileWriter flw = getFileWriter(thread);
                semaphore = flw.toString()+flw.hashCode();
                flw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseFileWriter(semaphore);
        }
    }


    protected static Map<String, String> loadIdMap(String file) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();

        while (line != null) {
            String[] tmp = line.split(" ");
            map.put(tmp[1], tmp[0]);
            line = reader.readLine();
        }
        return map;
    }
}