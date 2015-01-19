package fr.inria.diversify.testamplification.compare.result;

import fr.inria.diversify.testamplification.compare.Assert;

/**
 * Created by Simon on 19/01/15.
 */
public class AssertDiff {
    Assert original;
    Assert sosie;

    public AssertDiff(Assert original, Assert sosie) {
        this.original = sosie;
        this.sosie = sosie;
    }

    @Override
    public String toString() {
        return "original: " + original.toString() + "\nsosie: " + sosie;
    }
}
