package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragmentProcessor.BinaryOperatorProcessor;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.mutation.ConditionalBoundaryMutation;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 14:31
 */
public class MutationQuery extends TransformationQuery {
    ICoverageReport coverageReport;
    List<CtBinaryOperator<?>> binaryOperators;


    public MutationQuery(ICoverageReport coverageReport, Factory factory) {
        this.coverageReport = coverageReport;
        init(factory);
    }

    protected void init(Factory factory) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        BinaryOperatorProcessor processor = new BinaryOperatorProcessor();
        pm.addProcessor(processor);
        pm.process();

        binaryOperators = processor.getBinaryOperators();
    }

    @Override
    public void setType(String type) {

    }

    public ConditionalBoundaryMutation getTransformation() throws Exception {
        ConditionalBoundaryMutation mutation = new ConditionalBoundaryMutation();

        Random r  = new Random();
        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setOperator(operator);
        return mutation;
    }
}
