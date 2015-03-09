package org.apache.commons.collections4.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

/** 
 * Tests for {@link BooleanComparator}.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class BooleanComparatorTest extends AbstractComparatorTest<java.lang.Boolean> {
    public BooleanComparatorTest(final String testName) {
        super(testName);
    }

    @Override
    public Comparator<java.lang.Boolean> makeObject() {
        return new BooleanComparator();
    }

    @Override
    public List<java.lang.Boolean> getComparableObjectsOrdered() {
        final List<java.lang.Boolean> list = new ArrayList<java.lang.Boolean>();
        list.add(new Boolean(false));
        list.add(Boolean.FALSE);
        list.add(new Boolean(false));
        list.add(Boolean.TRUE);
        list.add(new Boolean(true));
        list.add(true);
        return list;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @Test
    public void testConstructors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructors_add1256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_add1256");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructors_add1257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_add1257");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructors_add1258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_add1258");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1200");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1201");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1202");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(true));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1203");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(false, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1204");
        allTests(false, new BooleanComparator());
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructors_remove928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_remove928");
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructors_remove929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_remove929");
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructors_remove930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_remove930");
        allTests(false, new BooleanComparator(false));
        allTests(true, new BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_add1259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_add1259");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_add1260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_add1260");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_add1261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_add1261");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_add1262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_add1262");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStaticFactoryMethods() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods");
        allTests(true, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStaticFactoryMethods_literalMutation1206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_literalMutation1206");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStaticFactoryMethods_literalMutation1207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_literalMutation1207");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(true));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStaticFactoryMethods_literalMutation1208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_literalMutation1208");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStaticFactoryMethods_literalMutation1209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_literalMutation1209");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStaticFactoryMethods_literalMutation1210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_literalMutation1210");
        allTests(false, BooleanComparator.getFalseFirstComparator());
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_remove931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_remove931");
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_remove932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_remove932");
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_remove933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_remove933");
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStaticFactoryMethods_remove934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFactoryMethods_remove934");
        allTests(false, BooleanComparator.booleanComparator(false));
        allTests(true, BooleanComparator.getTrueFirstComparator());
        allTests(true, BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEqualsCompatibleInstance() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsCompatibleInstance");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4469,new org.apache.commons.collections4.comparators.BooleanComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4470,new org.apache.commons.collections4.comparators.BooleanComparator(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4471,new org.apache.commons.collections4.comparators.BooleanComparator(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4471,new org.apache.commons.collections4.comparators.BooleanComparator(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4472,new org.apache.commons.collections4.comparators.BooleanComparator(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4474,null,4473,org.apache.commons.collections4.comparators.BooleanComparator.getFalseFirstComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4476,null,4475,org.apache.commons.collections4.comparators.BooleanComparator.getFalseFirstComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4478,null,4477,org.apache.commons.collections4.comparators.BooleanComparator.booleanComparator(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4479,new org.apache.commons.collections4.comparators.BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4479,new org.apache.commons.collections4.comparators.BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4480,new org.apache.commons.collections4.comparators.BooleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4482,null,4481,org.apache.commons.collections4.comparators.BooleanComparator.getTrueFirstComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4484,null,4483,org.apache.commons.collections4.comparators.BooleanComparator.getTrueFirstComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4486,null,4485,org.apache.commons.collections4.comparators.BooleanComparator.booleanComparator(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4487,!(new org.apache.commons.collections4.comparators.BooleanComparator().equals(new org.apache.commons.collections4.comparators.BooleanComparator(true))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4488,!(new org.apache.commons.collections4.comparators.BooleanComparator(true).equals(new org.apache.commons.collections4.comparators.BooleanComparator(false))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    protected void allTests(final boolean trueFirst, final BooleanComparator comp) {
        orderIndependentTests(comp);
        if (trueFirst) {
            trueFirstTests(comp);
        } else {
            falseFirstTests(comp);
        }
    }

    protected void trueFirstTests(final BooleanComparator comp) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4489,comp);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4491,comp,4490,comp.compare(true, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4493,comp,4492,comp.compare(false, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4494,((comp.compare(false, true)) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4495,((comp.compare(true, false)) < 0));
    }

    protected void falseFirstTests(final BooleanComparator comp) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4461,comp);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4463,comp,4462,comp.compare(true, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4465,comp,4464,comp.compare(false, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4466,((comp.compare(false, true)) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4467,((comp.compare(true, false)) > 0));
    }

    protected void orderIndependentTests(final BooleanComparator comp) {
        nullArgumentTests(comp);
    }

    protected void nullArgumentTests(final BooleanComparator comp) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4468,comp);
        try {
            comp.compare(null, null);
        } catch (final NullPointerException e) {
        }
        try {
            comp.compare(Boolean.TRUE, null);
        } catch (final NullPointerException e) {
        }
        try {
            comp.compare(Boolean.FALSE, null);
        } catch (final NullPointerException e) {
        }
        try {
            comp.compare(null, Boolean.TRUE);
        } catch (final NullPointerException e) {
        }
        try {
            comp.compare(null, Boolean.FALSE);
        } catch (final NullPointerException e) {
        }
    }
}

