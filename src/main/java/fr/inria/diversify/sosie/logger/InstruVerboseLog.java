package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Verbose log for humans to understand
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class InstruVerboseLog extends InstruLogWriter {

    ///File writer for each thread. Each one saved in a different file
    private Map<Thread, PrintWriter> fileWriters;

    private String separator = ":;:";

    private String simpleSeparator = ";";

    public InstruVerboseLog(String logDir) {
        super(logDir);
        previousVarLog = new HashMap<Thread, Set<String>>();
        fileWriters  = new HashMap<Thread, PrintWriter>();
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        System.out.println("new logger: "+  pid+ ", "+Thread.currentThread() + ", "+ Thread.currentThread().hashCode());
        System.out.println("fileWriters: "+  fileWriters);
    }

    public void methodCall(Thread thread, String methodSignatureId) {
        String semaphore = "";
        if (getLogMethod(thread)) {
            try {
                incCallDepth(thread);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("$$$\n");
                stringBuilder.append("M"); //new method call
                stringBuilder.append(callDeep.get(thread));
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(methodSignatureId);

                String string = stringBuilder.toString();
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                releaseFileWriter(semaphore);
            }
        }
    }

    public void methodOut(Thread thread) {
        decCallDepth(thread);
    }

    public void writeTestStart(Thread thread, String testSignature) {

        String semaphore = "";
        try {
            resetCallDepth(thread);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("$$$\n");
            stringBuilder.append("NewTest");
            stringBuilder.append(simpleSeparator);
            stringBuilder.append(testSignature);

            String string = stringBuilder.toString();
            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    public void writeAssert(int id, Thread thread, String className, String methodSignature, String assertName, Object... var) {
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

                } catch (Exception e) {
                }
                string.append(vars.toString());
            }
            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    public void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        String semaphore = "";
        if (getLogMethod(thread)) {
            try {
                StringBuilder string = new StringBuilder();
                string.append("$$$\n");
                string.append("V");
                string.append(callDeep.get(thread));
                string.append(simpleSeparator);
                string.append(id + "");
                string.append(simpleSeparator);
                string.append(methodSignatureId);

                String varsString = buildVars(thread, separator, simpleSeparator, var);

//                if (varsString.equals(previousVarLog.get(thread))) {
////                    string.append(separator);
////                    string.append("P");
//                    return;
//                } else {
                    string.append(varsString);
//                    previousVarLog.put(thread, varsString);
//                }
                startLogMethod(thread);
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                startLogMethod(thread);
                releaseFileWriter(semaphore);
            }
        }
    }


    public void writeException(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("E");
            string.append(callDeep.get(thread));
            string.append(simpleSeparator);
            string.append(id + "");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(simpleSeparator);
            if (exception != null)
                string.append(exception.toString());
            else
                string.append("NullException");

            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    public void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        try {
            StringBuilder string = new StringBuilder();
            string.append("$$$\n");
            string.append("C");
            string.append(callDeep.get(thread));
            string.append(simpleSeparator);
            string.append(id + "");
            string.append(simpleSeparator);
            string.append(className);
            string.append(simpleSeparator);
            string.append(methodSignature);
            string.append(simpleSeparator);
            if (exception != null)
                string.append(exception.toString());
            else
                string.append("NullException");

            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    public void close() {
        for (Thread thread : fileWriters.keySet()) {
            String semaphore = "";
            try {
                PrintWriter flw = getFileWriter(thread);
                semaphore = flw.toString() + flw.hashCode();
                flw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseFileWriter(semaphore);
        }
    }

    protected Map<String, String> loadIdMap(String file) throws IOException {
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

    protected synchronized PrintWriter getFileWriter(Thread thread) throws IOException, InterruptedException {
        if (!fileWriters.containsKey(thread)) {
            String fileName = getThreadLogFilePath(thread) + "_" + System.currentTimeMillis();
            System.out.println("new log file: " + fileName);

            PrintWriter f = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            fileWriters.put(thread, f);
            previousVarLog.put(thread,new HashSet());
            semaphores.put(f.toString() + f.hashCode(), new Semaphore(1));
        }
        PrintWriter f = fileWriters.get(thread);
        semaphores.get(f.toString() + f.hashCode()).tryAcquire(50, TimeUnit.MILLISECONDS);
        return f;
    }


    protected void releaseFileWriter(String id) {
        if (semaphores.containsKey(id))
            semaphores.get(id).release();
    }

}
