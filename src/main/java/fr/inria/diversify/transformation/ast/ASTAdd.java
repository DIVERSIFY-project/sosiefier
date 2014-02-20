package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtSimpleType;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;

/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:33 PM
 */
public class ASTAdd extends ASTTransformation {
    protected CodeFragment add;
    protected Map<String, String> variableMapping;


    public ASTAdd() {
        name = "add";
        type = "adrStmt";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("codeFragmentPosition", position.toJSONObject());
        object.put("codeFragmentAdd", add.toJSONObject());
        object.put("variableMapping", variableMapping);
        object.put("failures", failures);
        object.put("status", status);

        return object;
    }

    protected void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        Log.debug("{} transformation",type);
        Log.debug("cfToAdd:\n {}", add);
        Log.debug("---------------------\npostion:\n{}",position);
        Log.debug("{}",position.getCtCodeFragment().getPosition());

        if(withVarMapping()) {
            if(variableMapping == null)
                variableMapping = position.randomVariableMapping(add);

            Log.debug("random variable mapping: {}",variableMapping);
            add.replaceVar(position, variableMapping);
        }
        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();

        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());//sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, codeFragmentString(position), 0));
        Log.debug("----------\n---------");
        Log.debug("{}",originalClass.getQualifiedName());
    }

    protected boolean withVarMapping() {
        return type.equals("add");
    }

    protected String codeFragmentString(CodeFragment cf) {
        String cFS = add.codeFragmentString();
//        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
//            return cFS+";";
//        else
            return cFS;
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }



    public boolean setCodeFragmentToAdd(CodeFragment add) {
        this.add = add;
        return true;
    }

    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ASTAdd otherASTAdd = (ASTAdd)other;

        return type.equals(otherASTAdd.type) &&
                failures == otherASTAdd.failures &&
                (variableMapping == null || variableMapping.equals(otherASTAdd.variableMapping)) &&
                position.equals(otherASTAdd.position) &&
                add.equals(otherASTAdd.add);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String ret = new String();

        ret = ret + "position: "+position.toString()+"\n" +
                "varMapping: "+variableMapping+"\n";

        return ret;
    }
}
