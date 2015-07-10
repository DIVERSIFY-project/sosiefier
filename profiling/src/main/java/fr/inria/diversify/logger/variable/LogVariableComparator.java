package fr.inria.diversify.logger.variable;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.cu.SourcePosition;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 29/06/15
 * Time: 13:48
 */
public class  LogVariableComparator implements Comparator {
    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        try {
            LogTestReader builder = new LogTestReader();
            Collection<Test> originalVariables = builder.loadLog(originalLogDir);

            if(originalVariables.size() == 0) {
                return getEmptyDiff();
            }

            builder = new LogTestReader();
            Collection<Test> sosieVariables = builder.loadLog(sosieLogDir);

            VariableDiff diff = new VariableDiff();
            for (Test oVars : originalVariables) {
                Test sVars = sosieVariables.stream()
                        .filter(g -> g.getSignature().equals(oVars.getSignature()))
                        .findFirst()
                        .get();
                Set<String> gDiff = oVars.diff(sVars).stream()
                        .filter(position -> !(position.contains(transformation.classLocationName())
                            && position.contains(transformation.methodLocationName())))
                            .collect(Collectors.toSet());
                if (gDiff.size() != 0) {
                    diff.add(oVars.getSignature(), gDiff);
                }
            }
            return diff;
        }catch (Exception e) {
            e.printStackTrace();
            return getEmptyDiff();
        }
    }

    @Override
    public Collection<String> selectTest(SourcePosition position) {
        return new LinkedList<>();
    }

    @Override
    public Diff getEmptyDiff() {
        return new VariableDiff();
    }
}
