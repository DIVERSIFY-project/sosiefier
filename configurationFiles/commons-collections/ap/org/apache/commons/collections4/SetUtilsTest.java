package org.apache.commons.collections4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import junit.framework.Test;

/** 
 * Tests for SetUtils.
 * 
 * @version $Id$
 */
public class SetUtilsTest extends BulkTest {
    public SetUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(SetUtilsTest.class);
    }

    public void testNothing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNothing");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testpredicatedSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testpredicatedSet");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        Set<java.lang.Object> set = org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8189,(set instanceof org.apache.commons.collections4.set.PredicatedSet));
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testpredicatedSet_add2929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testpredicatedSet_add2929");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        Set<java.lang.Object> set = org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8189,(set instanceof org.apache.commons.collections4.set.PredicatedSet));
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), null);
            org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testpredicatedSet_add2930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testpredicatedSet_add2930");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        Set<java.lang.Object> set = org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8189,(set instanceof org.apache.commons.collections4.set.PredicatedSet));
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(null, predicate);
            org.apache.commons.collections4.SetUtils.predicatedSet(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testpredicatedSet_remove2355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testpredicatedSet_remove2355");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        Set<java.lang.Object> set = org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8189,(set instanceof org.apache.commons.collections4.set.PredicatedSet));
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.SetUtils.predicatedSet(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8166,org.apache.commons.collections4.SetUtils.emptyIfNull(null),8165,org.apache.commons.collections4.SetUtils.emptyIfNull(null).isEmpty());
        final Set<java.lang.Long> set = new HashSet<java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8167,set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8169,null,8168,org.apache.commons.collections4.SetUtils.emptyIfNull(set));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8171,a,8170,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8173,null,8172,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8175,null,8174,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8177,null,8176,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8179,null,8178,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8181,null,8180,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testEquals_add2926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add2926");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8171,a,8170,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8173,null,8172,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8175,null,8174,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8177,null,8176,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8179,null,8178,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8181,null,8180,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation3042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation3042");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8171,a,8170,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8173,null,8172,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8175,null,8174,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8177,null,8176,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8179,null,8178,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8181,null,8180,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation3043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation3043");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8171,a,8170,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8173,null,8172,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8175,null,8174,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8177,null,8176,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8179,null,8178,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8181,null,8180,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation3044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation3044");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8171,a,8170,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8173,null,8172,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8175,null,8174,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8177,null,8176,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8179,null,8178,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8181,null,8180,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testEquals_remove2353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove2353");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8171,a,8170,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8173,null,8172,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8175,null,8174,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8177,null,8176,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8179,null,8178,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8181,null,8180,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8183,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8185,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,null,8187,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testHashCode_add2927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_add2927");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8183,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8185,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,null,8187,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation3045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation3045");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8183,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8185,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,null,8187,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation3046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation3046");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8183,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8185,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,null,8187,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation3047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation3047");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8183,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8185,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,null,8187,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testHashCode_remove2354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_remove2354");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8183,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8185,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,null,8187,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

