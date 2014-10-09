package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.InputContext;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtVariableReference;

import java.util.Map;

/**
 * Transformation that adds AST nodes
 *
 * User: Simon
 * Date: 7/11/13
 * Time: 4:33 PM
 */
public class ASTAdd extends ASTTransformation {
    protected CodeFragment transplant;
    protected Map<String, String> variableMapping;


    public ASTAdd() {
        name = "add";
        type = "adrStmt";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("transplantationPoint", transplantationPoint.toJSONObject());
        object.put("transplant", transplant.toJSONObject());
        object.put("variableMapping", variableMapping);

        return object;
    }

    public void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(transplantationPoint);

        Log.debug("transformation: {}, {}",type,name);
        Log.debug("transplant:\n {}", transplant);
        Log.debug("---------------------\ntransplantation point:\n{}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());

        if(withVarMapping()) {
            if(variableMapping == null)
                variableMapping = transplantationPoint.randomVariableMapping(transplant, subType);

            Log.debug("random variable mapping: {}",variableMapping);
            transplant.replaceVar(transplantationPoint, variableMapping);
        }
        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = transplantationPoint.getCtCodeFragment().getPosition();

        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        sourceCodeFragments.add(new SourceCodeFragment(index, transplant.codeFragmentString(), 0));
        compileUnit.addSourceCodeFragment(sourceCodeFragments.get(0));
        Log.debug("----------\n---------");
        Log.debug("{}",originalClass.getQualifiedName());
    }

    protected boolean withVarMapping() {
        return name.equals("add");
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }

    public void setTransplant(CodeFragment add) {
        this.transplant = add;
    }

    public  int hashCode() {
        return super.hashCode() * transplant.getCompilationUnit().hashCode() *
                transplant.getStartLine() * transplantationPoint.getCompilationUnit().hashCode() * transplantationPoint.getStartLine();
    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ASTAdd otherASTAdd = (ASTAdd)other;

        if(!equalParent(otherASTAdd.parent))
            return false;

        return status == otherASTAdd.status &&
                name.equals(otherASTAdd.name) &&
                failures.equals(otherASTAdd.failures) &&
                (variableMapping == null || variableMapping.equals(otherASTAdd.variableMapping)) &&
                transplantationPoint.getCtCodeFragment().equals(otherASTAdd.transplantationPoint.getCtCodeFragment()) &&
                transplant.getCtCodeFragment().getPosition().equals(otherASTAdd.transplant.getCtCodeFragment().getPosition());
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String ret = new String();

        ret = ret + "transplantationPoint: "+ transplantationPoint.toString()+"\n" +
                "varMapping: "+variableMapping+"\n";

        return ret;
    }

    public CodeFragment getTransplant() {
        return transplant;
    }

    public boolean usedOfSubType() {
        InputContext tpInputContext = transplant.getContext().getInputContext();
        InputContext tInputContext = transplantationPoint.getContext().getInputContext();
        for(Map.Entry<String, String> var : variableMapping.entrySet()) {
            CtVariableReference variable = tpInputContext.getVariableOrFieldNamed(var.getKey());
            CtVariableReference candidate = tInputContext.getVariableOrFieldNamed(var.getValue());

            if(!variable.getType().equals(candidate.getType())) {
                return true;
            }
        }
        return false;
    }
}
