package fr.inria.diversify.testamplification.compare;

import java.text.StringCharacterIterator;
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
 //   protected int classId;
    protected String className;

    public Assert(int assertId, String className, String[] methods) {
        this.assertId = assertId;
        this.className = className;
        this.methods = methods;
    }

    public Assert(int assertId, String className, String[] mth, String[] valueS) {
        this.assertId = assertId;
        this.className = className;
        this.methods = mth;
        values = valueS;
    }

    public int getAssertId() {
        return assertId;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public String toString() {
        String ret = assertId + ", "  + className + ": ";

        for(int i = 0; i < values.length; i++)  {
            ret += "\n\t" + methods[i] + "(): " + values[i];
        }

        return ret;
    }

    public String getClassName() {
        return className;
    }

    public String[] getMethods() {
        return methods;
    }

    public Object[] getValues() {
        return values;
    }
}
