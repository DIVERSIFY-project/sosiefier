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

/**
 * User: Simon
 * Date: 29/06/15
 * Time: 13:48
 */
public class LogVariableComparator implements Comparator {
    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        LogTestReader builder = new LogTestReader();
        Collection<Test> originalVariables = builder.loadLog(originalLogDir);

        builder = new LogTestReader();
        Collection<Test> sosieVariables = builder.loadLog(sosieLogDir);

        VariableDiff diff = new VariableDiff();
        for(Test oGraph : originalVariables) {
            Test sGraph = sosieVariables.stream()
                    .filter(g -> g.getSignature().equals(oGraph.getSignature()))
                    .findFirst()
                    .get();
            Set<String> gDiff = oGraph.diff(sGraph);
            if(gDiff.size() != 0) {
                diff.add(oGraph.getSignature(), gDiff);
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
        return new VariableDiff();
    }
}
