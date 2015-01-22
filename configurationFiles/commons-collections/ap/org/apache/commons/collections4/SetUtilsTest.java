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

    public void testpredicatedSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testpredicatedSet");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        Set<java.lang.Object> set = org.apache.commons.collections4.SetUtils.predicatedSet(new HashSet<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,(set instanceof org.apache.commons.collections4.set.PredicatedSet));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8241,org.apache.commons.collections4.SetUtils.emptyIfNull(null),8240,org.apache.commons.collections4.SetUtils.emptyIfNull(null).isEmpty());
        final Set<java.lang.Long> set = new HashSet<java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8242,set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8244,null,8243,org.apache.commons.collections4.SetUtils.emptyIfNull(set));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8246,a,8245,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8248,null,8247,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8250,null,8249,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,null,8251,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,null,8253,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,null,8255,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation3042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation3042");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8246,a,8245,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8248,null,8247,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8250,null,8249,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,null,8251,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,null,8253,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,null,8255,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation3043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation3043");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8246,a,8245,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8248,null,8247,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8250,null,8249,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,null,8251,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,null,8253,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,null,8255,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation3044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation3044");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8246,a,8245,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8248,null,8247,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8250,null,8249,org.apache.commons.collections4.SetUtils.isEqualSet(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,null,8251,org.apache.commons.collections4.SetUtils.isEqualSet(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,null,8253,org.apache.commons.collections4.SetUtils.isEqualSet(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,null,8255,org.apache.commons.collections4.SetUtils.isEqualSet(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8257,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8260,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8263,null,8262,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation3045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation3045");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8257,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8260,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8263,null,8262,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation3046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation3046");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8257,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8260,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8263,null,8262,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation3047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation3047");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final Set<java.lang.String> a = new HashSet<java.lang.String>(data);
        final Set<java.lang.String> b = new HashSet<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8257,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,((a.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,((b.hashCode()) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8260,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,((org.apache.commons.collections4.SetUtils.hashCodeForSet(a)) == (org.apache.commons.collections4.SetUtils.hashCodeForSet(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8263,null,8262,org.apache.commons.collections4.SetUtils.hashCodeForSet(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

