package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.factory.Factory;

import java.util.*;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class ASTTransformationQuery extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    protected Class CodeFragmentClass;


    public ASTTransformationQuery(ICoverageReport coverageReport, Factory factory,Class transformationClass) {
        this.coverageReport = coverageReport;
//        this.codeFragments = codeFragments;
        init(factory);
        this.CodeFragmentClass = transformationClass;
    }

    public ASTReplace replace() throws Exception {
        ASTReplace tf = new ASTReplace();
            CodeFragment cfToReplace = null;
            CodeFragment cfReplacedBy =null;

                while (cfReplacedBy == null) {
                    cfToReplace = randomCodeFragmentToReplace();
                    cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace,false);
                }
            tf.setPosition(cfToReplace);
            tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }



    public ASTReplace replace(CodeFragment cfToReplace, boolean varNameMatch) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, varNameMatch);
        if(cfReplacedBy == null)
            new Exception("pas de candidat pour "+cfToReplace);
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }

    public ASTReplace notContextReplace(CodeFragment cfToReplace) throws Exception {
        Random r = new Random();
        ASTReplace tf = new ASTReplace();
        tf.setType("notContextReplace");
        int size = codeFragments.size();
        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }

    public ASTAdd add() throws Exception {
        ASTAdd tf = new ASTAdd();
            CodeFragment cfToReplace = null;
            CodeFragment cfReplacedBy =null;

                while (cfReplacedBy == null) {
                    cfToReplace = randomCodeFragmentToReplace();
                    cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, false);
                }
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

    public ASTAdd add(CodeFragment cfToReplace, boolean varNameMatch) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace, varNameMatch);
        if(cfReplacedBy == null)
            new Exception("pas de candidat pour "+cfToReplace);
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

    public ASTAdd notContextAdd(CodeFragment cfToReplace) throws Exception {
        Random r = new Random();
        ASTAdd tf = new ASTAdd();
        tf.setType("notContextAdd");
        int size = codeFragments.size();
        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

    public ASTDelete delete() throws Exception {
        ASTDelete tf = new ASTDelete();
            CodeFragment cfToDelete = null;
                while (cfToDelete == null) {
                 cfToDelete = randomCodeFragmentToReplace();
                    if (cfToDelete.getCtCodeFragment() instanceof CtReturn)
                        cfToDelete = null;
                }
            tf.setPosition(cfToDelete);
        return tf;
    }

//    @Override
//    public ASTTransformation add() throws Exception {
//        return add(true);
//    }
//
//    @Override
//    public ASTTransformation replace() throws Exception {
//        return replace(true);
//    }

    public ASTDelete delete(CodeFragment cfToDelete) throws Exception {
        ASTDelete tf = new ASTDelete();
        tf.setPosition(cfToDelete);
        return tf;
    }

    protected CodeFragment getCodeFragmentReplacedBy(CodeFragment cfToReplace, boolean varNameMatch) throws InstantiationException, IllegalAccessException {
        CodeFragment cfReplacedBy = null;
        if (cfReplacedBy == null) {
            cfReplacedBy = findRandomCodeFragmentCandidate(cfToReplace, varNameMatch);
        }
        return cfReplacedBy;
    }

    protected CodeFragment randomCodeFragmentToReplace() {
        Random r = new Random();
        int size = codeFragments.size();
        CodeFragment stmt = codeFragments.get(r.nextInt(size));

        while (coverageReport.codeFragmentCoverage(stmt) == 0)
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

}
