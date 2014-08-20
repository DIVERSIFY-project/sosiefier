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
 * AST transform to perform a replace
 * <p>
 * User: Simon
 * Date: 7/11/13
 * Time: 4:42 PM
 */
public class ASTReplace extends ASTTransformation {

    /**
     * Transplant code fragment, i.e. the code that is going to be inserted
     */
    private CodeFragment transplant;

    /**
     * Map to perform variable mapping. See article:
     */
    protected Map<String, String> variableMapping;

    /**
     * Transplant code fragment, i.e. the code that is going to be inserted
     */
    public CodeFragment getTransplant() {
        return transplant;
    }

    public void setTransplant(CodeFragment transplant) {
        this.transplant = transplant;
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }

    public ASTReplace() {
        name = "replace";
        type = "adrStmt";
    }


    @Override
    public void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(transplantationPoint);

        Log.debug("transformation: {}, {}", type, name);
        Log.debug("transplantation point:\n{}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());
        Log.debug("{}", transplantationPoint.getCodeFragmentType());
        Log.debug("replace by: ({})\n{}", transplant.getCodeFragmentType(), transplant);

        if (withVarMapping()) {
            if (variableMapping == null)
                variableMapping = transplantationPoint.randomVariableMapping(getTransplant());

            Log.debug("random variable mapping: {}", variableMapping);
            getTransplant().replaceVar(transplantationPoint, variableMapping);
            if (getTransplant().equals(transplantationPoint.codeFragmentString()))
                throw new Exception("same statment");
        }
        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = transplantationPoint.getCtCodeFragment().getPosition();


        if (DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor")) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/** replace \n", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n" +
                    getTransplant().codeFragmentString() + "\n", 0));
        } else {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/** replace\n", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 1, " **/\n" +
                    getTransplant().codeFragmentString(), 0));
        }
    }

    protected boolean withVarMapping() {
        //todo a remplacer par un attribut
        return name.equals("replace");
    }



    public int hashCode() {
        return super.hashCode() * getTransplant().getCompilationUnit().hashCode() *
                getTransplant().getStartLine() * transplantationPoint.getCompilationUnit().hashCode() * transplantationPoint.getStartLine();
    }

    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (!this.getClass().isAssignableFrom(other.getClass()))
            return false;
        ASTReplace otherReplace = (ASTReplace) other;

        if (!equalParent(otherReplace.parent))
            return false;

        return status == otherReplace.status &&
                failures.equals(otherReplace.failures) &&
                (variableMapping == null || variableMapping.equals(otherReplace.variableMapping)) &&
                transplantationPoint.getCtCodeFragment().getPosition().equals(otherReplace.transplantationPoint.getCtCodeFragment().getPosition()) &&
                getTransplant().getCtCodeFragment().getPosition().equals(otherReplace.getTransplant().getCtCodeFragment().getPosition());
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("transplantationPoint", transplantationPoint.toJSONObject());
        object.put("transplant", getTransplant().toJSONObject());
        object.put("variableMapping", variableMapping);

        return object;
    }

    @Override
    public String toString() {
        String ret = new String();

        ret = ret + "transplantationPoint: " + transplantationPoint.toString() + "\n" +
                type + ": " + getTransplant().toString() + "\n" +
                "varMapping: " + variableMapping + "\n";

        return ret;
    }

    public void setType(String type) {
        this.type = type;
    }


}
