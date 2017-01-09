package fr.inria.diversify;

import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.runner.InputProgram;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 07/07/16
 * Time: 11:27
 */
public class Utils {

    public static Map<CtStatement, CtExecutable> statementToParentMethod(InputProgram inputProgram) {
        Map<CtStatement, CtExecutable> map = new HashMap<>();

        inputProgram.getAllElement(CtStatement.class).stream()
                .filter(stmt -> stmt.getParent(CtExecutable.class) != null)
                .filter(stmt -> stmt.getParent() instanceof CtBlock)
                .filter(stmt -> !(stmt.toString().startsWith("this(") || stmt.toString().startsWith("super(")))
                .forEach(stmt -> map.put((CtStatement)stmt, stmt.getParent(CtExecutable.class)));

        return map;
    }


    public static Map<CtStatement, String> statementToBranch(InputProgram inputProgram) {
        Map<CtStatement, String> branch = new HashMap<>();
        List<CtExecutable> mths = inputProgram.getAllElement(CtExecutable.class);
        mths.stream()
                .forEach(mth -> branch.putAll(statementToBranch(mth)));

        return branch;
    }

    protected static Map<CtStatement, String> statementToBranch(CtExecutable method) {
        Map<CtStatement, String> branch = new HashMap<>();
        Map<CtStatement, String> blockBranch = new HashMap<>();

        blockBranch.put(method.getBody(),"b");

        int count = 0;
        for(Object object : Query.getElements(method, new TypeFilter(CtIf.class))) {
            CtIf ctIf = (CtIf) object;
            blockBranch.put(ctIf.getThenStatement(), "t" + count++);

            if (ctIf.getElseStatement() != null) {
                blockBranch.put(ctIf.getElseStatement(), "e" + count++);
            } else {
                count++;
            }
        }

        count = 0;
        for(Object object : Query.getElements(method, new TypeFilter(CtCase.class))) {
            CtCase ctCase = (CtCase) object;
            blockBranch.put(ctCase.getStatements().get(0), "s" + count++);
        }

        count = 0;
        for(Object object : Query.getElements(method, new TypeFilter(CtLoop.class))) {
            CtLoop ctLoop = (CtLoop) object;
            blockBranch.put( ctLoop.getBody(), "l" + count++);
        }

        count = 0;
        for(Object object : Query.getElements(method, new TypeFilter(CtCatch.class))) {
            CtCatch ctCatch = (CtCatch) object;
            blockBranch.put( ctCatch.getBody(), "c" + count++);
        }

        for(Object object : Query.getElements(method, new TypeFilter(CtTry.class))) {
            CtTry ctTry = (CtTry) object;
            blockBranch.put( ctTry.getBody(), blockBranch.get(ctTry.getParent()));
        }
        try {
            String methodString = ProcessorUtil.methodString(method);

            List<CtStatement> statements = Query.getElements(method, new TypeFilter(CtStatement.class));
            statements.stream()
                    .filter(stmt -> stmt.getParent(CtExecutable.class) != null)
                    .filter(stmt -> stmt.getParent() instanceof CtBlock)
                    .filter(stmt -> !(stmt.toString().startsWith("this(") || stmt.toString().startsWith("super(")))
                    .forEach(stmt -> branch.put(stmt, methodString + "." + blockBranch.get(stmt.getParent())));

        } catch (Exception e) {}
        return branch;
    }
}
