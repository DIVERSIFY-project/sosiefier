package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.runtest.ICoverageReport;
import fr.inria.diversify.transformation.Add;
import fr.inria.diversify.transformation.Delete;
import fr.inria.diversify.transformation.Replace;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;

import java.util.*;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class TransformationQuery extends AbstractTransformationQuery {
    protected ICoverageReport coverageReport;

    protected List<CodeFragment> cfToTransform;


    public TransformationQuery(ICoverageReport coverageReport, CodeFragmentList codeFragments) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
        cfToTransform = new ArrayList<CodeFragment>();
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


    protected CodeFragment getCodeFragmentReplacedBy(CodeFragment cfToReplace) {
        Statement cfReplacedBy = null;
        if (cfReplacedBy == null) {
//             choix d'une strategie de selection
            cfReplacedBy = findRandomCandidateStatement(cfToReplace);
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


    protected Statement findRandomCandidateStatement(CodeFragment stmt) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : getAllUniqueCodeFragments())
            if (stmt.isReplace(statement) && !statement.equalString().equals(stmt.equalString())) {
                list.add(statement);
            }

        if (list.isEmpty())
            return null;

        Random r = new Random();
        CtStatement tmp = (CtStatement) copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        return new Statement(tmp);
    }

}
