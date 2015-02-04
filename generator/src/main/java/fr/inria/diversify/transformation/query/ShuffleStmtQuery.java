package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.other.ShuffleStmtTransformation;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtSuperAccess;
import spoon.reflect.declaration.CtElement;

import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 03/04/14.
 */
public class ShuffleStmtQuery extends TransformationQuery {

    protected ICoverageReport coverageReport;


    public ShuffleStmtQuery(InputProgram inputProgram) {

        super(inputProgram);

        coverageReport = inputProgram.getCoverageReport();
    }

    @Override
    public Transformation query() {
        ShuffleStmtTransformation sst = new ShuffleStmtTransformation();
        List<CtElement> objects = getInputProgram().getAllElement(CtBlock.class);
        Random r = new Random();

        CtBlock block = (CtBlock) objects.get(r.nextInt(objects.size()));
        while (coverageReport.elementCoverage(block) == 0
                || !isCandidate(block)) {
            block = (CtBlock) objects.get(r.nextInt(objects.size()));
        }
        sst.setTransformationPoint(block);

        return sst;
    }

    @Override
    public void executeQuery() {

    }

    protected boolean isCandidate(CtBlock<?> block) {
        if(block.getStatements().size() >= 3)
            return true;
        if(block.getStatements().size() >= 2) {
            for (CtStatement stmt : block.getStatements())
                if (stmt instanceof CtReturn || stmt instanceof CtSuperAccess)
                    return false;
            return true;
        }
        return false;
    }
}
