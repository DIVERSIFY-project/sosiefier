package fr.inria.diversify.sosie.compare.stackTraceOperation;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceVariable;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to apply an observation of a variable in the stack trace
 *
 * Created by Simon on 24/04/14.
 */
public class StackTraceVariableObservation implements StackTraceOperation {
    /**
     * Observed variables
     */
    private StackTraceVariable vars;

    /**
     * Previous observed variables in this thread
     */
    protected Map<String,Object> previousObservation;

    public StackTraceVariableObservation(StackTraceVariable elem) {
        vars = elem;
    }

    @Override
    public void apply(StackTrace stackTrace) {
        previousObservation = new HashMap(vars.getVariables().size());
        stackTrace.variablesValueChange = true;
        for(String key : getVars().getVariables().keySet()) {
            previousObservation.put(key, stackTrace.variablesValue.get(key));
        }
        stackTrace.variablesValue.putAll(getVars().getVariables());
    }

    @Override
    public void restore(StackTrace stackTrace) {
        stackTrace.variablesValueChange = true;
        for(String key : previousObservation.keySet()) {
            Object value = previousObservation.get(key);
            if(value == null)
                stackTrace.variablesValue.remove(key);
            else
                stackTrace.variablesValue.put(key,value);
        }
    }


    public StackTraceVariable getVars() {
        return vars;
    }
}
