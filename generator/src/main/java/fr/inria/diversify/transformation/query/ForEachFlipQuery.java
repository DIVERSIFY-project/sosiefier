package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtStatement;

import java.util.List;

public class ForEachFlipQuery extends TransformationQuery {
    private List<CtForEach> candidateList;
    public ForEachFlipQuery(InputProgram inputProgram) {
        super(inputProgram);
        candidateList = inputProgram.getAllElement(CtForEach.class);
    }

    @Override
    public Transformation query() throws QueryException {
        return null;
    }
}
