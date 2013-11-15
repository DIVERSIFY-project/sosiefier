package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * User: Simon
 * Date: 7/11/13
 * Time: 4:42 PM
 */
public class ASTReplace extends ASTTransformation {

    protected String type = "replace";

    protected CodeFragment replace;
    protected Map<String, String> variableMapping;


    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        JSONArray array = new JSONArray();
        object.put("transformation",array);

            JSONObject t = new JSONObject();
            t.put("CodeFragmentPosition", position.toJSONObject());
            t.put("CodeFragmentReplace", replace.toJSONObject());
            t.put("VariableMapping", variableMapping);
            array.put(t);

        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        JSONArray Jparents = new JSONArray();
        object.put("parents",Jparents);
        for(ASTTransformation parent : parents) {
            Jparents.put(parent.toJSONObject());
        }

        return object;
    }

    @Override
    protected void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        Log.debug("{} transformation",type);
        Log.debug("position:\n{}",position);
        Log.debug("{}",position.getCtCodeFragment().getPosition());
        Log.debug("{}",position.getCodeFragmentType());
        Log.debug("replace by:\n{}", replace);

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
        return type.equals("replace");
    }

    protected String codeFragmentString(CodeFragment cf) {
        String cFS = replace.codeFragmentString();
//        if(DiversifyProperties.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
//            return cFS+";";
//        else
            return cFS;
    }

    @Override
    public ASTReplace toReplace() throws Exception {
        return this;
    }

    @Override
    public ASTAdd toAdd() throws Exception {
//        ASTAdd a = new ASTAdd();
//        for (CodeFragment cf : position)
//            a.addCodeFragmentToAdd(cf,replaces.get(cf));
//        return a;
        throw new Exception();
    }

    @Override
    public ASTDelete toDelete() throws Exception {
//        ASTDelete delete = new ASTDelete();
//        for(CodeFragment codeFragment : position) {
//            delete.addCodeFragmentToTransform(codeFragment);
//        }
//        return delete;
        throw new Exception();
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
                variableMapping.equals(otherReplace.variableMapping) &&
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

    public String getType(){
        return type;
    }

    @Override
    public void writeHead(BufferedWriter sb, char separator) throws IOException {
        sb.append("toReplaceType" + separator + "replacedByType" + separator +
                "toReplaceSize" + separator + "replacedBySize" + separator +
                "toReplaceClass" + separator + "replacedByClass" + separator +
                "toReplacePackage" + separator + "replacedByPackage" + separator +
                "toReplaceInputContextSize" + separator + "replacedByInputContextSize" + separator +
                "toReplaceInputContextOnlyPrimitive" + separator + "replacedByInputContextOnlyPrimitive" + separator +
                "failure" + separator +
                "toReplaceSuperType" +separator + "replacedBySuperType");
    }

    //works only for 1replace
    public void write(StringBuffer sb, char separator) {
        CodeFragment t = position;
        CodeFragment r = replace;

        sb.append(t.getCodeFragmentType().getSimpleName());
        sb.append(separator);
        sb.append(r.getCodeFragmentType().getSimpleName());
        sb.append(separator);

        sb.append(t.getCtCodeFragment().toString().length()+"");
        sb.append(separator);
        sb.append(r.getCtCodeFragment().toString().length()+"");
        sb.append(separator);

        sb.append(t.getSourceClass().getQualifiedName());
        sb.append(separator);
        sb.append(r.getSourceClass().getQualifiedName());
        sb.append(separator);

        sb.append(t.getSourcePackage().getQualifiedName());
        sb.append(separator);
        sb.append(r.getSourcePackage().getQualifiedName());
        sb.append(separator);

        sb.append(t.getInputContext().size()+"");
        sb.append(separator);
        sb.append(r.getInputContext().size()+"");
        sb.append(separator);

        sb.append(t.getInputContext().hasOnlyPrimitive()+"");
        sb.append(separator);
        sb.append(r.getInputContext().hasOnlyPrimitive()+"");
        sb.append(separator);

        sb.append(failures+"");

        sb.append(separator);
        sb.append(t.getCodeFragmentSuperType().getSimpleName());
        sb.append(separator);
        sb.append(r.getCodeFragmentSuperType().getSimpleName());
    }

    public void setType(String type) {
        this.type = type;
    }
}
