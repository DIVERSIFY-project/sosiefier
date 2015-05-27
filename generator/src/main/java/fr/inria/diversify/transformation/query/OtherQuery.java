package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.other.EmptyMethodBody;
import fr.inria.diversify.transformation.other.ReplaceLiteral;
import fr.inria.diversify.transformation.other.ReplaceNew;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;

import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 19/03/14.
 */
public class OtherQuery extends TransformationQuery {
    protected ICoverageReport coverageReport;


    public OtherQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public Transformation query() {
        return getEmptyMethodBody();
    }

    private ReplaceLiteral getLiteralReplace() {
        ReplaceLiteral rl = new ReplaceLiteral();
        List<CtElement> literals = getInputProgram().getAllElement(CtLiteral.class);

        int size = literals.size();
        Random r  = new Random();

        CtElement literal = literals.get(r.nextInt(size));
        while (inputProgram.getCoverageReport().elementCoverage(literal) == 0) {
            literal = literals.get(r.nextInt(size));
        }
        rl.setTransplantationPoint((CtLiteral)literal);
        rl.setTransplant((CtLiteral)literals.get(r.nextInt(size)));

        return null;
    }

    private ReplaceNew getNewReplace() {
        ReplaceNew rn = new ReplaceNew();
        List<CtElement> newClasses = getInputProgram().getAllElement(CtNewClass.class);

        int size = newClasses.size();
        Random r  = new Random();

        CtElement newClass = newClasses.get(r.nextInt(size));
        while (coverageReport.elementCoverage(newClass) == 0) {
            newClass = newClasses.get(r.nextInt(size));
        }
        rn.setTransplantationPoint((CtNewClass) newClass);
        rn.setTransplant((CtNewClass)newClasses.get(r.nextInt(size)));

        return null;
    }

    protected EmptyMethodBody getEmptyMethodBody() {
        EmptyMethodBody emb = new EmptyMethodBody();

        List<CtElement> methods = getInputProgram().getAllElement(CtMethod.class);
        int size = methods.size();
        Random r  = new Random();

        CtMethod method = (CtMethod) methods.get(r.nextInt(size));

        while (inputProgram.getCoverageReport().elementCoverage(method) == 0
                || method.getBody() == null
                || method.getBody().getStatements() == null
                || method.getBody().getStatements().isEmpty()
                || method.getType().isPrimitive()) {
            method = (CtMethod) methods.get(r.nextInt(size));
        }

        emb.setTransplantationPoint(method);

        return emb;
    }
}
