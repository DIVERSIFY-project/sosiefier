package fr.inria.diversify.sosie.compare.stackElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTraceElement {
    protected static Map<Integer, String> dico = new HashMap<>();
    //Depth in wich this stack element was logged
    protected int originalDeep;

    //Element id
    protected Integer methodId;


    public int getOriginalDeep() {
        return originalDeep;
    }

    public String getMethod() {
        return dico.get(methodId);
    }

    public Integer getId() {
        return methodId;
    }
}
