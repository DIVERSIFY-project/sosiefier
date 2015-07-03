package fr.inria.diversify.logger.stack.stackTraceOperation;

import fr.inria.diversify.logger.logger.KeyWord;
import fr.inria.diversify.logger.stack.stackElement.*;
import fr.inria.diversify.logger.stack.stackElement.StackTraceElement;
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


    public void reset() {
        stackTraceCalls = new Stack();
        variablesValue = new HashMap();
        deep = 0;
        position = 0;
    }
    public StackTrace() {
        stackTraceCalls = new Stack();
        stackTraceOperations = new ArrayList();
        variablesValue = new HashMap();
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

    public void parseTrace(String name, List<String> trace, Map<Integer, String> idMap) throws Exception {
        this.name = name;

        for(String operation: trace) {
            try {
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
        String[] split = line.split(";");
        String type = split[0];
        int i = line.indexOf(";".charAt(0), 0);
        Integer deep = Integer.parseInt(split[1]);
        i = line.indexOf(";".charAt(0),i);
        Integer methodId = Integer.parseInt(split[2]);
        i = line.indexOf(";".charAt(0),i);

        StackTraceElement elem = parseElement(type, deep, methodId,  line.substring(i + 1, line.length()), idMap);
        if (elem instanceof StackTraceCall) {
            addCall((StackTraceCall) elem, deep);
        }
        else {
            try {
                getStackTraceOperations().add(new StackTraceVariableObservation((StackTraceVariable) elem));
            } catch (Exception e) {
                Log.warn("error in add element");
            }
        }
    }

    /**
     * Adds an element to the trace
     *
     * @param element Element to be added
     */
    public void addElement(fr.inria.diversify.logger.stack.stackElement.StackTraceElement element) {
        if ( element instanceof StackTraceCall) {
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

    protected StackTraceElement parseElement(String type, int deep, int methodId, String info, Map<Integer,String> idMap) {
        StackTraceElement st = null;
        if(type.equals(KeyWord.methodCallObservation))
            st = new StackTraceCall(methodId, deep, idMap);
        if(type.equals(KeyWord.variableObservation))
            st = new StackTraceVariable(methodId, deep, info, idMap);
        if(type.equals(KeyWord.throwObservation))
            st = new StackTraceException(methodId, deep, info);
        if(type.equals(KeyWord.catchObservation))
            st = new StackTraceCatch(methodId, deep, info);

        return st;
    }

    @Override
    public String toString() {
        return name;
    }

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
