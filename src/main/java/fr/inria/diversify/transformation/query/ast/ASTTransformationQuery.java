package fr.inria.diversify.transformation.query.ast;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import spoon.reflect.code.CtReturn;

import java.util.*;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class ASTTransformationQuery extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    protected Class CodeFragmentClass;

    protected List<CodeFragment> cfToTransform;


    public ASTTransformationQuery(ICoverageReport coverageReport, CodeFragmentList codeFragments, Class transformationClass) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        cfToTransform = new ArrayList<CodeFragment>();
        this.CodeFragmentClass = transformationClass;
    }

//    public void setCodeFragmentToTransform(CodeFragment stmt) {
//        cfToTransform.add(stmt);
//    }
//
//    public void setCodeFragmentToTransform(String codeFragmentString) {
//        for(CodeFragment cf : getAllUniqueCodeFragments())  {
//            if(cf.getCtCodeFragment().toString().equals(codeFragmentString.trim())) {
//                cfToTransform.add(cf);
//                break;
//            }
//        }
//    }


    public ASTReplace replace() throws Exception {
        ASTReplace tf = new ASTReplace();
        for(int i = 0; i < nbTransformation; i++) {
            CodeFragment cfToReplace = null;
            CodeFragment cfReplacedBy =null;

            if(cfToTransform.isEmpty()) {
                while (cfReplacedBy == null) {
                    cfToReplace = randomCodeFragmentToReplace();
                    cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
                }
            } else {
                cfToReplace = cfToTransform.get(i);
                cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
            }
            tf.setPosition(cfToReplace);
            tf.setCodeFragmentToReplace(cfReplacedBy);
        }
        return tf;
    }

    public ASTReplace replace(CodeFragment cfToReplace) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
        if(cfReplacedBy == null)
            new Exception("pas de candidat pour "+cfToReplace);
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }

    public ASTReplace veryStupidReplace(CodeFragment cfToReplace) throws Exception {
        Random r = new Random();
        ASTReplace tf = new ASTReplace();
        tf.setType("VeryStupidReplace");
        int size = codeFragments.size();
        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToReplace(cfReplacedBy);
        return tf;
    }

    public ASTAdd add() throws Exception {
        ASTAdd tf = new ASTAdd();
        for(int i = 0; i < nbTransformation; i++) {
            CodeFragment cfToReplace = null;
            CodeFragment cfReplacedBy =null;

            if(cfToTransform.isEmpty()) {
                while (cfReplacedBy == null) {
                    cfToReplace = randomCodeFragmentToReplace();
                    cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
                }
            } else {
                cfToReplace = cfToTransform.get(i);
                cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
            }
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        }
        return tf;
    }

    public ASTAdd add(CodeFragment cfToReplace) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
        if(cfReplacedBy == null)
            new Exception("pas de candidat pour "+cfToReplace);
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

    public ASTAdd veryStupidAdd(CodeFragment cfToReplace) throws Exception {
        Random r = new Random();
        ASTAdd tf = new ASTAdd();
        tf.setType("VeryStupidAdd");
        int size = codeFragments.size();
        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
        tf.setPosition(cfToReplace);
        tf.setCodeFragmentToAdd(cfReplacedBy);
        return tf;
    }

    public ASTDelete delete() throws Exception {
        ASTDelete tf = new ASTDelete();
        for(int i = 0; i < nbTransformation; i++) {
            CodeFragment cfToDelete = null;
            if(cfToTransform.isEmpty()) {
                while (cfToDelete == null) {
                 cfToDelete = randomCodeFragmentToReplace();
                    if (cfToDelete.getCtCodeFragment() instanceof CtReturn)
                        cfToDelete = null;
                }
            } else {

                cfToDelete = cfToTransform.get(i);
            }
            tf.setPosition(cfToDelete);
        }
        return tf;
    }

    public ASTDelete delete(CodeFragment cfToDelete) throws Exception {
        ASTDelete tf = new ASTDelete();
        tf.setPosition(cfToDelete);
        return tf;
    }

    protected CodeFragment getCodeFragmentReplacedBy(CodeFragment cfToReplace) throws InstantiationException, IllegalAccessException {
        CodeFragment cfReplacedBy = null;
        if (cfReplacedBy == null) {
            cfReplacedBy = findRandomCodeFragmentCandidate(cfToReplace);
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

    protected CodeFragment findRandomCodeFragmentCandidate(CodeFragment cf) throws IllegalAccessException, InstantiationException {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment codeFragment : getAllUniqueCodeFragments())
            if (cf.isReplace(codeFragment) && !codeFragment.equalString().equals(cf.equalString())) {
                list.add(codeFragment);
            }

        if (list.isEmpty())
            return null;

        Random r = new Random();
        Object tmp = copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        CodeFragment ret = (CodeFragment)CodeFragmentClass.newInstance();
        ret.init(tmp);
        return ret;
    }

}
