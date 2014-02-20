package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragmentProcessor.InlineConstantProcessor;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQuery;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 19/02/14
 * Time: 14:49
 */
public class MutationToSosieQuery extends TransformationQuery {
    protected List<Transformation> mutations;
    protected String classesDir;
    protected File jacocoDir;

    public MutationToSosieQuery(String classesDir, File jacocoDir) {
        this.classesDir = classesDir;
        this.jacocoDir = jacocoDir;
        init();
    }

    protected void init() {
//        ProcessingManager pm = new QueueProcessingManager(factory);
//        BinaryOperatorProcessor processor = new BinaryOperatorProcessor();
//        pm.addProcessor(processor);
//
//        ReturnProcessor processor2 = new ReturnProcessor();
//        pm.addProcessor(processor2);
//
//        InlineConstantProcessor processor3 = new InlineConstantProcessor();
//        pm.addProcessor(processor3);
//        pm.process();
//
//        binaryOperators = processor.getBinaryOperators();
//        returns = processor2.getReturns();
//        inlineConstant = processor3.getInlineConstant();
    }


    @Override
    public void setType(String type) {

    }

    @Override
    public ASTTransformation getTransformation() throws Exception {
        Random r = new Random();
        Transformation mutation = mutations.get(r.nextInt(mutations.size()));
        while(mutation.getStatus() != -1)
            mutation = mutations.get(r.nextInt(mutations.size()));

        MultiCoverageReport coverageReport = new MultiCoverageReport(classesDir);
        for(String failure : mutation.getFailures())   {
            String test = formatTest(failure);
            for(File jacocoFile : jacocoDir.listFiles()) {
                if(test.equals(jacocoFile.getName()))
                    coverageReport.addJacocoFile(jacocoFile);
            }
        }

        ASTTransformationQuery query = new ASTTransformationQuery(coverageReport, StatementProcessor.class);

        return query.getTransformation();
    }

    protected String formatTest(String failure) {
        String[] tmp = failure.split("\\.");
        String ret = tmp[0];
        for(int i = 1; i < tmp.length - 1; i++) {
            ret += "." + tmp[i];
        }
        return ret + "#" +tmp[tmp.length - 1] + ".exec";
    }
}
