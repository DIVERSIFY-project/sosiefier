package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.Add;
import fr.inria.diversify.transformation.Delete;
import fr.inria.diversify.transformation.Replace;
import spoon.reflect.code.CtReturn;

import java.util.*;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class TransformationQuery extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;
    protected Class CodeFragmentClass;

    protected List<CodeFragment> cfToTransform;


    public TransformationQuery(ICoverageReport coverageReport, CodeFragmentList codeFragments, Class transformationClass) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        cfToTransform = new ArrayList<CodeFragment>();
        this.CodeFragmentClass = transformationClass;
    }

    public void setCodeFragmentToTransform(CodeFragment stmt) {
        cfToTransform.add(stmt);
    }

    public void setCodeFragmentToTransform(String codeFragmentString) {
        for(CodeFragment cf : getAllUniqueCodeFragments())  {
            if(cf.getCtCodeFragment().toString().equals(codeFragmentString.trim())) {
                cfToTransform.add(cf);
                break;
            }
        }
    }


    protected Replace replace() throws Exception {
        Replace tf = new Replace();
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
            tf.addCodeFragmentToReplace(cfToReplace,cfReplacedBy);
        }
        return tf;
    }

    protected Add add() throws Exception {
        Add tf = new Add();
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
        tf.addCodeFragmentToAdd(cfToReplace,cfReplacedBy);
        }
        return tf;
    }

    protected Delete delete() throws Exception {
        Delete tf = new Delete();
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
            tf.addCodeFragmentToTransform(cfToDelete);
        }
        return tf;
    }


    protected CodeFragment getCodeFragmentReplacedBy(CodeFragment cfToReplace) throws InstantiationException, IllegalAccessException {
        CodeFragment cfReplacedBy = null;
        if (cfReplacedBy == null) {
//             choix d'une strategie de selection
            cfReplacedBy = findRandomCodeFragmentCandidate(cfToReplace);
        }
        return cfReplacedBy;
    }

    protected CodeFragment randomCodeFragmentToReplace(Class stmtType) {
        Random r = new Random();
        int size = getAllCodeFragments().size();
        CodeFragment s = getAllCodeFragments().get(r.nextInt(size));

        while (s.getCodeFragmentType() != stmtType || coverageReport.codeFragmentCoverage(s) == 0)
            s = getAllCodeFragments().get(r.nextInt(size));
        return s;
    }

    protected CodeFragment randomCodeFragmentToReplace() {
        Random r = new Random();
        int size = getAllCodeFragments().size();
        CodeFragment stmt = getAllCodeFragments().get(r.nextInt(size));

        while (coverageReport.codeFragmentCoverage(stmt) == 0)
            stmt = getAllCodeFragments().get(r.nextInt(size));
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
