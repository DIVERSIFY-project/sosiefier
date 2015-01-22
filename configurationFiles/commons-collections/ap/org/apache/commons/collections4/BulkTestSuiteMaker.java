package org.apache.commons.collections4;

import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import junit.framework.TestSuite;

class BulkTestSuiteMaker {
    /** 
     * The class that defines simple and bulk tests methods.
     */
private final Class<? extends org.apache.commons.collections4.BulkTest> startingClass;

    /** 
     * List of ignored simple test names.
     */
private List<java.lang.String> ignored;

    /** 
     * The TestSuite we're currently populating.  Can change over time.
     */
private TestSuite result;

    /** 
     * The prefix for simple test methods.  Used to check if a test is in
     * the ignored list.
     */
private String prefix;

    /** 
     * Constructor.
     * 
     * @param startingClass the starting class
     */
public BulkTestSuiteMaker(final Class<? extends org.apache.commons.collections4.BulkTest> startingClass) {
        this.startingClass = startingClass;
    }

    /** 
     * Makes a hierarchical TestSuite based on the starting class.
     * 
     * @return the hierarchical TestSuite for startingClass
     */
public TestSuite make() {
        this.result = new TestSuite();
        this.prefix = BulkTestSuiteMaker.getBaseName(startingClass);
        result.setName(prefix);
        final BulkTest bulk = BulkTestSuiteMaker.makeFirstTestCase(startingClass);
        ignored = new ArrayList<java.lang.String>();
        final String[] s = bulk.ignoredTests();
        if (s != null) {
            ignored.addAll(java.util.Arrays.asList(s));
        } 
        make(bulk);
        return result;
    }

    /** 
     * Appends all the simple tests and bulk tests defined by the given
     * instance's class to the current TestSuite.
     * 
     * @param bulk An instance of the class that defines simple and bulk
     * tests for us to append
     */
void make(final BulkTest bulk) {
        final Class<? extends org.apache.commons.collections4.BulkTest> c = bulk.getClass();
        final Method[] all = c.getMethods();
        for (final Method element : all) {
            if (BulkTestSuiteMaker.isTest(element)) {
                addTest(bulk, element);
            } 
            if (BulkTestSuiteMaker.isBulk(element)) {
                addBulk(bulk, element);
            } 
        }
    }

    /** 
     * Adds the simple test defined by the given method to the TestSuite.
     * 
     * @param bulk The instance of the class that defined the method
     * (I know it's weird.  But the point is, we can clone the instance
     * and not have to worry about constructors.)
     * @param m    The simple test method
     */
void addTest(final BulkTest bulk, final Method m) {
        final BulkTest bulk2 = ((BulkTest)(bulk.clone()));
        bulk2.setName(m.getName());
        bulk2.verboseName = ((prefix) + ".") + (m.getName());
        if (ignored.contains(bulk2.verboseName)) {
            return ;
        } 
        result.addTest(bulk2);
    }

    /** 
     * Adds a whole new suite of tests that are defined by the result of
     * the given bulk test method.  In other words, the given bulk test
     * method is invoked, and the resulting BulkTest instance is examined
     * for yet more simple and bulk tests.
     * 
     * @param bulk The instance of the class that defined the method
     * @param m    The bulk test method
     */
void addBulk(final BulkTest bulk, final Method m) {
        final String verboseName = ((prefix) + ".") + (m.getName());
        if (ignored.contains(verboseName)) {
            return ;
        } 
        BulkTest bulk2;
        try {
            bulk2 = ((BulkTest)(m.invoke(bulk, ((java.lang.Object[])(null)))));
            if (bulk2 == null) {
                return ;
            } 
        } catch (final InvocationTargetException ex) {
            ex.getTargetException().printStackTrace();
            throw new Error();
        } catch (final IllegalAccessException ex) {
            ex.printStackTrace();
            throw new Error();
        }
        final String oldPrefix = prefix;
        final TestSuite oldResult = result;
        prefix = ((prefix) + ".") + (m.getName());
        result = new TestSuite();
        result.setName(m.getName());
        make(bulk2);
        oldResult.addTest(result);
        prefix = oldPrefix;
        result = oldResult;
    }

    /** 
     * Returns the base name of the given class.
     * 
     * @param c the class
     * @return the name of that class, minus any package names
     */
private static String getBaseName(final Class<?> c) {
        String name = c.getName();
        final int p = name.lastIndexOf('.');
        if (p > 0) {
            name = name.substring((p + 1));
        } 
        return name;
    }

    private static <T>Constructor<T> getTestCaseConstructor(final Class<T> c) {
        try {
            return c.getConstructor(new Class[]{ String.class });
        } catch (final NoSuchMethodException e) {
            throw new IllegalArgumentException((c + " must provide a (String) constructor"));
        }
    }

    private static <T extends org.apache.commons.collections4.BulkTest>BulkTest makeTestCase(final Class<T> c, final Method m) {
        final Constructor<T> con = BulkTestSuiteMaker.getTestCaseConstructor(c);
        try {
            return con.newInstance(m.getName());
        } catch (final InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } catch (final IllegalAccessException e) {
            throw new Error();
        } catch (final InstantiationException e) {
            throw new RuntimeException();
        }
    }

    private static <T extends org.apache.commons.collections4.BulkTest>BulkTest makeFirstTestCase(final Class<T> c) {
        final Method[] all = c.getMethods();
        for (final Method element : all) {
            if (BulkTestSuiteMaker.isTest(element)) {
                return BulkTestSuiteMaker.makeTestCase(c, element);
            } 
        }
        throw new IllegalArgumentException(((c.getName()) + " must provide at least one test method."));
    }

    /** 
     * Returns true if the given method is a simple test method.
     */
private static boolean isTest(final Method m) {
        if (!(m.getName().startsWith("test"))) {
            return false;
        } 
        if ((m.getReturnType()) != (Void.TYPE)) {
            return false;
        } 
        if ((m.getParameterTypes().length) != 0) {
            return false;
        } 
        final int mods = m.getModifiers();
        if (java.lang.reflect.Modifier.isStatic(mods)) {
            return false;
        } 
        if (java.lang.reflect.Modifier.isAbstract(mods)) {
            return false;
        } 
        return true;
    }

    /** 
     * Returns true if the given method is a bulk test method.
     */
private static boolean isBulk(final Method m) {
        if (!(m.getName().startsWith("bulkTest"))) {
            return false;
        } 
        if ((m.getReturnType()) != (BulkTest.class)) {
            return false;
        } 
        if ((m.getParameterTypes().length) != 0) {
            return false;
        } 
        final int mods = m.getModifiers();
        if (java.lang.reflect.Modifier.isStatic(mods)) {
            return false;
        } 
        if (java.lang.reflect.Modifier.isAbstract(mods)) {
            return false;
        } 
        return true;
    }
}

