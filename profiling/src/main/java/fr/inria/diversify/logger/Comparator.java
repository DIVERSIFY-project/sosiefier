package fr.inria.diversify.logger;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.cu.SourcePosition;

import java.util.Collection;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 14:36
 */
public interface Comparator {

    void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception;

    Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception;

    Collection<String> selectTest(SourcePosition position);

    Diff getEmptyDiff();
}
