package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.ast.ASTReplace;
import spoon.reflect.code.*;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Simon on 22/08/14.
 */
public class CheckReturn extends ADRTransformationQuery {
    protected List<CodeFragment> returns;
    protected List<CodeFragment> checks;

    public CheckReturn(InputProgram inputProgram) {
        super(inputProgram);
        initReturn();
        initCheck();
    }

    protected void initReturn() {
        returns = new ArrayList<>();

        for (CodeFragment cf : getInputProgram().getCodeFragments()) {
            if (isReturnVariable(cf.getCtCodeFragment())) {
                returns.add(cf);
            }
        }
    }

    protected void initCheck() {
        checks = new ArrayList<>();

        for (CodeFragment cf : getAllUniqueCodeFragments()) {
            try {
                CtCodeElement stmt = cf.getCtCodeFragment();
                if (stmt instanceof CtIf) {
                    CtIf ifStmt = (CtIf) stmt;
                    if (ifStmt.getElseStatement() == null) {
                        CtBlock block = ifStmt.getThenStatement();
                        if (block.getStatements().size() == 1) {
                            CtStatement thenStmt = block.getStatement(0);
                            if (isReturnVariable(thenStmt)) {
                                checks.add(cf);
                            }
                        }
                    } else {
                        CtBlock thenBlock = ifStmt.getThenStatement();
                        CtBlock elseBlock = ifStmt.getThenStatement();
                        if (thenBlock.getStatements().size() == 1 && elseBlock.getStatements().size() == 1) {
                            CtStatement thenStmt = thenBlock.getStatement(0);
                            CtStatement elseStmt = elseBlock.getStatement(0);
                            if ((isReturnVariable(thenStmt) && isThrowStatement(elseStmt)) || (isReturnVariable(elseStmt) && isThrowStatement(thenStmt)))
                                checks.add(cf);
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    protected boolean isReturnVariable(CtCodeElement stmt) {
        if (stmt instanceof CtReturn) {
            CtReturn ret = (CtReturn) stmt;
            if (ret.getReturnedExpression() instanceof CtVariableReference ||
                    ret.getReturnedExpression() instanceof CtVariableAccess) {
                return true;
            }
        }
        return false;
    }

    protected boolean isThrowStatement(CtCodeElement stmt) {
        return stmt instanceof CtThrow;
    }

    protected ASTReplace transformation() throws Exception {
        ASTReplace tf = new ASTReplace();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomReturnToReplace(true);
            transplant = findRandomCheck(transplantationPoint, false);
        }
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        return tf;
    }


    /**
     * Find code fragments to replace, i.e, transplantation points
     *
     * @param withCoverage Indicates if the transplantation points must have coverage by the test suite.
     * @return
     */
    protected CodeFragment findRandomReturnToReplace(boolean withCoverage) {
        Random r = new Random();
        int size = returns.size();
        CodeFragment stmt = returns.get(r.nextInt(size));

        while (withCoverage && getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) == 0)
            stmt = returns.get(r.nextInt(size));
        return stmt;
    }

    protected CodeFragment findRandomCheck(CodeFragment cf,
                                           boolean varNameMatch) throws IllegalAccessException, InstantiationException {
        List<CodeFragment> list = checks.stream()
                .filter(codeFragment -> cf.isReplaceableBy(codeFragment, varNameMatch, subType))
                .collect(Collectors.toList());

        if (list.isEmpty())
            return null;

        Random r = new Random();
        CtCodeElement tmp = (CtCodeElement) copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        CodeFragment ret = new Statement();
        ret.init(tmp);
        return ret;
    }


    public long nbOfTransformation(boolean varNameMatch) {
        long nb = 0;
        for (CodeFragment transplant : returns) {
            List<CodeFragment> list = new ArrayList();
            for (CodeFragment check : checks)
                if (transplant.isReplaceableBy(check, varNameMatch, subType) && transplant.getCtCodeFragment().getParent(CtIf.class) != check) {
                    list.add(check);
                }
            nb = nb + list.size();

        }
        return nb;
    }
}
