package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;

import java.util.Map;

/**
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
                variableMapping = transplantationPoint.randomVariableMapping(transplant);

            Log.debug("random variable mapping: {}",variableMapping);
            transplant.replaceVar(transplantationPoint, variableMapping);
        }
        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = transplantationPoint.getCtCodeFragment().getPosition();

        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());//sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, codeFragmentString(transplantationPoint), 0));
        Log.debug("----------\n---------");
        Log.debug("{}",originalClass.getQualifiedName());
    }

    protected boolean withVarMapping() {
        return name.equals("add");
    }

    protected String codeFragmentString(CodeFragment cf) {
        String cFS = transplant.codeFragmentString();
//        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
//            return cFS+";";
//        else
            return cFS;
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }



    public boolean setCodeFragmentToAdd(CodeFragment add) {
        this.transplant = add;
        return true;
    }

    public  int hashCode() {
        return 1;
    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ASTAdd otherASTAdd = (ASTAdd)other;

        if(!((parent == null && parent.equals(otherASTAdd.parent))
                || (otherASTAdd.parent == null && otherASTAdd.parent.equals(parent))))
            return false;

        return status == otherASTAdd.status &&
                name.equals(otherASTAdd.name) &&
                failures.equals(otherASTAdd.failures) &&
                (variableMapping == null || variableMapping.equals(otherASTAdd.variableMapping)) &&
                transplantationPoint.equals(otherASTAdd.transplantationPoint) &&
                transplant.equals(otherASTAdd.transplant);
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
}
