package fr.inria.diversify.sosie.pointSequence;

import fr.inria.diversify.sosie.compare.VariableDiff;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 9/16/13
 * Time: 2:22 PM
 */
public class ConditionalPoint extends Point {
    Map<String, String> vars;

    public ConditionalPoint(String string) {
        super(string);
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
//                difVar.add(className+":"+methodSignature+":"+varName);
                difVar.add(new VariableDiff(className,methodSignature,varName,vars.get(varName),other));
//                difVar.add(className+":"+methodSignature+":"+varName+":("+vars.get(varName)+" / "+other+")");
            }
        }
        return difVar;
    }

    protected boolean valueEqual(String v1, String v2) {
        if(v1 ==null || v2 == null) {
           return true;
        }
        if((v1.startsWith("{") && v2.startsWith("{"))
                || (v1.startsWith("[") && v2.startsWith("["))) {
            return v1.split(", ").length == v2.split(", ").length;
        }
        if(v1.contains("@") && v2.contains("@"))
            if(v1.split("@").length != 0 && v2.split("@").length != 0)
                return v1.split("@")[0].equals(v2.split("@")[0]);


        return  v1.equals(v2);
    }

    public String toString() {
        return id + ":" + className + ":" + methodSignature + ":" + vars.size();
    }
}
