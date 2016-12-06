package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.VarFinder;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;

import java.util.*;

/**
 * Created by nharrand on 06/12/16.
 */
public class SwapSubTypeQuery extends TransformationQuery {
    private List<CtStatement> candidateList;
    private Iterator<CtStatement> candidateIt;
    private CtStatement curCandidate = null;
    private List<CtMethod> curMethods = new LinkedList<>();
    private List<CtMethod> toRemove = new LinkedList<>();



    public SwapSubTypeQuery(InputProgram inputProgram) {
        super(inputProgram);
        findCandidates();
    }

    private void findCandidates() {
        candidateList = new ArrayList<>();
        System.out.println(" --- Search for for Candidates --- ");
        /*candidateAndMethods.putAll(getInputProgram().getAllElement(CtStatement.class).stream()
                .filter(ce -> ce.getParent(CtMethod.class) != null)
                .map(ce -> (CtStatement) ce)
                //.collect(Collectors.toList())
                .collect(Collectors.toMap(ce -> ce, ce -> VarFinder.getAccessibleMethods(ce)))
        );*/
        Collection<CtAssignment> assignments = getInputProgram().getAllElement(CtAssignment.class);
        Collection<CtType> types = getInputProgram().getAllElement(CtType.class);
        for(CtType t : types) {
            if(t.isPrimitive()) types.remove(t);
        }

        for(CtAssignment a : assignments) {
            if(a.getType().isPrimitive()) continue;
            if(a.getType().getSuperclass().getActualClass() == Object.class) continue;
            CtTypeReference parent = a.getType().getSuperclass();
            //parent.isAssignableFrom();
        }
        System.out.println(" --- Done (" + candidateList.size() + ") --- ");
        Collections.shuffle(candidateList);
        candidateIt = candidateList.iterator();
    }


    @Override
    public Transformation query() throws QueryException {
        throw new QueryException("No valid candidate");
    }
    //

    @Override
    public boolean hasNextTransformation() {
        return (!curMethods.isEmpty() || candidateIt.hasNext());
    }
}
