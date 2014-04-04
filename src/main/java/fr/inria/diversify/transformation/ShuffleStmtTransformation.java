package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.VariableVisitor;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 02/04/14.
 */
public class ShuffleStmtTransformation extends SpoonTransformation<CtBlock, CtElement> {
    protected CtBlock newOrder;

    @Override
    public String getLevel() {
        return null;
    }

    @Override
    public String stmtType() {
        return null;
    }

    @Override
    public void addSourceCode() throws Exception {
        logInfo();

        if(newOrder == null)
            buildNewOrder();

        Log.debug("new order\n: {}",newOrder);

        SourcePosition sp = transformationPoint.getStatement(0).getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        if(transformationPoint.getParent() instanceof CtConstructor)
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceStart()), "/**", 0));
        else
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**", 0));


        String stmtsString = (String) newOrder.getStatements().stream()
                .map(stmt -> stmt.toString())
                .collect(Collectors.joining(";\n"));

        sp = transformationPoint.getLastStatement().getPosition();
        compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(
                compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+stmtsString+";\n", 0));
    }


    protected void buildNewOrder() {
        List<CtStatement> newOrderStmt = new ArrayList<>();
        List<CtStatement> stmts = new ArrayList<CtStatement>(transformationPoint.getStatements());
        Set<String> localVar = getLocalVariableName(transformationPoint.getStatements());

        CtStatement ret = stmts.stream()
                .filter(stmt -> stmt instanceof CtReturn)
                .findAny().orElse(null);
        stmts.remove(ret);

        Random r = new Random();
        while (stmts.size() > 0) {
            int randomIndex = r.nextInt(stmts.size());
            CtStatement stmt = stmts.get(randomIndex);
            int index = getStmtIndex(stmt, newOrderStmt, localVar);
            if(index != -1) {
                newOrderStmt.add(index, stmt);
                stmts.remove(randomIndex);
            }
        }

        if(ret != null)
            newOrderStmt.add(ret);

        Factory factory = transformationPoint.getFactory();
        newOrder = factory.Core().createBlock();
        newOrder.setStatements(newOrderStmt);
    }

    protected int getStmtIndex(CtStatement stmt , List<CtStatement> newOrderStmt, Set<String> localVar) {
        VariableVisitor query = new VariableVisitor(false);
        stmt.accept(query);

        Set<String> localVarUsed = query.getLocalVariableReferences().stream()
                .map(var -> var.getDeclaration().getSimpleName())
                .filter(a -> localVar.contains(a))
                .collect(Collectors.toSet());

        List<CtStatement> stmts = new ArrayList<>();

        if(localVarUsed.isEmpty())
            return 0;


        for(int i = 0; i <= newOrderStmt.size(); i++) {
            Set<String> currentLocalVar = getLocalVariableName(stmts);
            if (currentLocalVar.containsAll(localVarUsed))
                return i;

            if(i < newOrderStmt.size())
                stmts.add(newOrderStmt.get(i));
        }

        return -1;
    }

    protected Set<String> getLocalVariableName(List<CtStatement> stmts) {
        return stmts.stream()
                .filter(stmt -> stmt instanceof CtLocalVariable)
                .map(var -> ((CtLocalVariable)var).getSimpleName())
                .collect(Collectors.toSet());

    }
}
