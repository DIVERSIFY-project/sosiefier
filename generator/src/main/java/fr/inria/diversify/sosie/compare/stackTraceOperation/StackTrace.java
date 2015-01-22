package fr.inria.diversify.sosie.compare.stackTraceOperation;

import fr.inria.diversify.sosie.compare.stackElement.*;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.util.Log;

import java.util.*;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTrace {
    private List<StackTraceOperation> stackTraceOperations;
    protected Stack<StackTraceCall> stackTraceCalls;
    protected Map<String,Object> variablesValue;
    protected int position;
    protected int deep;
    protected String name;
    protected boolean variablesValueChange;
    protected Set<Integer> startLogging;


    public void reset() {
        stackTraceCalls = new Stack();
        variablesValue = new HashMap();
        startLogging = new HashSet();
        deep = 0;
        position = 0;
    }
    public StackTrace() {
        stackTraceCalls = new Stack();
        stackTraceOperations = new ArrayList();
        variablesValue = new HashMap();
        startLogging = new HashSet();
    }

    public int getDeep() {
        return deep;
    }

    public void next() {
        if(position < getStackTraceOperations().size()) {
            variablesValueChange = false;
            getStackTraceOperations().get(position).apply(this);
            position++;
        }
    }

    public void previous() {
        if(position > 0) {
            variablesValueChange = false;
            position--;
            getStackTraceOperations().get(position).restore(this);
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
            return new StackTraceCall(0, 0, new HashMap<Integer, String>());
        return stackTraceCalls.peek();
    }
    public StackTraceCall getTop2() {
        if (stackTraceCalls.size() - 2 < 0)
            return new StackTraceCall(0, 0, new HashMap<Integer, String>());
        return stackTraceCalls.get(stackTraceCalls.size() - 2);
    }

    public boolean hasNext() {
        return position < getStackTraceOperations().size();
    }

    public void parseFile(String name, List<String> trace, Map<Integer,String> idMap) throws Exception {
        this.name = name;
        int i = 0;
        for(String operation: trace) {
            try {
                i++;
                if(operation.length() < 1000000) {
                    addElement(operation, idMap);
                } else {
                    Log.warn("error too big operation");
                }
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }

        stackTraceCalls.clear();
    }
    protected void addElement(String line, Map<Integer,String> idMap) {
        String type = line.substring(0, 1);
        if(type.equals("A"))
            return;

        if(type.equals("S")) {
            startLogging.add(Integer.parseInt(line.substring(2,line.length())));
        } else {

            int i = line.indexOf(";".charAt(0));
            int deep = Integer.parseInt(line.substring(1, i));

            StackTraceElement elem = parseElement(type, deep, line.substring(i + 1, line.length()), idMap);
            if (elem instanceof StackTraceCall) addCall((StackTraceCall) elem, deep);
            else {
                try {
                    getStackTraceOperations().add(new StackTraceVariableObservation((StackTraceVariable) elem));
                } catch (Exception e) {

                    Log.warn("error in add element");
                }
            }
        }
    }

    /**
     * Adds an element to the trace
     *
     * @param element Element to be added
     */
    public void addElement(StackTraceElement element) {
        if ( element instanceof StackTraceCall ) {
            addCall((StackTraceCall) element, element.getOriginalDeep());
        }
        try {
            getStackTraceOperations().add(new StackTraceVariableObservation((StackTraceVariable) element));
        } catch (Exception e) {
            Log.warn("CANNOT add an StackTraceOperation");
        }
    }

    protected void addCall(StackTraceCall elem, int deep) {
        int pop = 0;

        while(!stackTraceCalls.isEmpty() && stackTraceCalls.peek().getOriginalDeep() >= deep) {
            stackTraceCalls.pop();
            pop++;
        }
        if(pop != 0)
            getStackTraceOperations().add(new StackTracePop(pop));
        stackTraceCalls.push(elem);
        getStackTraceOperations().add(new StackTracePush(elem));
    }

    protected StackTraceElement parseElement(String type, int deep, String id, Map<Integer,String> idMap) {
        StackTraceElement st = null;
        if(type.equals("M"))
            st = new StackTraceCall(Integer.parseInt(id), deep, idMap);
        if(type.equals("V"))
            st = new StackTraceVariable(id, deep, idMap);
        if(type.equals("E"))
            st = new StackTraceException(id, deep);
        if(type.equals("C"))
            st = new StackTraceCatch(id, deep);

        return st;
    }

    @Override
    public String toString() {
        return name;
    }

//    protected void parseFileName(String fileName) {
//        String[] tmp = fileName.split("_");
//        threadName = tmp[0];
//        name = fileName.substring(threadName.length()+1,fileName.length());
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getFullName() {
        return name;
    }

    public Stack<StackTraceCall> getStackTraceCalls() {
        return stackTraceCalls;
    }

    public Map<String,Object> getVariable() {
        return variablesValue;
    }

    public boolean getVariablesValueChange() {
        return  variablesValueChange;
    }

    public Set<Integer> getStartLogging() {
        return startLogging;
    }

    public void setDepth(int depth) {
        this.deep = depth;
    }

    public List<StackTraceOperation> getStackTraceOperations() {
        return stackTraceOperations;
    }

    public boolean nextIsVar() {
        return stackTraceOperations.get(position) instanceof StackTraceVariableObservation;
    }

    public void copy(StackTrace originalStackTrace) {
        deep = originalStackTrace.deep;
        variablesValue.clear();
        variablesValue.putAll(originalStackTrace.variablesValue);
        stackTraceCalls = (Stack) originalStackTrace.stackTraceCalls.clone();
    }
}
