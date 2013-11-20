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
    private static String currentTestSignature;
    private static Map<String,String> idMap;


    protected synchronized static FileWriter init(Thread thread) throws IOException {
        if(fileWriters == null) {
            if(dir == null)
                initDir();
            try {
                idMap = loadIdMap(dir+"/id");
            }   catch (Exception e) {
                idMap = new HashMap<String, String>();
            }

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

    private static void initDir() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogDirName"));
            dir = new File("log"+reader.readLine());

        } catch (IOException e) {
            dir = new File("log");
        }
        dir.mkdir();
    }

    private static String initFileName(Thread thread) {
        String fileName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogfileName"));
            fileName = reader.readLine() + "_" + currentTestSignature +"_"+ thread.getName();
        } catch (IOException e) {
            fileName = "log" + thread.getName() + "_" + currentTestSignature +"_"+ System.currentTimeMillis();
        }
        return fileName;
    }

    public static void writeLog(int id,Thread thread, String className, String methodSignature, Object... var) {
        FileWriter fileWriter = null;
        try {
                fileWriter = init(thread);
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            fileWriter.append("$$$\n");
//            fileWriter.append(id+"");
//            fileWriter.append(separator);
            fileWriter.append(idFor(className));
            fileWriter.append(separator);
            fileWriter.append(idFor(methodSignature));

            for (int i = 0; i < var.length/2; i = i + 2) {
                fileWriter.append(separator);
                fileWriter.append(idFor(var[i].toString()));
                fileWriter.append(separator);
                fileWriter.append(var[i+1].toString());
            }
        } catch (IOException e) {
            e.printStackTrace();


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
            fileWriter.append("ST");
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

    public static void writeTestStart(String testSignature) throws IOException {
        currentTestSignature = testSignature;

        if(fileWriters != null) {
            synchronized (fileWriters) {
                close();
                fileWriters.clear();
            }
        }
    }

    public static void writeException(int id,Thread thread, String className, String methodSignature, Object exception) {
        FileWriter fileWriter = null;
        try {
            fileWriter = init(thread);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.append("$$$\n");
            fileWriter.append("ST");
            fileWriter.append(separator);
            fileWriter.append(id+"");
            fileWriter.append(separator);
            fileWriter.append(className);
            fileWriter.append(separator);
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
        try {
            writeIdFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static String idFor(String string) {
        if(!idMap.containsKey(string))
            idMap.put(string,idMap.size()+"");

        return idMap.get(string);
    }

    protected static void writeIdFile() throws IOException {
        FileWriter fw = new FileWriter(dir.getAbsolutePath()+"/id");

        for(String s : idMap.keySet())
            fw.write(idMap.get(s)+ " " +s+"\n");

        fw.close();
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
