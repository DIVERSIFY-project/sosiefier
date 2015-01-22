package fr.inria.diversify.oldTests;

import fr.inria.diversify.util.StringSimilarity;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by marodrig on 21/12/2014.
 */
public class StringSimilarityTest {

    @Test
    public void similarityTest() {
        assertTrue((1.0 - StringSimilarity.CompareStrings("int = 0", "int = 0")) < 0.00001);
        assertFalse((1.0 - StringSimilarity.CompareStrings("int = 0", "int = 2")) < 0.00001);
    }



}
