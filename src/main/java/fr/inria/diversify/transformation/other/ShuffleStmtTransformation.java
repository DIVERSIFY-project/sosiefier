package fr.inria.diversify.transformation.other;

import fr.inria.diversify.codeFragment.VariableVisitor;
import fr.inria.diversify.transformation.SpoonTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 02/04/14.
 */
public class ShuffleStmtTransformation extends SpoonTransformation<CtBlock, CtElement> {
    List<CtStatement> newOrderStmt;


    public ShuffleStmtTransformation() {
        name = "shuffleStmt";
        type = "foo";
    }

    @Override
    public void addSourceCode() throws Exception {
        logInfo();

        if(newOrderStmt == null)
            buildNewOrder();



        SourcePosition sp = transformationPoint.getStatement(0).getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        if(transformationPoint.getParent() instanceof CtConstructor)
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceStart()), "/**", 0));
        else
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**", 0));


        String stmtsString = newOrderStmt.stream()
                .map(stmt -> stmt.toString())
                .collect(Collectors.joining(";\n")).toString();

        Log.debug("new order\n: {}",stmtsString);

        sp = transformationPoint.getLastStatement().getPosition();
        compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(
                compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+stmtsString+";\n", 0));
    }


    public void buildNewOrder() {
        newOrderStmt = new ArrayList<>();
        List<CtStatement> stmts = new ArrayList<CtStatement>(transformationPoint.getStatements());
        Set<String> localVar = getLocalVariableName(transformationPoint.getStatements());

        CtStatement ret = stmts.stream()
                .filter(stmt -> stmt instanceof CtReturn)
                .findAny().orElse(null);
        stmts.remove(ret);

        CtStatement superStmt = stmts.stream()
                .filter(stmt -> stmt instanceof CtSuperAccess)
                .findAny().orElse(null);
        stmts.remove(superStmt);

        if(superStmt != null)
            newOrderStmt.add(superStmt);

        Random r = new Random();
        while (stmts.size() > 0) {
            int randomIndex = r.nextInt(stmts.size());
            CtStatement stmt = stmts.get(randomIndex);
            int index = getStmtIndex(stmt, localVar);
            if(index != -1) {
                newOrderStmt.add(index, stmt);
                stmts.remove(randomIndex);
            }
        }

        if(ret != null)
            newOrderStmt.add(ret);
    }

    protected int getStmtIndex(CtStatement stmt , Set<String> localVar) {
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

    public int[] newOrderIndex() {
        int size = newOrderStmt.size();
        int[] newOrderIndex = new int[size];

        for(int i = 0; i < size; i++) {
            int index = 0;
            for(Object stmt : transformationPoint.getStatements()) {
                if(newOrderStmt.get(i).toString().equals(stmt.toString())){
                    newOrderIndex[i] = index;
                    break;
                }
                index++;
            }
        }
        return newOrderIndex;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();
        object.put("newStmtOrder", Arrays.toString(newOrderIndex()));
        return object;
    }
}
