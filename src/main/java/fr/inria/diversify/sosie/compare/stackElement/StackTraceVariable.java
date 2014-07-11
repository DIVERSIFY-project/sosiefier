package fr.inria.diversify.sosie.compare.stackElement;


import java.util.*;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceVariable extends StackTraceElement {
    protected Map<String,Object> vars;
    protected int id2;


    public StackTraceVariable(String value, int deep, Map<Integer,String> idMap) {
        originalDeep = deep;
        String[] tmp = value.split(":;:");
        String[] idTmp = tmp[0].split(";");
        id2 = Integer.parseInt(idTmp[0]);
        id = Integer.parseInt(idTmp[1]);
        method = idMap.get(id);

        vars = new HashMap<>();
        if(tmp[1].equals("P"))
            return;

        for(int i = 1; i < tmp.length; i++ ) {
            String[] varTmp = tmp[i].split(";");
            int key = Integer.parseInt(varTmp[0]);
            if(varTmp.length == 1)
                vars.put(idMap.get(key), "");
            else
                vars.put(idMap.get(key), parseValue(varTmp[1]));
        }
    }

    public Map<String,Object> getVariables() {return vars;}

    protected Object parseValue(String valueString) {
        if(valueString.startsWith("{") && valueString.endsWith("}")) {
            Set<Object> set = new HashSet<>();
            for(String s : valueString.substring(1,valueString.length()-1).split(", "))
                set.add(parseValue(s));
            return set;
        }

        if(valueString.startsWith("[") && valueString.endsWith("]")) {
            List<Object> list = new ArrayList<>();
            for(String s : valueString.substring(1,valueString.length()-1).split(", "))
                list.add(parseValue(s));
            return list;
        }

        if(valueString.split("@").length > 1)
            return parseValue(valueString.split("@")[0]);


        if( valueString.split("\\$\\$").length > 1) {
            return parseValue(valueString.split("\\$\\$")[0]);
        }


        return valueString;
    }
}
