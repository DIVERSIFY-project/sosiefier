package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragmentProcessor.BinaryOperatorProcessor;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.mutation.ConditionalBoundaryMutation;
import fr.inria.diversify.transformation.mutation.MathMutation;
import fr.inria.diversify.transformation.mutation.NegateConditionalMutation;
import fr.inria.diversify.transformation.mutation.RemoveConditionalMutation;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.util.Arrays;
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

    protected static List<BinaryOperatorKind> negateConditional = Arrays.asList(
            new BinaryOperatorKind[]{BinaryOperatorKind.EQ,
                    BinaryOperatorKind.NE, BinaryOperatorKind.LE,
                    BinaryOperatorKind.GT, BinaryOperatorKind.LT,
                    BinaryOperatorKind.GE});

    protected static List<BinaryOperatorKind> conditionalBoundary = Arrays.asList(
            new BinaryOperatorKind[]{BinaryOperatorKind.LT,
                    BinaryOperatorKind.GT,BinaryOperatorKind.LE,
                    BinaryOperatorKind.GE});

    protected static List<BinaryOperatorKind> math = Arrays.asList(
            new BinaryOperatorKind[]{BinaryOperatorKind.PLUS,
                    BinaryOperatorKind.MINUS,BinaryOperatorKind.MUL,
                    BinaryOperatorKind.DIV,BinaryOperatorKind.MOD,
                    BinaryOperatorKind.BITAND, BinaryOperatorKind.BITOR,
                    BinaryOperatorKind.SL,BinaryOperatorKind.SR,
                    BinaryOperatorKind.USR});


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
        this.type = type;
    }

    @Override
    public Transformation getTransformation() throws Exception {
        Random r = new Random();
        int i = r.nextInt(4);
        switch (i) {
            case 0: return getNegateConditionalMutation();
            case 1: return getConditionalBoundaryMutation();
            case 2: return getMathMutation();
            case 3: return getRemoveConditionalMutation();
        }
        return null;
    }

    public NegateConditionalMutation getNegateConditionalMutation() throws Exception {
        NegateConditionalMutation mutation = new NegateConditionalMutation();

        Random r  = new Random();

        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !negateConditional.contains(operator.getKind())) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setOperator(operator);
        return mutation;
    }

    public ConditionalBoundaryMutation getConditionalBoundaryMutation() throws Exception {
        ConditionalBoundaryMutation mutation = new ConditionalBoundaryMutation();

        Random r  = new Random();

        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !conditionalBoundary.contains(operator.getKind())) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setOperator(operator);
        return mutation;
    }

    public MathMutation getMathMutation() throws Exception {
        MathMutation mutation = new MathMutation();

        Random r  = new Random();
        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !math.contains(operator.getKind())) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setOperator(operator);
        return mutation;
    }

    public RemoveConditionalMutation getRemoveConditionalMutation() throws Exception {
        RemoveConditionalMutation mutation = new RemoveConditionalMutation();

        Random r  = new Random();
        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setOperator(operator);
        return mutation;
    }
}
