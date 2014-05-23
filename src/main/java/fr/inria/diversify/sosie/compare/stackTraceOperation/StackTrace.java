package fr.inria.diversify.sosie.compare.stackTraceOperation;

import fr.inria.diversify.sosie.compare.stackElement.*;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTrace {
    protected List<StackTraceOperation> stackTraceOperations;
    protected Stack<StackTraceCall> stackTraceCalls;
    protected Map<String,Object> variablesValue;
    protected int position;
    protected int deep;
    protected String name;
    protected String threadName;


    public StackTrace() {
        stackTraceCalls = new Stack<>();
        stackTraceOperations = new ArrayList<>();
        variablesValue = new HashMap<>();
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

    public StackTraceCall getTop() {
        if(stackTraceCalls.isEmpty())
            return new StackTraceCall(null, 0, new HashMap<>());
        return stackTraceCalls.peek();
    }
    public StackTraceCall getTop2() {
        if (stackTraceCalls.size() - 2 < 0)
            return new StackTraceCall(null, 0, new HashMap<>());
        return stackTraceCalls.get(stackTraceCalls.size() - 2);
    }

    public boolean hasNext() {
        return position < stackTraceOperations.size();
    }




    public void parseFile(String name, List<String> trace, Map<String,String> idMap) throws Exception {
//        parseFileName(file.getName());

//        BufferedReader reader = new BufferedReader(new FileReader(file));
//        reader.readLine();
//        String line = reader.readLine();
//        String tmp = "";
//        if(line == null)
//            throw new Exception("empty file");
//        while (line != null) {
//            if(!line.isEmpty()) {
//                if(line.endsWith("$$$")) {
//                    try {
//                        addElement(tmp + line.substring(0, line.length() - 3), idMap);
//                        tmp = "";
//                    } catch (Exception e) {
//                        Log.error("malformed line: {}",line);
//                        tmp = "";
//                    }
//                }
//                else {
//                    tmp = tmp + line;
//                }
//            }
//            line = reader.readLine();
//        }
//        addElement(tmp, idMap);
        this.name = name;

        for(String operation: trace) {
            addElement(operation, idMap);
        }

        stackTraceCalls.clear();
    }

    protected void addElement(String line, Map<String, String> idMap) {
        String type = line.substring(0, 1);
        if(type.equals("A"))
            return;
        int i = line.indexOf(";".charAt(0));
        int deep =  Integer.parseInt(line.substring(1, i));

        StackTraceElement elem = parseElement(type, deep, line.substring(i+1,line.length()), idMap);

        if(elem instanceof StackTraceCall)
            addCall((StackTraceCall) elem, deep);
        else {
            try {
                stackTraceOperations.add(new StackTraceVariableObservation((StackTraceVariable) elem));
            } catch (Exception e) {}
        }
    }

    protected void addCall(StackTraceCall elem, int deep) {
        int pop = 0;
        while(!stackTraceCalls.isEmpty() && stackTraceCalls.peek().getOriginalDeep() >= deep) {
            stackTraceCalls.pop();
            pop++;
        }
        if(pop != 0)
            stackTraceOperations.add(new StackTracePop(pop));
        stackTraceCalls.push(elem);
        stackTraceOperations.add(new StackTracePush(elem));
    }

    protected StackTraceElement parseElement(String type, int deep, String value, Map<String, String> idMap) {
        StackTraceElement st = null;
        if(type.equals("M"))
            st = new StackTraceCall(value, deep, idMap);
        if(type.equals("V"))
            st = new StackTraceVariable(value, deep, idMap);
        if(type.equals("E"))
            st = new StackTraceException(value, deep);
        if(type.equals("C"))
            st = new StackTraceCatch(value, deep);

        return st;
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

    public Stack<StackTraceCall> getStackTraceCalls() {
        return stackTraceCalls;
    }

    public Map<String,Object> getVariable() {
        return variablesValue;
    }
}
