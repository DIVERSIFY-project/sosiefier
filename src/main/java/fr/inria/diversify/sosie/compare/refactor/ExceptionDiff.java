package fr.inria.diversify.sosie.compare.refactor;

import java.util.List;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 15:05
 */
public class ExceptionDiff extends Diff {
    boolean isCatch;
    List<String> originalStackTrace;
    List<String> sosieStackTrace;

    public ExceptionDiff(String className, String methodSignature, boolean isCatch, List<String> originalStackTrace, List<String> sosieStackTrace) {
        this.className = className;
        this.methodSignature = methodSignature;
        this.isCatch = isCatch;
        this.originalStackTrace = originalStackTrace;
        this.sosieStackTrace =sosieStackTrace;
    }
}
