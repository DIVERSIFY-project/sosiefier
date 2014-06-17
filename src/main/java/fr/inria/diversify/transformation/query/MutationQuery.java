package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.DiversifyEnvironment;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.mutation.*;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 14:31
 */
public class MutationQuery extends TransformationQuery {
    protected ICoverageReport coverageReport;
    protected List<CtElement> binaryOperators;
    protected List<CtReturn> returns;
    protected List<CtLocalVariable> inlineConstant;

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


    public MutationQuery(InputProgram inputProgram) {
        super(inputProgram);
        this.coverageReport = inputProgram.getCoverageReport();
        init();
    }

    protected void init() {

        binaryOperators = inputProgram.getAllElement(CtBinaryOperator.class);
        returns = inputProgram.getReturns();
        inlineConstant = inputProgram.getInlineConstant();
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected List<Transformation> query(int nb) {
        try {
            List<Transformation> result = new ArrayList<>();
            Random r = new Random();
            for (int j = 0; j < nb; j++) {
                int i = r.nextInt(8);

                Transformation t = null;
                switch (i) {
                    case 0:
                        t = getNegateConditionalMutation();
                        break;
                    case 1:
                        t = getConditionalBoundaryMutation();
                        break;
                    case 2:
                    case 3:
                    case 4:
                        t = getMathMutation();
                        break;
                    case 5:
                        t = getRemoveConditionalMutation();
                        break;
                    case 6:
                        t = getReturnValueMutation();
                        break;
                    case 7:
                        t = getInlineConstantMutation();
                        break;
                }
                result.add(t);
            }
            return result;
        } catch ( Exception e ) {
            throw new RuntimeException(e);
        }
    }

    public NegateConditionalMutation getNegateConditionalMutation() throws Exception {
        NegateConditionalMutation mutation = new NegateConditionalMutation();

        Random r  = new Random();

        CtBinaryOperator operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !negateConditional.contains(operator.getKind())) {
            operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setTransformationPoint(operator);
        return mutation;
    }

    public ConditionalBoundaryMutation getConditionalBoundaryMutation() throws Exception {
        ConditionalBoundaryMutation mutation = new ConditionalBoundaryMutation();

        Random r  = new Random();

        CtBinaryOperator operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !conditionalBoundary.contains(operator.getKind())) {
            operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setTransformationPoint(operator);
        return mutation;
    }

    public MathMutation getMathMutation() throws Exception {
        MathMutation mutation = new MathMutation();

        Random r  = new Random();
        CtBinaryOperator operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !math.contains(operator.getKind())) {
            operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setTransformationPoint(operator);
        return mutation;
    }

    public RemoveConditionalMutation getRemoveConditionalMutation() throws Exception {
        RemoveConditionalMutation mutation = new RemoveConditionalMutation();

        Random r  = new Random();
        CtBinaryOperator operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0) {
            operator = (CtBinaryOperator)binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        mutation.setTransformationPoint(operator);
        return mutation;
    }

    public ReturnValueMutation getReturnValueMutation() {
        ReturnValueMutation mutation = new ReturnValueMutation();

        Random r  = new Random();
        CtReturn ret = returns.get(r.nextInt(returns.size()));
        while (coverageReport.elementCoverage(ret) == 0) {
            ret = returns.get(r.nextInt(returns.size()));
        }
        mutation.setTransformationPoint(ret);
        return mutation;
    }

    public InlineConstantMutation getInlineConstantMutation() {
        InlineConstantMutation mutation = new InlineConstantMutation();

        Random r  = new Random();
        CtLocalVariable ret = inlineConstant.get(r.nextInt(inlineConstant.size()));
        while (coverageReport.elementCoverage(ret) == 0) {
            ret = inlineConstant.get(r.nextInt(inlineConstant.size()));
        }
        mutation.setTransformationPoint(ret);
        return mutation;
    }
}
