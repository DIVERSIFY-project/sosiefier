package org.apache.commons.codec.language.bm;

import java.util.List;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.Test;

/** 
 * Tests guessLanguages API.
 * 
 * @since 1.6
 */
@RunWith(value = Parameterized.class)
public class LanguageGuessingTest {
    private static String EXACT = "exact";

    private static String ONE_OF = "one of";

    @Parameterized.Parameters(name = "{0}-{1}-{2}")
    public static List<java.lang.Object[]> data() {
        return java.util.Arrays.asList(new Object[][]{ new Object[]{ "Renault" , "french" , LanguageGuessingTest.EXACT } , new Object[]{ "Mickiewicz" , "polish" , LanguageGuessingTest.EXACT } , new Object[]{ "Thompson" , "english" , LanguageGuessingTest.ONE_OF } , new Object[]{ "Nuñez" , "spanish" , LanguageGuessingTest.EXACT } , new Object[]{ "Carvalho" , "portuguese" , LanguageGuessingTest.EXACT } , new Object[]{ "Čapek" , "czech" , LanguageGuessingTest.EXACT } , new Object[]{ "Sjneijder" , "dutch" , LanguageGuessingTest.EXACT } , new Object[]{ "Klausewitz" , "german" , LanguageGuessingTest.EXACT } , new Object[]{ "Küçük" , "turkish" , LanguageGuessingTest.EXACT } , new Object[]{ "Giacometti" , "italian" , LanguageGuessingTest.EXACT } , new Object[]{ "Nagy" , "hungarian" , LanguageGuessingTest.EXACT } , new Object[]{ "Ceauşescu" , "romanian" , LanguageGuessingTest.EXACT } , new Object[]{ "Angelopoulos" , "greeklatin" , LanguageGuessingTest.EXACT } , new Object[]{ "Αγγελόπουλος" , "greek" , LanguageGuessingTest.EXACT } , new Object[]{ "Пушкин" , "cyrillic" , LanguageGuessingTest.EXACT } , new Object[]{ "כהן" , "hebrew" , LanguageGuessingTest.EXACT } , new Object[]{ "ácz" , "any" , LanguageGuessingTest.EXACT } , new Object[]{ "átz" , "any" , LanguageGuessingTest.EXACT } });
    }

    private final String exactness;

    private final Lang lang = Lang.instance(org.apache.commons.codec.language.bm.NameType.GENERIC);

    private final String language;

    private final String name;

    public LanguageGuessingTest(final String name ,final String language ,final String exactness) {
        this.name = name;
        this.language = language;
        this.exactness = exactness;
    }

    @Test
    public void testLanguageGuessing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLanguageGuessing");
        final Languages.LanguageSet guesses = this.lang.guessLanguages(this.name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),214,(((((("language predicted for name \'" + (this.name)) + "\' is wrong: ") + guesses) + " should contain \'") + (this.language)) + "\'"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),216,guesses,215,guesses.contains(this.language));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

