package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.other.ReplaceLiteral;
import fr.inria.diversify.transformation.other.ReplaceNew;
import fr.inria.diversify.util.DiversifyEnvironment;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.CtType;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Simon on 19/03/14.
 */
public class OtherQuery extends TransformationQuery {
    protected ICoverageReport coverageReport;
    private List<CtElement> literals;
    private List<CtElement> newClasses;

    @Override
    public void setType(String type) {

    }

    protected void init() {
        literals = DiversifyEnvironment.getAllElement(CtLiteral.class);
        newClasses = DiversifyEnvironment.getAllElement(CtNewClass.class);
    }

    @Override
    public Transformation getTransformation() throws Exception {
        Random r = new Random();
        if(r.nextDouble() < 0.5)
            return NewReplace();
//        else
//            return LiteralReplace();
        return null;
    }

    private ReplaceLiteral LiteralReplace() {
        ReplaceLiteral rl = new ReplaceLiteral();

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

    private ReplaceNew NewReplace() {
        ReplaceNew rn = new ReplaceNew();

        int size = newClasses.size();
        Random r  = new Random();

        CtElement newClass = newClasses.get(r.nextInt(size));
        while (coverageReport.elementCoverage(newClass) == 0) {
            newClass = newClasses.get(r.nextInt(size));
        }
        rn.setTransplantationPoint((CtNewClass)newClass);
        rn.setTransplant((CtNewClass)literals.get(r.nextInt(size)));

        return null;
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
