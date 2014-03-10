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
    protected CodeFragment transplant;
    protected Map<String, String> variableMapping;


    public ASTReplace() {
        name = "replace";
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

    @Override
    public void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(transplantationPoint);

        Log.debug("transformation: {}, {}",type,name);
        Log.debug("transplantation point:\n{}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());
        Log.debug("{}", transplantationPoint.getCodeFragmentType());
        Log.debug("replace by: ({})\n{}", transplant.getCodeFragmentType(), transplant);

        if(withVarMapping()) {
            if(variableMapping == null)
                variableMapping = transplantationPoint.randomVariableMapping(transplant);

            Log.debug("random variable mapping: {}", variableMapping);
            transplant.replaceVar(transplantationPoint, variableMapping);
            if(transplant.equals(transplantationPoint.codeFragmentString()))
                throw new Exception("same statment");
        }
        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = transplantationPoint.getCtCodeFragment().getPosition();



        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor")) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+
                transplant.codeFragmentString()+"\n", 0));
        }
        else {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** ", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    codeFragmentString(transplantationPoint), 0));
        }
    }

    protected boolean withVarMapping() {
        //todo a remplacer par un attribut
        return name.equals("replace");
    }

    protected String codeFragmentString(CodeFragment cf) {
        String cFS = transplant.codeFragmentString();
//        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
//            return cFS+";";
//        else
            return cFS;
    }

    public boolean setCodeFragmentToReplace(CodeFragment replace) {
        this.transplant = replace;
        return true;
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }

    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ASTReplace otherReplace = (ASTReplace)other;

        if(!((parent == null && parent.equals(otherReplace.parent))
                || (otherReplace.parent == null && otherReplace.parent.equals(parent))))
            return false;

        return status == otherReplace.status &&
                failures.equals(otherReplace.failures) &&
                (variableMapping == null || variableMapping.equals(otherReplace.variableMapping)) &&
                transplantationPoint.equals(otherReplace.transplantationPoint) &&
                transplant.equals(otherReplace.transplant);
    }
    @Override
    public String toString() {
        String ret = new String();

            ret = ret + "transplantationPoint: "+ transplantationPoint.toString()+"\n" +
                    type +": "+ transplant.toString()+"\n"+
                    "varMapping: "+variableMapping+"\n";

        return ret;
    }

    public void setType(String type) {
        this.type = type;
    }
}
