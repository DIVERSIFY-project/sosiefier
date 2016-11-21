package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 04/11/16.
 */
public class PureADRTransformationQuery extends ADRTransformationQuery {

    private Set<String> pureMethods;


    public PureADRTransformationQuery(InputProgram inputProgram, boolean subType, boolean isStupid, String pureMethodList) {
        super(inputProgram, subType, isStupid);
        //pureMethods = pureMethodList.split(" ");
        //System.out.println("Nb pure method: " + pureMethods.length);
        pureMethods = new HashSet<>(Arrays.asList(pureMethodList.split(" ")));
    }

    public boolean isPure(CodeFragment c, Set<String> pureMethodsSet) {
        CtElement ct = (CtElement) c;
        CtMethod m = ct.getParent(CtMethod.class);
        CtClass cl = m.getParent(CtClass.class);
        if(pureMethodsSet.contains(cl.getQualifiedName() + "." + m.getSimpleName() + "(" + m.getSignature().trim() + ")"))
            return true;
        else
            return false;
    }

    @Override
    protected List<CodeFragment> getAllUniqueCodeFragments() {
        //List<CodeFragment>  list = new ArrayList<>(getInputProgram().getCodeFragments().getUniqueCodeFragmentList());
        List<CodeFragment> list = getInputProgram().getCodeFragments().getUniqueCodeFragmentList().stream().filter(c -> isPure(c, pureMethods)).collect(Collectors.toList());
        Collections.shuffle(list);
        return list;
    }

    @Override
    public Transformation pQuery() throws QueryException {
        try {
            ASTTransformation t = null;
            int i = random.nextInt(stupid ? 9 : 3);
            switch (i) {
                case 0:
                    t = replace(subType);
                    break;
                case 1:
                    t = add(subType);
                    break;
                case 2:
                    t = delete();
                    break;
                case 3:
                    t = replaceRandom();
                    break;
                case 4:
                    t = addRandom();
                    break;
                case 5:
                    t = replaceWittgenstein();
                    break;
                case 6:
                    t = addWittgenstein();
                    break;
                case 7: {
                    t = replace(subType);
                    t.setName("replaceReaction");
                    break;
                }
                case 8: {
                    t = add(subType);
                    t.setName("addReaction");
                    break;
                }
            }
            t.setInputProgram(getInputProgram());
            return t;

        } catch (Exception e) {
            throw new QueryException(e);
        }
    }
}
