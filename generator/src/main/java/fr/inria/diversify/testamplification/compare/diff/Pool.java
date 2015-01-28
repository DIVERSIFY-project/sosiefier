package fr.inria.diversify.testamplification.compare.diff;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Simon on 27/01/15.
 */
public class Pool {
    private static ConcurrentMap<String,String> StringPool =
            new ConcurrentHashMap<String,String>(20000);

    private static ConcurrentMap<Integer,Integer> IntegerPool =
            new ConcurrentHashMap<Integer,Integer>(20000);

    private static ConcurrentMap<Object,Object> ObjectPool =
            new ConcurrentHashMap<Object,Object>(20000);

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
}
