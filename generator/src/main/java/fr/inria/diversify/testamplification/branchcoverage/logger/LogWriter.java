package fr.inria.diversify.testamplification.branchcoverage.logger;



import java.io.*;
import java.util.*;


/**
 * Abstract classes for all loggers
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class LogWriter {
    private PrintWriter fileWriter;


    //Thread containing the test
    private final Thread thread;

    private Stack<StringBuilder> currentPaths;
    private Stack<String> previousBranchs;

    //string : method id
    //Set<String> set of path
    private Map<String, Set<String>> allPath;

    ///Directory where the log is being stored
    protected File dir = null;

    ///Dictionary indicating if the methods of a thread are to be logged.
//    protected Map<Thread, Boolean> logMethod;

//    ///Semaphores for locking output streams
//    protected Map<String, Semaphore> semaphores;

    ///Previous logs of variables status. Useful to validate whether they have change
    protected Map<Thread, Map<String, String>> previousVarLog;


    /**
     * Constructor for the logger
     */
    public LogWriter(Thread thread) {
        if (dir == null) {
            initDir();
        }
        currentPaths = new Stack<StringBuilder>();
        previousBranchs = new Stack<String>();

        ShutdownHookLog shutdownHook = new ShutdownHookLog();
        Runtime.getRuntime().addShutdownHook(shutdownHook);
        allPath = new HashMap<String, Set<String>>();
        this.thread = thread;
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
        if(previousBranchs.size() == 0 || previousBranchs.peek() != id) {
            currentPaths.peek().append(id);
            currentPaths.peek().append(" ");
        }
        previousBranchs.pop();
        previousBranchs.push(id);
    }

    public void methodIn(String id) {
        previousBranchs.push(null);
        currentPaths.push(new StringBuilder());
    }

    public void methodOut(String id) {
        String path = currentPaths.pop().toString();
        previousBranchs.pop();

        if(!allPath.containsKey(id)) {
            allPath.put(id, new HashSet<String>());
        }
        Set<String> paths = allPath.get(id);

        if(!paths.contains(path)) {
            paths.add(path);
            try {
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append("P "+ id + " " + path + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void writeTestStart(String testName, Object receiver) {
        try {
            PrintWriter fileWriter = getFileWriter();
            fileWriter.append(receiver.getClass().getCanonicalName() +"."+testName + "\n");
        } catch (Exception e) {}
    }

    public void writeTestStart(String testName) {
        try {
            PrintWriter fileWriter = getFileWriter();
            fileWriter.append(testName + "\n");
        } catch (Exception e) {}
    }

    public void writeTestFinish() {
        try {
            allPath.clear();
            PrintWriter fileWriter = getFileWriter();
            fileWriter.append("TN\n");
        } catch (Exception e) {}
    }

    protected synchronized PrintWriter getFileWriter() throws IOException, InterruptedException {
        if (fileWriter == null) {
            String fileName = getThreadLogFilePath(thread) + "_" + System.currentTimeMillis();
            fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        }
        return fileWriter;
    }


}
