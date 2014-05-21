package fr.inria.diversify.sosie.compare.stackTraceOperation;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceVariable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceVariableObservation implements StackTraceOperation {
    protected StackTraceVariable vars;
    protected Map<String,Object> previousObservation;

    public StackTraceVariableObservation(StackTraceVariable elem) {
        vars = elem;
    }

    @Override
    public void apply(StackTrace stackTrace) {
        previousObservation = new HashMap<>();
        for(String key : vars.getVariables().keySet()) {
            previousObservation.put(key, stackTrace.variablesValue.get(key));
        }
        stackTrace.variablesValue.putAll(vars.getVariables());
    }

    @Override
    public void restore(StackTrace stackTrace) {
        for(String key : previousObservation.keySet()) {
            Object value = previousObservation.get(key);
            if(value == null)
                stackTrace.variablesValue.remove(key);
            else
                stackTrace.variablesValue.put(key,value);
        }
    }


}
