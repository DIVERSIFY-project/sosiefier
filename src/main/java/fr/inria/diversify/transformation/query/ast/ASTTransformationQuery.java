package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.DiversifyEnvironment;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

import java.util.*;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class ASTTransformationQuery extends TransformationQuery {
    protected ICoverageReport coverageReport;
    protected Class CodeFragmentClass;
    protected CodeFragmentList codeFragments;
    protected boolean stupid;


    public ASTTransformationQuery(ICoverageReport coverageReport,Class transformationClass, boolean stupid) {
        this.coverageReport = coverageReport;
        init();
        this.CodeFragmentClass = transformationClass;
        this.stupid = stupid;
    }


    @Override
    public void setType(String type) {

    }

    public ASTTransformation getTransformation() throws Exception {
        Random r = new Random();
        ASTTransformation t = null;
        int i = r.nextInt(stupid ? 14 : 4);
        switch (i) {
            case 0: case 1:
                return replace();
            case 2: case 3:
                return add();
            case 4:
                return delete();
            case 6: case 7:
                return replaceRandom();
            case 8: case 9:
                return addRandom();
            case 10:
                return replaceWittgenstein();
            case 11:
                return addWittgenstein();
            case 12: {
                t = replace();
                t.setName("replaceReaction");
                return t;
            }
            case 13: {
                t = add();
                t.setName("addReaction");
                return t;
            }

        }
        return null;
    }
    
    public ASTReplace replace() throws Exception {
        ASTReplace tf = new ASTReplace();
            CodeFragment cfToReplace = null;
            CodeFragment cfReplacedBy = null;

                while (cfReplacedBy == null) {
                    cfToReplace = randomCodeFragmentToReplace(true);
                    cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace,false);
                }
            tf.setTransplantationPoint(cfToReplace);
            tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }

    public ASTReplace replaceWittgenstein() throws Exception {
        ASTReplace tf = new ASTReplace();
        CodeFragment cfToReplace = null;
        CodeFragment cfReplacedBy = null;

        while (cfReplacedBy == null) {
            cfToReplace = randomCodeFragmentToReplace(true);
            cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace,true);
        }
        tf.setName("replaceWittgenstein");
        tf.setTransplantationPoint(cfReplacedBy);
        tf.setCodeFragmentToReplace(cfToReplace);
        return tf;
    }

    public ASTReplace replaceRandom() throws Exception {
        ASTReplace tf = new ASTReplace();
        tf.setTransplantationPoint(randomCodeFragmentToReplace(true));
        tf.setCodeFragmentToReplace(randomCodeFragmentToReplace(false));
        tf.setName("replaceRandom");
        return tf;
    }

    public ASTAdd addRandom() throws Exception {
        ASTAdd tf = new ASTAdd();
        tf.setTransplantationPoint(randomCodeFragmentToReplace(true));
        tf.setCodeFragmentToAdd(randomCodeFragmentToReplace(false));
        tf.setName("addRandom");
        return tf;
    }

    public ASTReplace replace(CodeFragment cfToReplace, boolean varNameMatch) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, varNameMatch);
        if(cfReplacedBy == null)
            new Exception("pas de candidat pour "+cfToReplace);
        tf.setTransplantationPoint(cfToReplace);
        tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }

//    public ASTReplace notContextReplace(CodeFragment cfToReplace) throws Exception {
//        Random r = new Random();
//        ASTReplace tf = new ASTReplace();
//        tf.setType("notContextReplace");
//        int size = codeFragments.size();
//        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
//        tf.setTransplantationPoint(cfToReplace);
//        tf.setCodeFragmentToReplace(cfReplacedBy);
//        return tf;
//    }

    public ASTAdd addWittgenstein() throws Exception {
        ASTAdd tf = new ASTAdd();
            CodeFragment cfToReplace = null;
            CodeFragment cfReplacedBy =null;

                while (cfReplacedBy == null) {
                    cfToReplace = randomCodeFragmentToReplace(true);
                    cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, true);
                }
        tf.setTransplantationPoint(cfReplacedBy);
        tf.setCodeFragmentToAdd(cfToReplace);
        return tf;
    }

    public ASTAdd add() throws Exception {
        ASTAdd tf = new ASTAdd();
        CodeFragment cfToReplace = null;
        CodeFragment cfReplacedBy =null;

        while (cfReplacedBy == null) {
            cfToReplace = randomCodeFragmentToReplace(true);
            cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, false);
        }
        tf.setTransplantationPoint(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

    public ASTAdd add(CodeFragment cfToReplace, boolean varNameMatch) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, varNameMatch);
        if(cfReplacedBy == null)
            new Exception("pas de candidat pour "+cfToReplace);
        tf.setTransplantationPoint(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

//    public ASTAdd notContextAdd(CodeFragment cfToReplace) throws Exception {
//        Random r = new Random();
//        ASTAdd tf = new ASTAdd();
//        tf.setName("notContextAdd");
//        int size = codeFragments.size();
//        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
//        tf.setTransplantationPoint(cfToReplace);
//        tf.setCodeFragmentToAdd(cfReplacedBy);
//        return tf;
//    }

    public ASTDelete delete() throws Exception {
        ASTDelete tf = new ASTDelete();
            CodeFragment cfToDelete = null;
                while (cfToDelete == null) {
                 cfToDelete = randomCodeFragmentToReplace(true);
                    if (cfToDelete.getCtCodeFragment() instanceof CtReturn)
                        cfToDelete = null;
                }
            tf.setTransplantationPoint(cfToDelete);
        return tf;
    }


    public ASTDelete delete(CodeFragment cfToDelete) throws Exception {
        ASTDelete tf = new ASTDelete();
        tf.setTransplantationPoint(cfToDelete);
        return tf;
    }

    protected CodeFragment getCodeFragmentReplacedBy(CodeFragment cfToReplace, boolean varNameMatch) throws InstantiationException, IllegalAccessException {
        CodeFragment cfReplacedBy = null;
        if (cfReplacedBy == null) {
            cfReplacedBy = findRandomCodeFragmentCandidate(cfToReplace, varNameMatch);
        }
        return cfReplacedBy;
    }

    protected CodeFragment randomCodeFragmentToReplace(boolean withCoverage) {
        Random r = new Random();
        int size = codeFragments.size();
        CodeFragment stmt = codeFragments.get(r.nextInt(size));

        while (withCoverage && coverageReport.codeFragmentCoverage(stmt) == 0)
            stmt = codeFragments.get(r.nextInt(size));
        return stmt;
    }

    protected CodeFragment findRandomCodeFragmentCandidate(CodeFragment cf, boolean varNameMatch) throws IllegalAccessException, InstantiationException {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment codeFragment : getAllUniqueCodeFragments())
            if (cf.isReplace(codeFragment, varNameMatch) && !codeFragment.equalString().equals(cf.equalString())) {
                list.add(codeFragment);
            }

        if (list.isEmpty())
            return null;

        Random r = new Random();
        CtCodeElement tmp = (CtCodeElement)copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        CodeFragment ret = (CodeFragment)CodeFragmentClass.newInstance();
        ret.init(tmp);
        return ret;
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    protected void init() {
        codeFragments = DiversifyEnvironment.getCodeFragments();
    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return codeFragments.getUniqueCodeFragmentList();
    }

}
