package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;

import java.util.Map;

/**
 *
 * User: Simon
 * Date: 7/11/13
 * Time: 4:42 PM
 */
public class ASTReplace extends ASTTransformation {

    protected CodeFragment replace;
    protected Map<String, String> variableMapping;


    public ASTReplace() {
        name = "replace";
        type = "adrStmt";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("codeFragmentPosition", position.toJSONObject());
        object.put("codeFragmentReplace", replace.toJSONObject());
        object.put("variableMapping", variableMapping);
        object.put("failures", failures);
        object.put("status", status);

        return object;
    }

    @Override
    protected void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        Log.debug("{} transformation",type);
        Log.debug("position:\n{}",position);
        Log.debug("{}",position.getCtCodeFragment().getPosition());
        Log.debug("{}",position.getCodeFragmentType());
        Log.debug("replace by: ({})\n{}",replace.getCodeFragmentType(), replace);

        if(withVarMapping()) {
            if(variableMapping == null) {
                variableMapping = position.randomVariableMapping(replace);
            }


            Log.debug("random variable mapping: {}", variableMapping);
            replace.replaceVar(position, variableMapping);
            if(replace.equals(position.codeFragmentString()))
                throw new Exception("same statment");
        }
        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();



        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor")) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+
                replace.codeFragmentString()+"\n", 0));
        }
        else {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** ", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    codeFragmentString(position), 0));
        }
    }

    protected boolean withVarMapping() {
        //todo a remplacer par un attribut
        return type.equals("replace");
    }

    protected String codeFragmentString(CodeFragment cf) {
        String cFS = replace.codeFragmentString();
//        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
//            return cFS+";";
//        else
            return cFS;
    }

    public boolean setCodeFragmentToReplace(CodeFragment replace) {
        this.replace = replace;
        return true;
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }

    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ASTReplace otherReplace = (ASTReplace)other;

        return type.equals(otherReplace.type) && failures == otherReplace.failures &&
                (variableMapping == null || variableMapping.equals(otherReplace.variableMapping)) &&
                position.equals(otherReplace.position) &&
                replace.equals(otherReplace.replace);
    }
    @Override
    public String toString() {
        String ret = new String();

            ret = ret + "position: "+position.toString()+"\n" +
                    type +": "+ replace.toString()+"\n"+
                    "varMapping: "+variableMapping+"\n";

        return ret;
    }

    public void setType(String type) {
        this.type = type;
    }
}
