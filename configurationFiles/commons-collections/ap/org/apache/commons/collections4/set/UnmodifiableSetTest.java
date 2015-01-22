package org.apache.commons.collections4.set;

import java.util.HashSet;
import java.util.Set;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractSetTest} for exercising the
 * {@link UnmodifiableSet} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableSetTest<E> extends AbstractSetTest<E> {
    public UnmodifiableSetTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableSetTest.class);
    }

    @Override
    public Set<E> makeObject() {
        return org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(new HashSet<E>());
    }

    @Override
    public Set<E> makeFullCollection() {
        final HashSet<E> set = new HashSet<E>();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(set);
    }

    @Override
    public boolean isAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6327,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6328,((makeFullCollection()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final Set<E> set = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6324,set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6326,null,6325,org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(set));
        try {
            org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

