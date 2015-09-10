package fr.inria.diversify.logger.transformationUsed;

import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 08/09/15
 * Time: 11:20
 */
public class StaticDiffBuilder {
    protected Map<String, SourcePosition> branchPosition;
    Map<String, Set<String>> testsByBranch;


    public void buildDiff(ASTTransformation transformation, Map<String, Set<String>> branchesUsedByTest) {

    }

//    protected Set<String> getAddBranches() {
//
//    }
//
//    protected Set<String> getDeleteBranches() {
//
//    }
//
//    protected Set<String> getAddMethodCall(String branch) {
//
//    }
//
//    protected Set<String> getDeleteMethodCall(String branch) {
//
//    }

    protected Set<String> getBranches(ASTTransformation transformation) {
        Set<String> branches = new HashSet<>();
        if(transformation instanceof ASTDelete) {
            return branches;
        }

        CtElement stmtTrans;
        if(transformation instanceof ASTReplace) {
            stmtTrans = ((ASTReplace) transformation).getTransplant().getCtCodeFragment();
        } else {
            stmtTrans = ((ASTAdd) transformation).getTransplant().getCtCodeFragment();
        }

        int count = 0;
        for(Object object : Query.getElements(stmtTrans, new TypeFilter(CtIf.class))) {
            CtIf ctIf = (CtIf) object;
            branches.add("t" + count);
            count++;
            if (ctIf.getElseStatement() != null) {
                branches.add("e" + count);
                count++;
            }
        }

        for(Object object : Query.getElements(stmtTrans, new TypeFilter(CtLoop.class))) {
            branches.add("l" + count);
            count++;
        }

        for(Object object : Query.getElements(stmtTrans, new TypeFilter(CtCatch.class))) {
            branches.add("c" + count);
            count++;
        }

        if(count == 0) {
            branches.add("b");
        }

        return branches;
    }

}
