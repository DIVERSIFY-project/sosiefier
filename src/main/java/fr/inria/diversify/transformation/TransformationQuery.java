package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.runtest.ICoverageReport;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;

import java.util.*;

/**
 * User: Simon
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class TransformationQuery {
    protected ICoverageReport coverageReport;
    protected CodeFragmentList codeFragments;


    public TransformationQuery(ICoverageReport coverageReport, CodeFragmentList codeFragments) {
        this.coverageReport = coverageReport;
        this.codeFragments = codeFragments;
    }
//    public void setCodeFragmentToReplace(CodeFragment stmt) {
//        cfToReplace = stmt;
//    }

//
//    protected CodeFragment getCodeFragmentToReplace() {
//        if (cfToReplace == null) {
////             choix d'une strategie de selection
//            cfToReplace = randomCodeFragmentToReplace();
//        }
//        return cfToReplace;
//    }
//
//    protected CodeFragment getCodeFragmentReplacedBy() {
//        if (cfReplacedBy == null) {
////             choix d'une strategie de selection
//            cfReplacedBy = findRandomCandidateStatement(cfToReplace);
//        }
//        return cfReplacedBy;
//    }

    public Replace randomReplace() throws Exception {
        Replace tf = new Replace();
        CodeFragment cfToReplace = null;
        CodeFragment cfReplacedBy =null;

        while (cfReplacedBy == null) {
            cfToReplace = randomCodeFragmentToReplace();
            cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
        }
        tf.setStatementToReplace(cfToReplace);
        tf.setStatementReplacedBy(cfReplacedBy);


        return tf;
    }

    public Add randomAdd() throws Exception {
        Add tf = new Add();
        CodeFragment cfToReplace = null;
        CodeFragment cfReplacedBy =null;

        while (cfReplacedBy == null) {
            cfToReplace = randomCodeFragmentToReplace();
            cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);
        }
        tf.setStatementToReplace(cfToReplace);
        tf.setStatementToAdd(cfReplacedBy);


        return tf;
    }

    public Delete randomDelete() throws Exception {
        Delete tf = new Delete();
        CodeFragment cfToReplace = randomCodeFragmentToReplace();
        tf.setCodeFragmentToDelete(cfToReplace);

        return tf;
    }

    public Replace randomReplace(String codeFragmentString) throws Exception {
        Replace tf = new Replace();
        CodeFragment cfToReplace = null;
        CodeFragment cfReplacedBy =null;


            cfToReplace = findCodeFragmentToReplace(codeFragmentString.trim());
            cfReplacedBy = getCodeFragmentReplacedBy(cfToReplace);

        tf.setStatementToReplace(cfToReplace);
        tf.setStatementReplacedBy(cfReplacedBy);


        return tf;
    }

    private CodeFragment findCodeFragmentToReplace(String codeFragmentString) {
        CodeFragment codeFragment = null;
        for(CodeFragment cf : getAllUniqueCodeFragments())  {
//            System.out.println(cf.getCtCodeFragment().toString().trim()+" || "+codeFragmentString);
            if(cf.getCtCodeFragment().toString().equals(codeFragmentString.trim())) {
                codeFragment = cf;
                break;
            }
        }
        return codeFragment;
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

    protected CodeFragment findCodeFragment(String stmtString) {
        CodeFragment s = null;
        for (CodeFragment stmt : getAllCodeFragments())
            if (stmt.codeFragmentString().equals(stmtString))
                s = stmt;
        return s;
    }

    protected Statement findRandomCandidateStatement(CodeFragment stmt) {
        System.out.println(stmt.getContext().equalString());
        System.out.println(stmt.codeFragmentString());
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : getAllUniqueCodeFragments())
            if (stmt.isReplace(statement) && !statement.equalString().equals(stmt.equalString())) {
                System.out.println(statement.getContext().equalString());
                System.out.println(statement.codeFragmentString());

                list.add(statement);
            }

        if (list.isEmpty())
            return null;

        Random r = new Random();
        CtStatement tmp = (CtStatement) copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        return new Statement(tmp);
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    protected List<CodeFragment> getAllCodeFragments() {
        return codeFragments.getCodeFragments();
    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return codeFragments.getUniqueCodeFragmentList();
    }

}
