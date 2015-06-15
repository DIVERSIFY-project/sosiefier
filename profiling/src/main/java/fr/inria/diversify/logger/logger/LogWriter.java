package fr.inria.diversify.logger.logger;



import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;


/**
 * Abstract classes for all loggers
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class LogWriter {
    private PrintWriter fileWriter;

    private String separator = ":;:";
    private String simpleSeparator = ";";
    private String end = "$$\n";

    private Map<Class, String[]> previousObservation;
    private Map<Class, Method[]> getters;
    private Map<Class, Field[]> fields;
    private Map<Class, String> classToId;

    private boolean isObserve = false;

    private static int count = 0;

    //Thread containing the test
    private final Thread thread;

    private Stack<StringBuilder> currentPaths;

    private Stack<String> previousBranchs;

    //current deep in the heap
    private int deep;

    //string : method id
    //Set<String> set of path
    private Map<String, Set<String>> allPath;

    ///Directory where the log is being stored
    protected File dir = null;


    ///Previous logs of variables status. Useful to validate whether they have change
    protected Map<String, String> previousVars;


    /**
     * Constructor for the logger
     */
    public LogWriter(Thread thread) {
        if (dir == null) {
            initDir();
        }
        currentPaths = new Stack<StringBuilder>();
        previousBranchs = new Stack<String>();

        previousObservation = new HashMap<Class, String[]>();

        previousVars = new HashMap<String, String>();
        getters = new HashMap<Class, Method[]>();
        fields = new HashMap<Class, Field[]>();
        classToId = new HashMap<Class, String>();

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
        if(!isObserve) {
            if (previousBranchs.size() == 0 || previousBranchs.peek() != id) {
                currentPaths.peek().append(simpleSeparator);
                currentPaths.peek().append(id);
            }
            previousBranchs.pop();
            previousBranchs.push(id);
        }
    }

    public void methodIn(String id) {
        if(!isObserve) {
            deep++;
            previousBranchs.push(null);
            currentPaths.push(new StringBuilder());
        }
    }

    public void methodOut(String id) {
        if(!isObserve) {
            String path = deep + currentPaths.pop().toString();
            deep--;
            previousBranchs.pop();

            if (!allPath.containsKey(id)) {
                allPath.put(id, new HashSet<String>());
            }
            Set<String> paths = allPath.get(id);

            if (!paths.contains(path)) {
                paths.add(path);
                try {
                    PrintWriter fileWriter = getFileWriter();
                    fileWriter.append(end);
                    fileWriter.append("P");
                    fileWriter.append(simpleSeparator);
                    fileWriter.append(id);
                    fileWriter.append(simpleSeparator);
                    fileWriter.append(path);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void writeTestStart(String testName, Object receiver) {
        if(!isObserve) {
            try {
                deep = 0;
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(end);
                fileWriter.append("TS");
                fileWriter.append(simpleSeparator);
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
                fileWriter.append(end);
                fileWriter.append(testName);
            } catch (Exception e) {
            }
        }
    }

    public void writeTestFinish() {
        if(!isObserve) {
            try {
                allPath.clear();
                PrintWriter fileWriter = getFileWriter();
                fileWriter.append(end);
                fileWriter.append("TE");
            } catch (Exception e) {
            }
        }
    }

    public void writeVar(int  methodId, int localPositionId, Object... var) {
        if(!isObserve) {
            isObserve = true;
            try {
                StringBuilder string = new StringBuilder();
                string.append("$$$\n");
                string.append("V");
                string.append(deep);
                string.append(simpleSeparator);
                string.append(localPositionId + "");
                string.append(simpleSeparator);
                string.append(methodId);

                String varsString = buildVars(methodId, localPositionId, var);
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


    protected String buildVars(int methodId, int localPositionId,Object[] vars) {
        String positionId = methodId + "." + localPositionId;
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
                String varId = positionId + ":" + varName;
                String previousValue = previousVars.get(varId);
                if (!value.equals(previousValue)) {
                    previousVars.put(varId, value);
                    varsString.append(separator);
                    varsString.append(varName);
                    varsString.append(simpleSeparator);
                    varsString.append(value);
                }
            } catch (Exception e) {
            }
        }
        return varsString.toString();
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
                string.append(end);
                string.append("As");
                string.append(simpleSeparator);
                string.append(idAssert + "");

                String varsString = observe(invocation);

                string.append(simpleSeparator);
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

    protected String observe(Object object) throws IOException, InterruptedException {
        Class objectClass;
        if(object == null) {
            objectClass = null;
        } else {
            objectClass = object.getClass();
        }
        Method[] classGetters = getGetters(objectClass);
        Field[] classPublicFields = getPublicFields(objectClass);
        String[] results = new String[classGetters.length + classPublicFields.length];

        int i = 0;
        for(; i < classGetters.length ; i++) {
            try {
                results[i] = formatVar(classGetters[i].invoke(object));
            } catch (Exception e) {
                results[i] = "null";
            }
        }
        int j= 0;
        for(; i < results.length ; i++) {
            try {
                results[i] = formatVar(classPublicFields[j].get(object));
            } catch (Exception e) {
                results[i] = "null";
            }
            j++;
        }
        StringBuilder sameValue = new StringBuilder();
        List<String> result = new ArrayList<String>();
        boolean sameValues = true;
        if(previousObservation.containsKey(objectClass)) {
            String[] pValues = previousObservation.get(objectClass);
            for (i = 0; i < results.length; i++) {
                if (pValues[i].equals(results[i])) {
                    sameValue.append("0");
                } else {
                    sameValues = false;
                    sameValue.append("1");
                    result.add(results[i]);
                    pValues[i] = results[i];
                }
            }
        } else {
            sameValues = false;
            String[] pValues = new String[results.length];
            for (i = 0; i < results.length; i++) {
                sameValue.append("1");
                result.add(results[i]);
                pValues[i] = results[i];
            }
            previousObservation.put(objectClass, pValues);
        }

        String classId = getClassId(objectClass);

        if(sameValues) {
            return classId;
        } else {
            return classId + simpleSeparator + sameValue.toString() + separator + join(result, separator);
        }
    }

    protected String getClassId(Class objectClass) throws IOException, InterruptedException {
        String className;
        if(objectClass == null) {
            className = "NullClass";
        } else {
            className = objectClass.getName();
        }

        if(!classToId.containsKey(objectClass)) {
            classToId.put(objectClass, count + "");

            PrintWriter fileWriter = getFileWriter();
            fileWriter.append(end + "Cl" + simpleSeparator + className + simpleSeparator + count);
            count++;
        }
        return classToId.get(objectClass);
    }

    protected String join(List<String> list, String conjunction)
    {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String item : list)
        {
            if (first)
                first = false;
            else
                sb.append(conjunction);
            sb.append(item);
        }
        return sb.toString();
    }

    protected String formatVar(Object object) {
        if (object == null) {
            return "null";
        }
        String string;
        if (object.getClass().isArray()) {
            string = Arrays.toString((Object[]) object);
        } else {
            string = object + "";
        }
        if(string.length() > 1000)
            string = string.length() + "";

        return string;
    }

    protected Field[] getPublicFields(Class aClass) throws IOException, InterruptedException {
        return fields.get(aClass);
    }

    protected Method[] getGetters(Class aClass) throws IOException, InterruptedException {
        if(!getters.containsKey(aClass)) {
            intGettersAndFields(aClass);
        }
        return getters.get(aClass);
    }


    protected void intGettersAndFields(Class aClass) throws IOException, InterruptedException {
        Method[] methods;
        Field[] publicFields;

        if(aClass == null) {
            methods = new Method[0];
            publicFields = new Field[0];
        } else {
            methods = findGetters(aClass);
            publicFields = findFields(aClass);
        }
        fields.put(aClass,publicFields);
        getters.put(aClass, methods);

        String classId = getClassId(aClass);

        PrintWriter fileWriter = getFileWriter();

        fileWriter.append(end + "Gt" + simpleSeparator + classId);
        for(Method method : methods) {
            fileWriter.append(simpleSeparator + method.getName());
        }
        for(Field field : publicFields) {
            fileWriter.append(simpleSeparator + field.getName());
        }
    }

    protected Field[] findFields(Class aClass) {
        List<Field> fields = new ArrayList<Field>();
        for(Field field : aClass.getFields()) {
            if(Modifier.isPublic(field.getModifiers())) {
                fields.add(field);
            }
        }
        Field[] ret = new Field[fields.size()];
        for(int i = 0; i < fields.size(); i++) {
            ret[i] = fields.get(i);
        }
        return ret;
    }

    protected Method[] findGetters(Class aClass){
        List<Method> getters = new ArrayList<Method>();
        for(Method method : aClass.getMethods()){
            if((isGetter(method) || isIs(method)) && !methodDefinedInObject(method)) {
                getters.add(method);
            }
        }

        try {
            Method toStringMethod = aClass.getMethod("toString");
            if(!methodDefinedInObject(toStringMethod)) {
                getters.add(toStringMethod);
            }
        } catch (NoSuchMethodException e) {}

        Method[] ret = new Method[getters.size()];

        for(int i = 0; i< ret.length; i++ ) {
            ret[i] = getters.get(i);
        }
        return ret;
    }

    protected boolean isIs(Method method) {
        return method.getName().startsWith("is")
                && method.getParameterTypes().length == 0;
    }

    protected boolean isGetter(Method method) {
        return method.getName().startsWith("get")
                && method.getParameterTypes().length == 0;
    }

    protected boolean methodDefinedInObject(Method method) {
        for(Method objectMethod : Object.class.getMethods()) {
            if(objectMethod.equals(method)) {
                return true;
            }
        }
        return false;
    }

    protected synchronized PrintWriter getFileWriter() throws IOException, InterruptedException {
        if (fileWriter == null) {
            String fileName = getThreadLogFilePath(thread) + "_" + System.currentTimeMillis();
            fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        }
        return fileWriter;
    }
}
