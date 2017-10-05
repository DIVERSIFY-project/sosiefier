package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.RemoveInvocation;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 08/08/17.
 */
public class RemoveInvocationQuery extends TransformationQuery {
    List<CtInvocation> invocations;
    Iterator<CtInvocation> it;
    public RemoveInvocationQuery(InputProgram inputProgram) {
        super(inputProgram);
        /*invocations = getInputProgram().getAllElement(CtInvocation.class);

        invocations = invocations.stream()
                .filter(inv -> getInputProgram().getCoverageReport().positionCoverage(inv.getPosition()) != 0)
                .collect(Collectors.toList());*/
        List<CtInvocation> tmp = getInputProgram().getAllElement(CtInvocation.class);
        System.out.println("Candidates: " + tmp.size());
        invocations = new ArrayList<>();
        for(CtInvocation i: tmp) {
            try {
                if(getInputProgram().getCoverageReport().positionCoverage(i.getPosition()) != 0) {
                    invocations.add(i);
                } else {
                    System.out.println("Pos: " + i.getPosition() + " not covered");
                }
            } catch (Exception e) {
                System.out.println("problem");
            }
        }



        Collections.shuffle(invocations);
        it = invocations.iterator();
        System.out.println("Candidates (Selected): " + invocations.size());
    }

    @Override
    public Transformation query() throws QueryException {
        while (it.hasNext())
            return new RemoveInvocation(it.next());
        throw new QueryException("No more candidate");
    }
}
