package org.apache.commons.collections4.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import junit.framework.Test;

/** 
 * Tests for the {@link CaseInsensitiveMap} implementation.
 * 
 * @version $Id$
 */
public class CaseInsensitiveMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public CaseInsensitiveMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(CaseInsensitiveMapTest.class);
    }

    @Override
    public CaseInsensitiveMap<K, V> makeObject() {
        return new CaseInsensitiveMap<K, V>();
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("two")), ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive_literalMutation71() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive_literalMutation71");
        final Map<K, V> map = makeObject();
        map.put(((K)("foo")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("two")), ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive_literalMutation72() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive_literalMutation72");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("foo")));
        map.put(((K)("Two")), ((V)("Two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("two")), ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive_literalMutation73() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive_literalMutation73");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("foo")), ((V)("Two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("two")), ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive_literalMutation74() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive_literalMutation74");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("two")), ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive_literalMutation75() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive_literalMutation75");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("foo")), ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testCaseInsensitive_literalMutation76() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCaseInsensitive_literalMutation76");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),380,map,379,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),382,map,381,map.get("oNe"));
        map.put(((K)("two")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),384,map,383,map.get("Two"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation100");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("foo")));
        map.put(null, ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("Four")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation102");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        map.put(null, ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("Four")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation104");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        map.put(null, ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        map.put(null, ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("Four")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation97() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation97");
        final Map<K, V> map = makeObject();
        map.put(((K)("foo")), ((V)("One")));
        map.put(((K)("Two")), ((V)("Two")));
        map.put(null, ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("Four")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation98() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation98");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("foo")));
        map.put(((K)("Two")), ((V)("Two")));
        map.put(null, ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("Four")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testNullHandling_literalMutation99() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullHandling_literalMutation99");
        final Map<K, V> map = makeObject();
        map.put(((K)("One")), ((V)("One")));
        map.put(((K)("foo")), ((V)("Two")));
        map.put(null, ((V)("Three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),401,map,400,map.get(null));
        map.put(null, ((V)("Four")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),403,map,402,map.get(null));
        final Set<K> keys = map.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),405,keys,404,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),407,keys,406,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),409,keys,408,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),411,keys,410,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("foo", "One");
        map.put("Two", "Two");
        map.put("one", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation106");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "foo");
        map.put("Two", "Two");
        map.put("one", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation107");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("foo", "Two");
        map.put("one", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation108");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("Two", "foo");
        map.put("one", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation109");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("Two", "Two");
        map.put("foo", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation110");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("Two", "Two");
        map.put("one", "foo");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation112");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("Two", "Two");
        map.put("one", "Three");
        map.put(null, "foo");
        map.put(java.lang.Integer.valueOf(20), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation113");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("Two", "Two");
        map.put("one", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(19), "Five");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAll_literalMutation114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_literalMutation114");
        final Map<java.lang.Object, java.lang.String> map = new HashMap<java.lang.Object, java.lang.String>();
        map.put("One", "One");
        map.put("Two", "Two");
        map.put("one", "Three");
        map.put(null, "Four");
        map.put(java.lang.Integer.valueOf(20), "foo");
        final Map<java.lang.Object, java.lang.String> caseInsensitiveMap = new CaseInsensitiveMap<java.lang.Object, java.lang.String>(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),413,caseInsensitiveMap,412,caseInsensitiveMap.size());
        final Set<java.lang.Object> keys = caseInsensitiveMap.keySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),415,keys,414,keys.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),417,keys,416,keys.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),419,keys,418,keys.contains(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),421,keys,420,keys.contains(java.lang.Integer.toString(20)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),423,keys,422,keys.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),424,((!(caseInsensitiveMap.containsValue("One"))) || (!(caseInsensitiveMap.containsValue("Three")))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),426,caseInsensitiveMap,425,caseInsensitiveMap.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone");
        final CaseInsensitiveMap<K, V> map = new CaseInsensitiveMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        final CaseInsensitiveMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),388,cloned,387,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),390,map,389,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),392,cloned,391,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation78() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation78");
        final CaseInsensitiveMap<K, V> map = new CaseInsensitiveMap<K, V>(9);
        map.put(((K)("1")), ((V)("1")));
        final CaseInsensitiveMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),388,cloned,387,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),390,map,389,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),392,cloned,391,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation79() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation79");
        final CaseInsensitiveMap<K, V> map = new CaseInsensitiveMap<K, V>(10);
        map.put(((K)("foo")), ((V)("1")));
        final CaseInsensitiveMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),388,cloned,387,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),390,map,389,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),392,cloned,391,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation80() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation80");
        final CaseInsensitiveMap<K, V> map = new CaseInsensitiveMap<K, V>(10);
        map.put(((K)("1")), ((V)("foo")));
        final CaseInsensitiveMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),388,cloned,387,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),390,map,389,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),392,cloned,391,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("foo" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation83() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation83");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "foo" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation84() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation84");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "foo") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation85() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation85");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "foo" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation86() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation86");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "foo" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation87() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation87");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "foo" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation88() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation88");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "foo" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation89() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation89");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "foo" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation90() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation90");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "foo" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation91() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation91");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "foo" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation92() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation92");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "foo" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation93() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation93");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = -1 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation94() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation94");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][1], "value");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleIndependence_literalMutation95() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleIndependence_literalMutation95");
        final Locale orig = Locale.getDefault();
        final Locale[] locales = new Locale[]{ Locale.ENGLISH , new Locale("tr" , "" , "") , Locale.getDefault() };
        final String[][] data = new String[][]{ new String[]{ "i" , "I" } , new String[]{ "ς" , "σ" } , new String[]{ "Σ" , "ς" } , new String[]{ "Σ" , "σ" } };
        try {
            for (final Locale locale : locales) {
                Locale.setDefault(locale);
                for (int j = 0 ; j < (data.length) ; j++) {
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),394,("Test data corrupt: " + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),396,data[j][0],395,data[j][0].equalsIgnoreCase(data[j][1]));
                    final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>();
                    map.put(data[j][0], "foo");
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),397,(((java.util.Locale.getDefault()) + ": ") + j));
                    fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),399,map,398,map.get(data[j][1]));
                }
            }
        } finally {
            Locale.setDefault(orig);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for <a href="https://issues.apache.org/jira/browse/COLLECTIONS-323">COLLECTIONS-323</a>.
     */
public void testInitialCapacityZero() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitialCapacityZero");
        final CaseInsensitiveMap<java.lang.String, java.lang.String> map = new CaseInsensitiveMap<java.lang.String, java.lang.String>(-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),393,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

