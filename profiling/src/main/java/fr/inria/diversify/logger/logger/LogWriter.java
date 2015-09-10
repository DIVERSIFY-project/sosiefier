package fr.inria.diversify.logger.logger;


import java.io.*;
import java.util.*;


public class LogWriter {
    private boolean fullPath = false;
    private PrintWriter fileWriter;

    private Map<Class, ClassObserver> classesObservers;

    private boolean isObserve = false;

    private boolean logMethodCall = true;

    private boolean writeVar = true;

    //Thread containing the test
    private final Thread thread;

    //current deep in the heap
    private int deep;

    private PathBuilder pathBuilder;

    ///Directory where the log is being stored
    protected File dir = null;

    ///Previous logs of variables status. Useful to validate whether they have change
//    protected Map<String, String> previousVars;

    /**
     * Constructor for the logger
     */
    public LogWriter(Thread thread) {
        if (dir == null) {
            initDir();
        }
        initOptions();
//        previousVars = new HashMap<String, String>();
        pathBuilder = new PathBuilder(fullPath);
        classesObservers = new HashMap<Class, ClassObserver>();

        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);
        this.thread = thread;
    }

    protected void initOptions() {
        try {
            File propertiesFile = new File(dir.getAbsolutePath() + "/options");
            if(propertiesFile.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(propertiesFile));
                fullPath = Boolean.parseBoolean((String) properties.getOrDefault("fullPath", "false"));
                logMethodCall = Boolean.parseBoolean((String) properties.getOrDefault("logMethodCall", "true"));
                writeVar = Boolean.parseBoolean((String) properties.getOrDefault("writeVar", "true"));
            }
        } catch (IOException e) {
            System.err.println("fr.inria.logger: error with properties file");
        }
    }

    /**
     * Gets the loggin path for the current thread
     *
     * @param thread Thread to log
     * @return The path with the log file
     */
    public String getThreadLogFilePath(Thread thread) {
        return dir.getAbsolutePath() + "/" + getThreadFileName(thread);
    }

    public void close(){
        fileWriter.append(KeyWord.endLine);
        fileWriter.close();
    }

    /**
     * Initializes the directory where the files for each thread are going to be stored
     */
    protected void initDir() {
        String logDirName = "log";
        dir = new File(logDirName);
        while (!isLogDir(dir)) {
            logDirName = "../" + logDirName;
            dir = new File(logDirName);
        }
    }

    protected boolean isLogDir(File dir) {
        if(dir.exists()) {
            for(File fileInDir : dir.listFiles()) {
                if(fileInDir.getName().equals("info")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns the file name of the file where this thread's log is being stored
     *
     * @param thread
     * @return Relative filename of the file where this thread's log is being stored
     */
    protected String getThreadFileName(Thread thread) {
        return "log" + thread.getName();
    }

    //Thread containing the test
    public Thread getThread() {
        return thread;
    }

    public void branch(String id) {
        if(!isObserve) {
            pathBuilder.addbranch(id);
        }
    }

    public void methodIn(String methodId) {
        if(!isObserve) {
            deep++;
            if(logMethodCall) {
                try {
                    PrintWriter fileWriter = getFileWriter();
                    fileWriter.append(KeyWord.endLine);
                    fileWriter.append(KeyWord.methodCallObservation);
                    fileWriter.append(KeyWord.simpleSeparator);
                    fileWriter.append(deep + "");
                    fileWriter.append(KeyWord.simpleSeparator);
                    fileWriter.append(methodId);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            pathBuilder.newPath();
        }
    }

    public void methodOut(String id) {
        if(!isObserve) {
            try {
                pathBuilder.printPath(id, deep, getFileWriter());
            } catch (Exception e) {}
            deep--;
        }
    }

    public void writeTestStart(String testName, Object receiver) {
        if(!isObserve) {
            try {
                deep = 0;
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(KeyWord.endLine);
                fileWriter.append(KeyWord.testStartObservation);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(receiver.getClass().getCanonicalName());
                fileWriter.append(".");
                fileWriter.append(testName);
            } catch (Exception e) {
            }
        }
    }

    public void writeTestStart(String testName) {
        if(!isObserve) {
            try {
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(KeyWord.endLine);
                fileWriter.append(testName);
            } catch (Exception e) {
            }
        }
    }

    public void writeTestFinish() {
        if(!isObserve) {
            try {
                pathBuilder.clear();
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(KeyWord.endLine);
                fileWriter.append(KeyWord.testEndObservation);
            } catch (Exception e) {
            }
        }
    }

    public void writeVar(String  methodId, Object... var) {
        if(!isObserve && writeVar) {
            isObserve = true;
            try {
                StringBuilder string = new StringBuilder();
                string.append(KeyWord.endLine);
                string.append(KeyWord.variableObservation);
                string.append(KeyWord.simpleSeparator);
                string.append(deep + "");
                string.append(KeyWord.simpleSeparator);
                string.append(methodId);
//                string.append(KeyWord.simpleSeparator);
//                string.append(localPositionId);

                String varsString = buildVars(var);
                if(varsString.isEmpty())
                    return;

                string.append(varsString);

                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(string.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                isObserve = false;
            }
        }
    }


    protected String buildVars(Object[] vars) {
        StringBuilder varsString = new StringBuilder();

        for (int i = 0; i < vars.length / 2; i = i + 2) {
            try {
                String varName = vars[i].toString();
                String value;
                if (vars[i + 1] == null) {
                    value = "null";
                } else {
                    value = vars[i + 1].toString();
                }
                if(value.length() > 1000) {
                    value = vars[i + 1].getClass().getCanonicalName() + value.length();
                }
//                String varId = positionId + ":" + varName;
//                String previousValue = previousVars.get(varId);
//                if (!value.equals(previousValue)) {
//                    previousVars.put(varId, value);
                    varsString.append(KeyWord.separator);
                    varsString.append(varName);
                    varsString.append(KeyWord.separator);
                    varsString.append(value);
//                }
            } catch (Exception e) {
            }
        }
        return KeyWord.simpleSeparator + varsString.substring(KeyWord.separator.length(), varsString.length());
    }

    public void logAssertArgument(int idAssertTarget, Object target,  int idAssertInvocation, Object invocation) {
        logAssertArgument(idAssertTarget, target);
        logAssertArgument(idAssertInvocation, invocation);
    }

    public void logAssertArgument(int idAssert, Object invocation) {
        if(!isObserve) {
            isObserve = true;
            try {
                StringBuilder string = new StringBuilder();
                string.append(KeyWord.endLine);
                string.append(KeyWord.assertObservation);
                string.append(KeyWord.simpleSeparator);
                string.append(idAssert + "");

                PrintWriter fileWriter = getFileWriter();
                string.append(KeyWord.simpleSeparator);
                observe(invocation, fileWriter);

                fileWriter.append(string.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                isObserve = false;
            }
        }
    }

    protected void observe(Object object, PrintWriter writer) throws IOException, InterruptedException {
        Class objectClass;
        if(object == null) {
            objectClass = null;
        } else {
            objectClass = object.getClass();
        }
        if(!classesObservers.containsKey(objectClass)) {
            classesObservers.put(objectClass, new ClassObserver(objectClass));
        }
        classesObservers.get(objectClass).observe(object,writer);
    }

    protected synchronized PrintWriter getFileWriter() throws IOException, InterruptedException {
        if (fileWriter == null) {
            String fileName = getThreadLogFilePath(thread) + "_" + System.currentTimeMillis();
            fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        }
        return fileWriter;
    }

    public void writeCatch(String methodId, String localPositionId, Object exception) {
        if(!isObserve) {
            isObserve = true;
            try {
                PrintWriter fileWriter = getFileWriter();

                fileWriter.append(KeyWord.endLine);
                fileWriter.append(KeyWord.catchObservation);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(deep + "");
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(methodId);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(localPositionId);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(exception.getClass().getCanonicalName());
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(exception.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                isObserve = false;
            }
        }
    }

    public void writeThrow(String methodId, String localPositionId, Object exception) {
        if(!isObserve) {
            isObserve = true;
            try {
                PrintWriter fileWriter = getFileWriter();

                fileWriter.append(KeyWord.endLine);
                fileWriter.append(KeyWord.throwObservation);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(deep + "");
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(methodId);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(localPositionId);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(exception.getClass().getCanonicalName());
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(exception.toString());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                isObserve = false;
            }
        }
    }

    public void logTransformation(String id) {
        if (!isObserve) {
            try {
                System.out.println("log transformation: "+id);
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(KeyWord.endLine);
                fileWriter.append(KeyWord.logTransformation);
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(deep + "");
                fileWriter.append(KeyWord.simpleSeparator);
                fileWriter.append(id);
            } catch (Exception e) {
            }
        }
    }
}
