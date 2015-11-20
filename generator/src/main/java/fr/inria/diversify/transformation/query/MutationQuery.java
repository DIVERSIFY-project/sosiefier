package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.mutation.*;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;


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
    protected List<CtBinaryOperator> binaryOperators;
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
        binaryOperators = getInputProgram().getAllElement(CtBinaryOperator.class);
        returns = getInputProgram().getAllElement(CtReturn.class);
        inlineConstant = getInputProgram().getAllElement(CtLocalVariable.class);
    }

    @Override
    public Transformation query() {
        try {
            Random r = new Random();
            int i = r.nextInt(7);

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
            }
            return t;
        } catch ( Exception e ) {
            throw new RuntimeException(e);
        }
    }

    public NegateConditionalMutation getNegateConditionalMutation() throws Exception {
        Random r  = new Random();

        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !negateConditional.contains(operator.getKind())) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        return new NegateConditionalMutation(operator);
    }

    public ConditionalBoundaryMutation getConditionalBoundaryMutation() throws Exception {
        Random r  = new Random();

        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !conditionalBoundary.contains(operator.getKind())) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        return new ConditionalBoundaryMutation(operator);
    }

    public MathMutation getMathMutation() throws Exception {
        Random r  = new Random();
        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0 || !math.contains(operator.getKind())) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        return new MathMutation(operator);
    }

    public RemoveConditionalMutation getRemoveConditionalMutation() throws Exception {
        Random r  = new Random();
        CtBinaryOperator operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        while (coverageReport.elementCoverage(operator) == 0) {
            operator = binaryOperators.get(r.nextInt(binaryOperators.size()));
        }
        return new RemoveConditionalMutation(operator);
    }

    public ReturnValueMutation getReturnValueMutation() {
        Random r  = new Random();
        CtReturn ret = returns.get(r.nextInt(returns.size()));
        while (coverageReport.elementCoverage(ret) == 0) {
            ret = returns.get(r.nextInt(returns.size()));
        }
        return new ReturnValueMutation(ret);
    }

}
