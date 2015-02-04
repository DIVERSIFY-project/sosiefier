package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;
import spoon.SpoonException;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtAssignmentImpl;

import javax.sql.rowset.serial.SerialRef;
import java.util.*;

/**
 * Created by aelie on 03/02/15.
 */
public class SubClassReplaceQuery extends TransformationQuery {
    protected List<CodeFragment> instantiationStatementList;
    protected Map<CtTypeReference, List<CtTypeReference>> subclassesBySuperclass;

    public SubClassReplaceQuery(InputProgram inputProgram) {
        super(inputProgram);
        initFindInstantiationStatements();
        initFindSubclasses();
    }

    protected void initFindInstantiationStatements() {
        instantiationStatementList = new ArrayList<>();
        for (CodeFragment codeFragment : getInputProgram().getCodeFragments()) {
            if (isInstantiation(codeFragment.getCtCodeFragment())) {
                instantiationStatementList.add(codeFragment);
            }
        }
    }

    protected void initFindSubclasses() {
        subclassesBySuperclass = new HashMap<>();
        for (CodeFragment codeFragment : getInputProgram().getCodeFragments()) {
            if (isDeclaration(codeFragment.getCtCodeFragment())) {
                try {
                    CtTypeReference superclass = ((CtVariable) codeFragment.getCtCodeFragment()).getType().getSuperclass();
                    if (!subclassesBySuperclass.containsKey(superclass)) {
                        subclassesBySuperclass.put(superclass, new ArrayList<>());
                    }
                    subclassesBySuperclass.get(superclass).add(((CtVariable) codeFragment.getCtCodeFragment()).getType());
                } catch (SpoonException se) {
                    System.err.println("Failed somewhere with " + codeFragment.getCtCodeFragment().toString());
                }
            }
        }
    }

    protected boolean isDeclaration(CtCodeElement codeElement) {
        if (codeElement instanceof CtVariable) {
            return true;
        }
        return false;
    }

    protected boolean isInstantiation(CtCodeElement codeElement) {
        if (codeElement instanceof CtAssignmentImpl) {
            if (((CtAssignmentImpl) codeElement).getAssignment() instanceof CtNewClass) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setType(String type) {
        //done
    }

    @Override
    public Transformation query() throws QueryException {
        Transformation result;
        Random random = new Random();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = instantiationStatementList.get(random.nextInt(instantiationStatementList.size() - 1));
        CtClass instantiatedClass = ((CtNewClass) ((CtAssignmentImpl) transplantationPoint.getCtCodeFragment()).getAssignment()).getAnonymousClass();
        CtTypeReference superClass = instantiatedClass.getSuperclass();

        result = new CheckReturnTransformation(transplantationPoint, transplant);
        result.setInputProgram(getInputProgram());
        return result;
        /*Transformation result;
        Random random = new Random();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = null;
        Collections.shuffle(ifStatementList, random);
        int counter = ifStatementList.size();
        while(transplant == null && counter-- > 0) {
            transplantationPoint = returnStatementList.get(random.nextInt(returnStatementList.size() - 1));
            for (CodeFragment ifCodeFragment : ifStatementList) {
                if (transplantationPoint.getContext().getInputContext().containsAll(ifCodeFragment.getInputContext(), true)) {
                    transplant = ifCodeFragment;
                }
            }
        }
        result = new CheckReturnTransformation(transplantationPoint, transplant);
        result.setInputProgram(getInputProgram());

        return result;*/
    }

    protected CodeFragment findRandomReturnToReplace(boolean withCoverage) {
        /*Random r = new Random();
        int size = returnStatementList.size();
        CodeFragment stmt = returnStatementList.get(r.nextInt(size));

        while (withCoverage && getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) == 0)
            stmt = returnStatementList.get(r.nextInt(size));
        return stmt;*/
        return null;
    }
}
