package fr.inria.diversify.testamplification.compare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Simon on 15/01/15.
 */
public class Assert {
    String[] methods;
    Object[] values;

    static Map<Integer, String> dico = new HashMap<>();

    protected int assertId;
    protected int classId;

    public Assert(int assertId, int classId, String[] methods) {
        this.assertId = assertId;
        this.classId = classId;
        this.methods = methods;
    }

    public int getAssertId() {
        return assertId;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public String toString() {
        String ret = assertId + ", "  + dico.get(classId) + ": ";

        for(int i = 0; i < values.length; i++)  {
            ret += "\n\t" + methods[i] + "(): " + values[i];
        }

        return ret;
    }

    public int getClassId() {
        return classId;
    }

    public String[] getMethods() {
        return methods;
    }

    public Object[] getValues() {
        return values;
    }

//    public void removeMethod(String toRemove) {
//        int index = 0;
//        for(String mth : methods) {
//            if(toRemove.equals(mth)) {
//               break;
//            }
//            index++;
//        }
//
//        String[] newMethods = new String[methods.length - 1];
//        Object[] newValues = new Object[methods.length - 1];
//        int j = 0;
//        for(int i = 0; i < methods.length ; i++) {
//            if(i != index) {
//                newMethods[j] = methods[i];
//                newValues[j] = values[i];
//                j++;
//            }
//        }
//        methods = newMethods;
//        values = newValues;
//    }
}
