package fr.inria.diversify.clone.compare;


//import com.rits.cloning.Cloner;

import java.lang.reflect.Method;
import java.util.*;

/**
 * User: Simon
 * Date: 23/09/15
 * Time: 14:31
 */
public class Compare {
    protected static Compare singleton;

    protected boolean equals;
    protected Invocator invocator;
    protected MethodsHandler methodsHandler;
    protected int maxCompare;
    protected int nbSampleMethods;
//    protected Cloner cloner;


    public static Compare getSingleton() {
        if(singleton == null) {
            initCompare(true, true, true, 50, 10);
        }
        return singleton;
    }


    public static void initCompare(boolean equals, boolean onlyPublicMethod, boolean onlyNotStaticMethod, int maxCompare, int nbSampleMethods) {
        if(singleton == null) {
            singleton = new Compare(equals, onlyPublicMethod, onlyNotStaticMethod, maxCompare, nbSampleMethods);
        }
    }

    private Compare(boolean equals, boolean onlyPublicMethod, boolean onlyNotStaticMethod, int maxCompare, int nbSampleMethods) {
        this.equals = equals;
        this.invocator = new Invocator(1);
        this.methodsHandler = new MethodsHandler(onlyPublicMethod, onlyNotStaticMethod);
        this.maxCompare = maxCompare;
        this.nbSampleMethods = nbSampleMethods;
//        cloner = new Cloner();
    }

    public boolean compare(Object o1, Object o2) {

//        Object clone1 = cloner.deepClone(o1);
//        Object clone2 = cloner.deepClone(o2);
//
//        return compareAnything(clone1, clone2);
        return compareAnything(o1, o2, maxCompare);
    }

    protected boolean compareAnything(Object o1, Object o2, int nbCompare) {
        if (o1 == null && o2 == null) {
            return true;
        }

        if ((o1 == null && o2 != null) || (o1 != null && o2 == null)) {
            return false;
        }

        if(isPrimitive(o1) && isPrimitive(o2)) {
            return o1 == o2;
        }

        if (isString(o1) && isString(o2)) {
            return o1.equals(o2);
        }

        if(isCollection(o1) && isCollection(o2)) {
            return compareNotNullCollection((Collection<?>) o1, (Collection<?>) o2, nbCompare);
        }

        if(isArray(o1) && isArray(o2)) {
            return compareNotNullArray((Object[]) o1, (Object[]) o2, nbCompare);
        }

        return compareNotNullObject(o1, o2, nbCompare);
    }

    protected boolean compareNotNullArray(Object[] array1, Object[] array2, int nbCompare) {
        if(nbCompare == 0) {
            return true;
        } else {
            if (array1.length != array2.length) {
                return false;
            } else {
                if (equals) {
                    return Arrays.deepEquals(array1, array2);
                } else {
                    for (int i = 0; i < array1.length; i++) {
                        if (!compareAnything(array1[i], array2[i], nbCompare - 1)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
    }

    protected boolean compareNotNullCollection(Collection<?> collection1, Collection<?> collection2, int nbCompare) {
        if(nbCompare == 0) {
            return true;
        } else {
            if (collection1.size() != collection2.size()) {
                return false;
            } else {
                if (equals) {
                    return collection1.equals(collection2);
                } else {
                    if (isList(collection1) && isList(collection2)) {
                        Iterator i1 = collection1.iterator();
                        Iterator i2 = collection2.iterator();

                        while (i1.hasNext()) {
                            if (!compareAnything(i1.next(), i2.next(), nbCompare - 1)) {
                                return false;
                            }
                        }
                        return true;
                    } else {
                        return compareNotNullObject(collection1, collection2, nbCompare - 1);
                    }
                }
            }
        }
    }

    protected boolean compareNotNullObject(Object o1, Object o2, int nbCompare) {
        if(nbCompare == 0) {
            return true;
        } else {
            for (Method method : methodsHandler.getRandomMethods(o1, nbSampleMethods)) {
                Invocation invocation1 = new Invocation(o1, method);
                Invocation invocation2 = new Invocation(o2, method);

                invocator.invoke(invocation1);
                invocator.invoke(invocation2);

                if (invocation1.sameStatus(invocation2)) {
                    return compareAnything(invocation1.getResult(), invocation2.getResult(), nbCompare - 1);
                }
            }
            return true;
        }
    }

    protected boolean isPrimitive(Object o) {
        return o != null && o.getClass().isPrimitive();
    }

    protected boolean isArray(Object o) {
        return o != null && o.getClass().isArray();
    }

    protected boolean isCollection(Object o) {
        return o != null && o instanceof Collection;
    }

    protected boolean isList(Object o) {
        return o != null && o instanceof List;
    }

    protected boolean isString(Object o) {
        return o != null && o.getClass().equals(String.class);
    }
}
