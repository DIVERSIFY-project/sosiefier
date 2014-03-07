package fr.inria.diversify.sosie.compare;


import java.util.*;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 16:13
 */
public class AssertPoint extends Point {
    protected List<String> vars;
    protected List<String> type;
    protected String assertType;

    public AssertPoint(String stringPoint, Map<String, String> idMap) {
        super(stringPoint, idMap);
    }

    @Override
    protected void buildFrom(String string, Map<String, String> idMap) {
        vars = new ArrayList<String>();
        type = new ArrayList<String>();
        String[] array = string.split(":;:");

        try {
            id = Integer.parseInt(array[1]);
            className = array[2];
            methodSignature = array[3];
            assertType = array[4];
            for (int i = 5; i< array.length; i = i+2) {
                type.add(array[i]);
                vars.add(array[i + 1]);
            }
        } catch (Exception e) {
            bugPoint = true;
        }
    }

    public boolean sameValue(Point point) {
        if(!(point instanceof AssertPoint))
            return false;

        AssertPoint cp = (AssertPoint)point;
        boolean ret = true;
        for(int i = 0; i < vars.size(); i++) {
            if(!type.get(i).equals(cp.type.get(i))
                    || !valueEqual(vars.get(i),cp.vars.get(i))) {
                ret = false;
                break;
            }
        }
        return ret;
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

    @Override
    public Set<Diff> getDiff(Point p) {
        AssertDiff e = new AssertDiff(className,methodSignature,assertType,vars,((AssertPoint)p).vars);
        Set<Diff> set = new HashSet<Diff>();
        set.add(e);
        return set;
    }
}
