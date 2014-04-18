package fr.inria.diversify.sosie.stackTraceCompare;

import fr.inria.diversify.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTrace {
    protected List<StackTraceOperation> stackTraceOperations;
    protected Stack<StackTraceElement> stackTrace;
    protected int position;
    protected int deep;
    protected String name;
    protected String threadName;


    public StackTrace() {
        stackTrace = new Stack<>();
        stackTraceOperations = new ArrayList<>();
    }

    public int getDeep() {
        return deep;
    }

    public void next() {
        if(position < stackTraceOperations.size())
            stackTraceOperations.get(position).apply(this);
        position++;
    }

    public void previous() {
        if(position > 0) {
            position--;
            stackTraceOperations.get(position).restore(this);
        }
    }

    public void next(int count) {
        for(int i = 0; i < count; i++)
            next();

    }

    public void previous(int count) {
        for(int i = 0; i < count; i++)
            previous();
    }

    public StackTraceElement getTop() {
        if(stackTrace.isEmpty())
            return new StackTraceElement("",0);
        return stackTrace.peek();
    }

    public boolean hasNext() {
        return position < stackTraceOperations.size();
    }

    public void parseFile(File file, Map<String,String> idMap) throws Exception {
        parseFileName(file.getName());

        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();
        String tmp = "";
        if(line == null)
            throw new Exception("empty file");
        while (line != null) {
            if(!line.isEmpty()) {
                if(line.endsWith("$$$")) {
                    try {
                        addElement(tmp + line.substring(0, line.length() - 3), idMap);
                        tmp = "";
                    } catch (Exception e) {
                        Log.error("malformed line: {}",line);
                    }
                }
                else {
                    tmp = tmp + line;
                }
            }
            line = reader.readLine();
        }
        addElement(tmp, idMap);
        stackTrace.clear();
    }

    protected void addElement(String line, Map<String, String> idMap) {
        String[] tmp = line.split(";");
        if(!tmp[0].equals("C"))
            return;
        int deep = Integer.parseInt(tmp[2]);

        String name = "null";
        if(idMap.get(tmp[1]) != null)
            name = idMap.get(tmp[1]);
        StackTraceElement elem = new StackTraceElement(name, deep);

        int pop = 0;
        while(!stackTrace.isEmpty() && stackTrace.peek().originalDeep >= deep) {
            stackTrace.pop();
            pop++;
        }
        if(pop != 0)
            stackTraceOperations.add(new StackTracePop(pop));
        stackTrace.push(elem);
        stackTraceOperations.add(new StackTracePush(elem));
    }

    @Override
    public String toString() {
        return name;
    }

    protected void parseFileName(String fileName) {
        String[] tmp = fileName.split("_");
        threadName = tmp[0];
        name = fileName.substring(threadName.length()+1,fileName.length());
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return threadName+"_"+name;
    }

}
