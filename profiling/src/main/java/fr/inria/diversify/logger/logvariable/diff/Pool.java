package fr.inria.diversify.logger.logvariable.diff;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Simon on 27/01/15.
 */
public class Pool {
    private static Map<String,String> StringPool =
            new HashMap<String,String>(20000);

    private static Map<Integer,Integer> IntegerPool =
            new HashMap<Integer,Integer>(20000);

    private static Map<Object,Object> ObjectPool =
            new HashMap<Object,Object>(20000);

    public static String getCanonicalVersion(String str) {
        String canon = StringPool.putIfAbsent(str, str);
        return (canon == null) ? str : canon;
    }

    public static Integer getCanonicalVersion(Integer str) {
        Integer canon = IntegerPool.putIfAbsent(str, str);
        return (canon == null) ? str : canon;
    }
    public static Object getCanonicalVersion(Object str) {
        Object canon = ObjectPool.putIfAbsent(str, str);
        return (canon == null) ? str : canon;
    }

    public static void reset() {
        StringPool.clear();
        IntegerPool.clear();
        ObjectPool.clear();
    }
}
