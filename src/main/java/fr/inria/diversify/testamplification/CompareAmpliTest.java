package fr.inria.diversify.testamplification;

import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.util.Log;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by Simon on 15/01/15.
 */
public class CompareAmpliTest {

    public static void main(String[] args) throws IOException {
        Log.DEBUG();
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(args[0]);
        Collection<Test> testSosie = reader.loadLog(args[0]);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);

        comparator.compare();

    }
}
