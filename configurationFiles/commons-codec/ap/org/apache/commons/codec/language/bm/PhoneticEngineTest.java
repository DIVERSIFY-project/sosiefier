package org.apache.commons.codec.language.bm;

import java.util.List;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.Test;

/** 
 * Tests PhoneticEngine.
 * 
 * @since 1.6
 */
@RunWith(value = Parameterized.class)
public class PhoneticEngineTest {
    private static final Integer TEN = Integer.valueOf(10);

    @Parameterized.Parameters(name = "{0}-{1}-{2}-{3}")
    public static List<java.lang.Object[]> data() {
        return java.util.Arrays.asList(new Object[]{ "Renault" , "rinD|rinDlt|rina|rinalt|rino|rinolt|rinu|rinult" , NameType.GENERIC , RuleType.APPROX , java.lang.Boolean.TRUE , TEN }, new Object[]{ "Renault" , "rYnDlt|rYnalt|rYnult|rinDlt|rinalt|rinolt|rinult" , NameType.ASHKENAZI , RuleType.APPROX , java.lang.Boolean.TRUE , TEN }, new Object[]{ "Renault" , "rinDlt" , NameType.ASHKENAZI , RuleType.APPROX , java.lang.Boolean.TRUE , Integer.valueOf(1) }, new Object[]{ "Renault" , "rinDlt" , NameType.SEPHARDIC , RuleType.APPROX , java.lang.Boolean.TRUE , TEN }, new Object[]{ "SntJohn-Smith" , "sntjonsmit" , NameType.GENERIC , RuleType.EXACT , java.lang.Boolean.TRUE , TEN }, new Object[]{ "d\'ortley" , "(ortlaj|ortlej)-(dortlaj|dortlej)" , NameType.GENERIC , RuleType.EXACT , java.lang.Boolean.TRUE , TEN }, new Object[]{ "van helsing" , "(elSink|elsink|helSink|helsink|helzink|xelsink)-(banhelsink|fanhelsink|fanhelzink|vanhelsink|vanhelzink|vanjelsink)" , NameType.GENERIC , RuleType.EXACT , java.lang.Boolean.FALSE , TEN }, new Object[]{ "Judenburg" , "iudnbYrk|iudnbirk|iudnburk|xudnbirk|xudnburk|zudnbirk|zudnburk" , NameType.GENERIC , RuleType.APPROX , java.lang.Boolean.TRUE , TEN });
    }

    private final boolean concat;

    private final String name;

    private final NameType nameType;

    private final String phoneticExpected;

    private final RuleType ruleType;

    private final int maxPhonemes;

    public PhoneticEngineTest(final String name ,final String phoneticExpected ,final NameType nameType ,final RuleType ruleType ,final boolean concat ,final int maxPhonemes) {
        this.name = name;
        this.phoneticExpected = phoneticExpected;
        this.nameType = nameType;
        this.ruleType = ruleType;
        this.concat = concat;
        this.maxPhonemes = maxPhonemes;
    }

    @Test(timeout = 10001L)
    public void testEncode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("\\|");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("-");
            for (final String word : words) {
                final String[] split = word.split("\\|");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 9999L)
    public void testEncode_literalMutation312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode_literalMutation312");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("\\|");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("-");
            for (final String word : words) {
                final String[] split = word.split("\\|");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 5000L)
    public void testEncode_literalMutation313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode_literalMutation313");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("\\|");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("-");
            for (final String word : words) {
                final String[] split = word.split("\\|");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 20000L)
    public void testEncode_literalMutation314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode_literalMutation314");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("\\|");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("-");
            for (final String word : words) {
                final String[] split = word.split("\\|");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 10000L)
    public void testEncode_literalMutation315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode_literalMutation315");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("foo");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("-");
            for (final String word : words) {
                final String[] split = word.split("\\|");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 10000L)
    public void testEncode_literalMutation316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode_literalMutation316");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("\\|");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("foo");
            for (final String word : words) {
                final String[] split = word.split("\\|");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 10000L)
    public void testEncode_literalMutation317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncode_literalMutation317");
        final PhoneticEngine engine = new PhoneticEngine(this.nameType , this.ruleType , this.concat , this.maxPhonemes);
        final String phoneticActual = engine.encode(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,this.phoneticExpected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),346,phoneticActual);
        if (this.concat) {
            final String[] split = phoneticActual.split("\\|");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,((split.length) <= (this.maxPhonemes)));
        } else {
            final String[] words = phoneticActual.split("-");
            for (final String word : words) {
                final String[] split = word.split("bar");
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),348,((split.length) <= (this.maxPhonemes)));
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

