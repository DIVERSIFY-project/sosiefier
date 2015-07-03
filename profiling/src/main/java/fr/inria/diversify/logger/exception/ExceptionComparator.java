package fr.inria.diversify.logger.exception;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.cu.SourcePosition;

import java.util.Collection;
import java.util.LinkedList;

/**
 * User: Simon
 * Date: 26/06/15
 * Time: 16:12
 */
public class ExceptionComparator implements Comparator {

    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        ExceptionReader builder = new ExceptionReader(originalLogDir);
        Collection<ExceptionPosition> originalExceptions = builder.load();

        builder = new ExceptionReader(sosieLogDir);
        Collection<ExceptionPosition> sosieExceptions = builder.load();

        ExceptionDiff diff = new ExceptionDiff();
        for(ExceptionPosition oException : originalExceptions) {
            ExceptionPosition sException = sosieExceptions.stream()
                    .filter(g -> g.getName().equals(oException.getName()))
                    .findFirst()
                    .get();
            ExceptionDiff gDiff = oException.diff(sException);
            if(gDiff.size() != 0) {
                diff.merge(gDiff);
            }
        }
        return diff;
    }

    @Override
    public Collection<String> selectTest(SourcePosition position) {
        return new LinkedList<>();
    }

    @Override
    public Diff getEmptyDiff() {
        return new ExceptionDiff();
    }
}
