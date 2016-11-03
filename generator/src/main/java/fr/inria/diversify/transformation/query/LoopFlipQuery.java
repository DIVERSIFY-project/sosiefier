package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.LoopFlip;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtFor;
import spoon.reflect.declaration.CtElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nicolas on 11.10.16.
 */
public class LoopFlipQuery extends TransformationQuery {
    protected List<CtFor> candidateList;

    public LoopFlipQuery(InputProgram inputProgram) {
        super(inputProgram);
        initFindForLoops();
    }

    private void initFindForLoops() {
        candidateList = new ArrayList<>();
        System.out.println(" --- Search for for loops --- ");
        for (CtElement ce : getInputProgram().getAllElement(CtFor.class)) {
            CtFor f = (CtFor) ce;
            if (LoopFlip.isApplyPossible(f)) {
                candidateList.add(f);
            }
        }
        System.out.println(" --- Done (" + getInputProgram().getAllElement(CtFor.class).size() + ") --- ");
        Collections.shuffle(candidateList);
    }

    @Override
    public Transformation query() throws QueryException {

        LoopFlip result;
        if(!candidateList.isEmpty()) {
            result = new LoopFlip(candidateList.get(0));
            candidateList.remove(0);
        } else {
            System.out.println(" --- No candidate found --- ");
            return null;
        }
        result.setInputProgram(getInputProgram());

        return result;
    }

    @Override
    public boolean hasNextTransformation() {
        return !candidateList.isEmpty();
    }
}
