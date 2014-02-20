package fr.inria.diversify;

import fr.inria.diversify.codeFragmentProcessor.BinaryOperatorProcessor;
import fr.inria.diversify.codeFragmentProcessor.InlineConstantProcessor;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.util.List;

/**
 * User: Simon
 * Date: 20/02/14
 * Time: 13:26
 */
public class DiversifyEnvironment {
    protected static CodeFragmentList codeFragments;
    protected static List<CtBinaryOperator<?>> binaryOperators;
    protected static List<CtReturn> returns;
    protected static List<CtLocalVariable> inlineConstant;
    protected static Factory factory;

    public static CodeFragmentList getCodeFragments()  {
        if(codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            StatementProcessor processor = new StatementProcessor();
            pm.addProcessor(processor);
            pm.process();

            codeFragments = processor.getCodeFragments();
        }
        return codeFragments;
    }

    public static List<CtLocalVariable> getInlineConstant() {
        if(inlineConstant == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            InlineConstantProcessor processor = new InlineConstantProcessor();
            pm.addProcessor(processor);
            pm.process();

            inlineConstant = processor.getInlineConstant();
        }
        return inlineConstant;
    }

    public static List<CtReturn> getReturns() {
        if(returns == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            ReturnProcessor processor = new ReturnProcessor();
            pm.addProcessor(processor);
            pm.process();

            returns = processor.getReturns();
        }
        return returns;
    }

    public static List<CtBinaryOperator<?>> getBinaryOperators() {
        if(binaryOperators == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            BinaryOperatorProcessor processor = new BinaryOperatorProcessor();
            pm.addProcessor(processor);
            pm.process();

            binaryOperators = processor.getBinaryOperators();
        }
        return binaryOperators;
    }
}
