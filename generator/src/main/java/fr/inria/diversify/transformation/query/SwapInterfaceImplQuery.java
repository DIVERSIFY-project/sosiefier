package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 06/06/17.
 */
public class SwapInterfaceImplQuery extends TransformationQuery {
    private List<Map.Entry<CtConstructorCall, CtConstructorCall>> candidates;
    private List<CtType> types;
    private Iterator<Map.Entry<CtConstructorCall, CtConstructorCall>> candidateIt;


    public SwapInterfaceImplQuery(InputProgram inputProgram) {
        super(inputProgram);
        findCandidates();
        candidateIt = candidates.iterator();
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
        candidates = new ArrayList<>();
        System.out.println(" --- Search for for Candidates --- ");
        Collection<CtConstructorCall> calls = getInputProgram().getAllElement(CtConstructorCall.class);
        int collections = 0;
        int skipped = 0;
        List<CtConstructorCall> colCalls = new ArrayList<>();
        List<CtConstructorCall> skippedCalls = new ArrayList<>();
        for(CtConstructorCall call : calls) {
            Factory f = call.getFactory();
            //System.out.println("c: " + call + " in " + ((CtClass) call.getParent(CtClass.class)).getSimpleName());
            CtTypedElement parent = call.getParent(CtTypedElement.class);
            skipped++;
            skippedCalls.add(call);
            if(parent.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
            if(call.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
            if(call.getType().getQualifiedName() == parent.getType().getQualifiedName()) continue;

            skipped--;
            skippedCalls.remove(call);



        }
        System.out.println(" --- Done (" + candidates.size() + " coll: " + collections + " skipped: " + skipped + ") --- ");
    }

    public List<CtConstructorCall> buildConstructorCall(CtConstructorCall call, Set<String> l, String type, String param) {
        Factory f = call.getFactory();
        List<CtConstructorCall> res = new ArrayList<>();
        for(String c : l) {
            if(!call.getType().getQualifiedName().equals(c)) {
                try {
                    res.add((CtConstructorCall) f.Code().createCodeSnippetExpression("new " + c + "<" + type + ">("+ param + ")").compile());
                } catch (Exception ex) {}
            }
        }
        return res;
    }


    @Override
    public Transformation query() throws QueryException {
        //try {
        Map.Entry<CtConstructorCall, CtConstructorCall> cur = candidateIt.next();
        CtConstructorCall tp = cur.getKey();
        CtConstructorCall c = cur.getValue();
        return new SwapSubType(tp, c);
    }

    @Override
    public boolean hasNextTransformation() {
        return (candidateIt.hasNext());
    }
}