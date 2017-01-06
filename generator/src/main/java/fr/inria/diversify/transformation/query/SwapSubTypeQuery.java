package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.VarFinder;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtAssignmentImpl;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 06/12/16.
 */
public class SwapSubTypeQuery extends TransformationQuery {
    private Map<CtConstructorCall, CtExecutableReference> candidates;
    private List<CtType> types;
    private Iterator<Map.Entry<CtConstructorCall, CtExecutableReference>> candidateIt;


    public SwapSubTypeQuery(InputProgram inputProgram) {
        super(inputProgram);
        CtClass cl;
        Collection<CtType> ts = getInputProgram().getAllElement(CtType.class);
        types = new LinkedList<CtType>(ts.stream().filter(
                t -> !((CtType)t).getModifiers().contains(ModifierKind.PRIVATE) && !((CtType)t).getModifiers().contains(ModifierKind.STATIC)
        ).collect(Collectors.toList()));
        findCandidates();
        candidateIt = candidates.entrySet().iterator();
    }

    private boolean parametersMatch(CtConstructorCall curCall, CtExecutableReference candidate) {
        if(curCall.getArguments().size() != candidate.getParameters().size()) return false;
        List<CtExpression> args = curCall.getArguments();
        List<CtTypeReference> params = candidate.getParameters();
        for(int i = 0; i < args.size(); i++) {
            if(!args.get(i).getType().equals(params.get(i))) return false;
        }
        return true;
    }

    private void findCandidates() {
        candidates = new HashMap<>();
        System.out.println(" --- Search for for Candidates --- ");
        Collection<CtConstructorCall> calls = getInputProgram().getAllElement(CtConstructorCall.class);
        //CtAssignmentImpl

        for(CtConstructorCall call : calls) {
            Factory f = call.getFactory();
            System.out.println("c: " + call + " in " + ((CtClass) call.getParent(CtClass.class)).getSimpleName());
            CtTypedElement parent = call.getParent(CtTypedElement.class);
            if(parent.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
            if(call.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
            if(call.getType().getActualClass() == parent.getType().getActualClass()) continue;
            System.out.println("Expect: " + parent.getType() + " -> found: " + call.getType());
            Collections.shuffle(types);
            for(CtType t : types) {
                CtTypeReference tref = f.Code().createCtTypeReference(t.getActualClass());
                try {
                if(parent.getType().isAssignableFrom(tref)) {
                    for(CtExecutableReference e:  tref.getDeclaration().getAllExecutables()) {
                        if(e.isConstructor()){
                            if(parametersMatch(call,  e)) {
                                System.out.println("Found candidate !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                                candidates.put(call, e);
                            }
                        }
                    }
                }
                } catch(Exception e) {
                    ;
                }
            }
        }
        System.out.println(" --- Done (" + candidates.keySet().size() + ") --- ");
    }


    @Override
    public Transformation query() throws QueryException {
        try {
            Map.Entry<CtConstructorCall, CtExecutableReference> cur = candidateIt.next();
            CtConstructorCall tp = cur.getKey();
            CtExecutableReference c = cur.getValue();
            Factory f = tp.getFactory();
            List<CtExpression> params = tp.getArguments();
            CtExpression[] array = params.toArray(new CtExpression[params.size()]);
            CtConstructorCall cc = f.Code().createConstructorCall(c.getType(), array);
            return new SwapSubType(tp, cc);
        } catch (Exception e) {
            throw new QueryException("No valid candidate");
        }
    }
    //

    @Override
    public boolean hasNextTransformation() {
        return (candidateIt.hasNext());
    }
}
