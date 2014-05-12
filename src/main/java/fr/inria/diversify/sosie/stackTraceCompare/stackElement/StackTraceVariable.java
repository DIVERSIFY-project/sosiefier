package fr.inria.diversify.sosie.stackTraceCompare.stackElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceVariable extends StackTraceElement {
    protected Map<String,String> vars;
    protected int id;
    protected String method;

    public StackTraceVariable(String value, int deep, Map<String, String> idMap) {
        originalDeep = deep;
        String[] tmp = value.split(":;:");
        String[] idTmp = tmp[0].split(";");
        id = Integer.parseInt(idTmp[0]);
        method = idMap.get(idTmp[1]);

        vars = new HashMap<>();
        if(tmp[1].equals("P"))
            return;

        for(int i = 1; i < tmp.length; i++ ) {
            String[] varTmp = tmp[i].split(";");
            if(varTmp.length == 1)
                vars.put(idMap.get(varTmp[0]), "");
            else
                vars.put(idMap.get(varTmp[0]), varTmp[1]);
        }
    }

    public Map<String,String> getVariables() {return vars;}
}
