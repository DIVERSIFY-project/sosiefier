package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
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
public class Replace extends Transformation {

    protected Map<CodeFragment,CodeFragment> replaces;
    private Map<CodeFragment, Map<String, String>> variableMapping;

    public Replace() {
        replaces = new HashMap<CodeFragment, CodeFragment>();
        variableMapping = new HashMap<CodeFragment, Map<String, String>>();
    }



    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "replace");
        JSONArray array = new JSONArray();
        object.put("transformation",array);
        for(CodeFragment position: replaces.keySet()) {
            JSONObject t = new JSONObject();
            t.put("CodeFragmentPosition", position.toJSONObject());
            t.put("CodeFragmentReplace", replaces.get(position).toJSONObject());
            t.put("VariableMapping", variableMapping.get(position));
            array.put(t);
        }
        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        JSONArray Jparents = new JSONArray();
        object.put("parents",Jparents);
        for(Transformation parent : parents) {
            Jparents.put(parent.toJSONObject());
        }

        return object;
    }

    @Override
    protected void addSourceCode(CodeFragment position) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);



        Log.debug("position:\n{}",position);
        Log.debug("{}",position.getCtCodeFragment().getPosition());
        Log.debug("{}",position.getCodeFragmentType());
        Log.debug("replace by:\n{}",replaces.get(position));

        Map<String, String> varMapping;
        if(variableMapping.isEmpty()) {
            varMapping = position.randomVariableMapping(replaces.get(position));
        }
        else
            varMapping = variableMapping.get(position);

        Log.debug("random variable mapping: {}", varMapping);
        replaces.get(position).replaceVar(position, varMapping);
        variableMapping.put(position,varMapping);
        if(replaces.get(position).equals(position.codeFragmentString()))
            throw new Exception("same statment");

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** ", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                replaces.get(position).codeFragmentString()+"\n", 0));


//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+
//                replaces.get(position).codeFragmentString()+"\n", 0));
    }

    @Override
    public Replace toReplace() throws Exception {
        return this;
    }

    @Override
    public Add toAdd() throws Exception {
        Add a = new Add();
        for (CodeFragment cf : transforms)
            a.addCodeFragmentToAdd(cf,replaces.get(cf));
        return a;
    }

    @Override
    public Delete toDelete() throws Exception {
        Delete delete = new Delete();
        for(CodeFragment codeFragment : transforms) {
            delete.addCodeFragmentToTransform(codeFragment);
        }
        return delete;
    }

    public boolean addCodeFragmentToReplace(CodeFragment position, CodeFragment replace) {
        if(transforms.contains(position))
            return false;
        transforms.add(position);
        replaces.put(position,replace);
        return true;
    }

    public void addVarMapping(CodeFragment position, Map<String, String> mapping) {
        variableMapping.put(position, mapping);
    }

    @Override
    public void add(Transformation replace) {
        transforms.addAll(replace.transforms);
        this.replaces.putAll(((Replace)replace).replaces);
        this.variableMapping.putAll(((Replace)replace).variableMapping);
    }

    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(!(other instanceof Replace))
            return  false;
        Replace otherReplace = (Replace)other;

        return failures == otherReplace.failures &&
                variableMapping.equals(otherReplace.variableMapping) &&
                transforms.equals(otherReplace.transforms) &&
                replaces.equals(otherReplace.replaces);
    }
    @Override
    public String toString() {
        String ret = new String();
        for(CodeFragment position: replaces.keySet()) {
            ret = ret + "position: "+position.toString()+"\n" +
                    "replace: "+replaces.get(position).toString()+"\n"+
                    "varMapping: "+variableMapping.get(position).toString()+"\n";
        }
        return ret;
    }

    public String getType(){
        return "replace";
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
    @Override
    public void write(StringBuffer sb, char separator) {
        CodeFragment t = transforms.get(0);
        CodeFragment r = replaces.get(t);

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
}
