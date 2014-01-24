package fr.inria.diversify.sosie.pointSequence;

import fr.inria.diversify.sosie.compare.VariableDiff;
import fr.inria.diversify.util.Log;

import java.util.*;

/**
 * User: Simon
 * Date: 9/16/13
 * Time: 2:22 PM
 */
public class ConditionalPoint extends Point {
    Map<String, String> vars;

    public ConditionalPoint(String string, Map<String,String> idMap, ConditionalPoint last) {
        super();
        buildFromId(string, idMap, last);
    }
    public boolean sameValue(Point point) {
        if(!(point instanceof ConditionalPoint))
            return false;

        ConditionalPoint cp = (ConditionalPoint)point;
        boolean ret = true;
        for(String varName : vars.keySet()) {
            String other = cp.vars.get(varName);
            if(other == null || !valueEqual(other,vars.get(varName))) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public boolean sameLogPoint(Point point) {
        return super.sameLogPoint(point) && vars.keySet().equals(((ConditionalPoint)point).vars.keySet());
    }

    protected void buildFrom(String string, Map<String,String> idMap) {
        if(idMap == null)
            buildFrom(string);
        else
            buildFromId(string,idMap, null);
    }

    public static int  nbVarPoint = 0;
    protected void buildFromId(String string, Map<String,String> idMap, ConditionalPoint last) {
        try {
            vars = new HashMap<String, String>();
            String[] array = string.split(":;:");
            parseLocation(array[0],idMap);

            if(array[1].equals("P"))
                vars.putAll(last.vars);
            else {
                for (int i = 1; i< array.length; i++) {
                    String[] tmp = array[i].split(";");
                    if(tmp.length != 1 )
                        vars.put(idMap.get(tmp[0]).toString(), tmp[1]);
                    else
                        vars.put(idMap.get(tmp[0]).toString(), "");
                }
            }
            nbVarPoint++;
        } catch (Exception e) {
            error++;
            bugPoint = true;
        }

    }


    protected void parseLocation(String string, Map<String, String> idMap) {
        String[] array = string.split(";");
        id = Integer.parseInt(array[0]);
        className = idMap.get(array[1]).toString();
        methodSignature = idMap.get(array[2]).toString();
    }

    //ancienne version des logs
    protected void buildFrom(String string) {
        vars = new HashMap<String, String>();
        String[] array = string.split(":;:");
        try {
            id = Integer.parseInt(array[0]);
            className = array[1];
            methodSignature = array[2];
            for (int i = 3; i< array.length; i = i+2) {
                vars.put(array[i], array[i+1]);
            }
        } catch (Exception e) {
            bugPoint = true;
        }
    }

    @Override
    public String toDot(Set varsDiff) {
        String dot = hashCode() + "     ";
        dot += "[\n label =";
        if(varsDiff.isEmpty())
            dot += "\"" + toString() + "\"";

        else {
            dot += "\"" + toString();
            for(Object vf : varsDiff)
                dot += "\\n"+((VariableDiff)vf).toDot();
            dot += "\"\n,color=\"red\",";
        }
        dot += "\n];";
        return dot;
    }

    public Set<VariableDiff> getDifVar(ConditionalPoint point) {
        Set<VariableDiff> difVar = new HashSet<VariableDiff>();
        for(String varName : vars.keySet()) {
            String other = point.vars.get(varName);
            if(other == null) {
                new Exception("pas les meme variables");
            }
            if(!valueEqual(other,vars.get(varName))) {
                difVar.add(new VariableDiff(className,methodSignature,varName,vars.get(varName),other));
            }
        }
        return difVar;
    }

    protected boolean valueEqual(String v1, String v2) {
        if(v1 ==null || v2 == null) {
            return true;
        }
        Object o1;
        Object o2;
        if((v1.startsWith("{") && v1.endsWith("}")) ||
                v1.startsWith("[") && v1.endsWith("]")) {
            o1 = equalListString(v1);
        }
        else
            o1 = equalString(v1);

        if((v2.startsWith("{") && v2.endsWith("}")) ||
                v2.startsWith("[") && v2.endsWith("]")) {
            o2 = equalListString(v2);
        }
        else
            o2 = equalString(v2);

        return  o1.equals(o2);
    }

    protected String equalString(String var) {
        if(var.contains("@") && var.split("@").length != 0)
            return var.split("@")[0];
        return  var;
    }

    protected Collection<String> equalListString(String var) {
        Collection<String> collection;
        if(var.startsWith("{"))
            collection = new HashSet<String>();
        else
            collection = new ArrayList<String>();

        for(String s : var.substring(1,var.length()-1).split(", "))
            collection.add(equalString(s));

        return  collection;
    }

    public String toString() {
        return className + ":" + methodSignature + ":" + vars.size();
    }
}
