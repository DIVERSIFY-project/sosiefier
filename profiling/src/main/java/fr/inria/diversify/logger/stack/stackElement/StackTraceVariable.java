package fr.inria.diversify.logger.stack.stackElement;


import java.util.*;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceVariable extends StackTraceElement {
    protected int localPositionId;
    protected Map<String,Long> vars;
    protected static Map<Long, Object> idToVar = new HashMap<>();
    protected static Map<Object, Long> varToId = new HashMap<>();


    public StackTraceVariable(int id, int depth, String method, Map<Integer,String> idMap, String variables) {
        originalDeep = depth;
//        this.method = method;
//        initVariablesFromString(variables.split(":;:"), idMap, 1);
    }

    public StackTraceVariable(int methodId, int deep, String value, Map<Integer,String> idMap) {
        originalDeep = deep;
        this.methodId = methodId;
        String[] tmp = value.split(":;:");
        String[] idTmp = tmp[0].split(";");
//        id2 = Integer.parseInt(idTmp[0]);
        methodId = Integer.parseInt(idTmp[1]);
        String methodName = idMap.get(methodId);
        if (methodName == null) {
            dico.put(methodId,"null");
        } else {
            dico.put(methodId,methodName);
        }
        initVariablesFromString(tmp, idMap, 1);
    }


    protected void initVariablesFromString(String[] varStr, Map<Integer,String> idMap, int start) {
        vars = new HashMap<>(varStr.length);
        if(varStr[start].equals("P")) return;

        for(int i = start; i < varStr.length; i++ ) {
            String[] varTmp = varStr[i].split(";");
            try {
                int key = Integer.parseInt(varTmp[0]);
                String varName = idMap.get(key);
                if (varTmp.length == 1)
                    vars.put(varName, -1l);
                else
                    vars.put(varName, valueId(parseValue(varTmp[1])));
            } catch ( NumberFormatException e ) {}
        }
    }

    public Map<String,Long> getVariables() {return vars;}

    protected long valueId(Object value) {
        if(varToId.containsKey(value)) {
            return varToId.get(value);
        }
        long id = varToId.size();
        varToId.put(value,id);
        idToVar.put(id,value);

        return id;
    }

    protected Object parseValue(String value) {
        //value is a set
        if(value.startsWith("{") && value.endsWith("}")) {

            Set<Object> set = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(", ")) {
                set.add(parseValue(s));
            }
            return set;
        }
        //value is a array or a list
        if(value.startsWith("[") && value.endsWith("]")) {
            List<Object> list = new ArrayList<>();
            for(String s : value.substring(1,value.length()-1).split(", ")) {
                list.add(parseValue(s));
            }
            return list;
        }
        //toString() is not define
        if(value.split("@").length > 1) {
            return parseValue(value.split("@")[0]);
        }
        //toString() is not define
        if( value.split("\\$").length > 1) {
            return parseValue(value.split("\\$")[0]);
        }
        return value;
    }
}
