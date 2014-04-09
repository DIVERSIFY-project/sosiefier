package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.other.EmptyMethodBody;
import fr.inria.diversify.transformation.other.ReplaceLiteral;
import fr.inria.diversify.transformation.other.ReplaceNew;
import fr.inria.diversify.util.DiversifyEnvironment;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Simon on 19/03/14.
 */
public class OtherQuery extends TransformationQuery {
    protected ICoverageReport coverageReport;


    public OtherQuery(ICoverageReport coverageReport) {
        this.coverageReport = coverageReport;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation getTransformation() throws Exception {
//        Random r = new Random();
//        if(r.nextDouble() < 0.5)
            return getEmptyMethodBody();
//        else
//            return LiteralReplace();
//        return null;
    }

    private ReplaceLiteral getLiteralReplace() {
        ReplaceLiteral rl = new ReplaceLiteral();
        List<CtElement> literals = DiversifyEnvironment.getAllElement(CtLiteral.class);

        int size = literals.size();
        Random r  = new Random();

        CtElement literal = literals.get(r.nextInt(size));
        while (coverageReport.elementCoverage(literal) == 0) {
            literal = literals.get(r.nextInt(size));
        }
        rl.setTransplantationPoint((CtLiteral)literal);
        rl.setTransplant((CtLiteral)literals.get(r.nextInt(size)));

        return null;
    }

    private ReplaceNew getNewReplace() {
        ReplaceNew rn = new ReplaceNew();
        List<CtElement> newClasses = DiversifyEnvironment.getAllElement(CtNewClass.class);

        int size = newClasses.size();
        Random r  = new Random();

        CtElement newClass = newClasses.get(r.nextInt(size));
        while (coverageReport.elementCoverage(newClass) == 0) {
            newClass = newClasses.get(r.nextInt(size));
        }
        rn.setTransformationPoint((CtNewClass) newClass);
        rn.setTransplant((CtNewClass)newClasses.get(r.nextInt(size)));

        return null;
    }

    protected EmptyMethodBody getEmptyMethodBody() {
        EmptyMethodBody emb = new EmptyMethodBody();

        List<CtElement> methods = DiversifyEnvironment.getAllElement(CtMethod.class);
        int size = methods.size();
        Random r  = new Random();

        CtMethod method = (CtMethod) methods.get(r.nextInt(size));

        while (coverageReport.elementCoverage(method) == 0
                || method.getBody() == null
                || method.getBody().getStatements() == null
                || method.getBody().getStatements().isEmpty()
                || method.getType().isPrimitive()) {
            method = (CtMethod) methods.get(r.nextInt(size));
        }

        emb.setTransformationPoint(method);

        return emb;
    }

//    private List<CtNewClass> newReplaceCandidate(CtNewClass newClass) {
//        String superType = null;
//        CtElement parent = newClass.getParent();
//
//        if(parent instanceof CtAssignment) {
//            CtAssignment assignment = (CtAssignment)parent;
//            superType = assignment.getAssigned().getType().getDeclaration().getQualifiedName();
//        }
//        if(parent instanceof CtLocalVariable) {
//            CtLocalVariable var = (CtLocalVariable)parent;
//            superType = var.getType().getDeclaration().getQualifiedName();
//        }
//        superType = newClass.getType().getDeclaration().getQualifiedName();
//
//
//        List<CtNewClass> classes = new ArrayList<CtNewClass>();
//        for(CtElement element : newClasses) {
//            CtNewClass nl = (CtNewClass)element;
//            if(nl.getType().getDeclaration().s)
//        }
//
//    }

}
