package fr.inria.diversify.sosie.compare.refactor;

import java.util.List;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 16:38
 */
public class AssertDiff extends Diff {
    List<String> sosieAssert;
    List<String> originalAssert;
    String assertType;

    public AssertDiff(String className, String methodSignature, String assertType, List<String> originalAssert, List<String> sosieAssert) {
        this.className = className;
        this.methodSignature = methodSignature;
        this.assertType = assertType;
        this.originalAssert = originalAssert;
        this.sosieAssert =sosieAssert;
    }
}
