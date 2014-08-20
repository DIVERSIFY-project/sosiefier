package fr.inria.diversify.sosie.logger;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
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
        previousVarLog = new HashMap();
        fileWriters  = new HashMap<Thread, PrintWriter>();
    }

    public void methodCall(Thread thread, String methodSignatureId) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
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

        super.writeTestStart(thread, testSignature);

        String semaphore = "";
        try {
            partialLoggingThread = null;

//            previousVarLog.get(thread).clear();
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

    protected  void writeStartLogging(Thread thread, String id) {
        String semaphore = "";
        if (getLogMethod(thread)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("$$$\n");
                stringBuilder.append("S"); //start logging
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(id);

                String string = stringBuilder.toString();
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                startLogMethod(thread);
                releaseFileWriter(semaphore);
            }
        }
    }

    public void writeVar(int id, Thread thread, String methodSignatureId, Object... var) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
            try {
                StringBuilder string = new StringBuilder();
                string.append("$$$\n");
                string.append("V");
                string.append(callDeep.get(thread));
                string.append(simpleSeparator);
                string.append(id + "");
                string.append(simpleSeparator);
                string.append(methodSignatureId);

                String varsString = buildVars(thread, id+methodSignatureId, var);
                if(varsString.isEmpty())
                    return;

                string.append(varsString);

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

    protected String buildVars(Thread thread, String methodSignatureId, Object[] vars) {
        StringBuilder varsString = new StringBuilder();
        stopLogMethod(thread);
        Map<String, String> previousVars = previousVarLog.get(thread);
        for (int i = 0; i < vars.length / 2; i = i + 2) {
            try {
                String varName = vars[i].toString();
                String value;
                if (vars[i + 1] == null) {
                    value = "null";
                } else {
                    value = vars[i + 1].toString();
                }

                String previousValue = previousVars.get(methodSignatureId+":"+varName);
                if(!value.equals(previousValue)) {
                    previousVars.put(methodSignatureId+":"+varName,value);

                    varsString.append(separator);
                    varsString.append(varName);
                    varsString.append(simpleSeparator);
                    varsString.append(value);
                }
            } catch (Exception e) {
            }
        }
        startLogMethod(thread);
        return varsString.toString();
    }



    public void writeException(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
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
                if (exception != null) string.append(exception.toString());
                else string.append("NullException");

                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                releaseFileWriter(semaphore);
            }
        }
    }

    public void writeCatch(int id, Thread thread, String className, String methodSignature, Object exception) {
        String semaphore = "";
        if (getLogMethod(thread) && log(thread)) {
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
                if (exception != null) string.append(exception.toString());
                else string.append("NullException");

                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                releaseFileWriter(semaphore);
            }
        }
    }

    public void close() {

        //Writes the Source position calls to file
        writeSourcePositionCallToFile("sourcePositionCall.log");

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
            previousVarLog.put(thread,new HashMap<String, String>());
            PrintWriter f = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            fileWriters.put(thread, f);
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
