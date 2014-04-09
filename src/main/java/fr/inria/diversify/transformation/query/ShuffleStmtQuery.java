package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.other.ShuffleStmtTransformation;
import fr.inria.diversify.util.DiversifyEnvironment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtElement;

import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 03/04/14.
 */
public class ShuffleStmtQuery extends TransformationQuery {
    protected ICoverageReport coverageReport;

    public ShuffleStmtQuery(ICoverageReport rg) {
        coverageReport = rg;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public ShuffleStmtTransformation getTransformation() throws Exception {
        ShuffleStmtTransformation sst = new ShuffleStmtTransformation();
        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtBlock.class);
        Random r = new Random();

        CtBlock block = (CtBlock)objects.get(r.nextInt(objects.size()));
        while (coverageReport.elementCoverage(block) == 0 || block.getStatements().size() <= 4) {
            block = (CtBlock)objects.get(r.nextInt(objects.size()))   ;
        }
        sst.setTransformationPoint(block);

        return sst;
    }
}
