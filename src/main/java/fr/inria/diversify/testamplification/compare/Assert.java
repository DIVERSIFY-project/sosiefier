package fr.inria.diversify.testamplification.compare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Simon on 15/01/15.
 */
public class Assert {
    String[] methods;
    String[] values;

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

    public void setValues(String[] values) {
        this.values = values;
    }

    public String toString() {
        String ret = assertId + ", "  + dico.get(classId) + ": ";

        for(int i = 0; i < values.length; i++)  {
            ret += "\n\t" + methods[i] + ": " + values[i];
        }

        return ret;
    }

    public int getClassId() {
        return classId;
    }

    public String[] getMethods() {
        return methods;
    }

    public String[] getValues() {
        return values;
    }
}
