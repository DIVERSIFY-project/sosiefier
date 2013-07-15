package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;

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

        return object;
    }

    protected void addSourceCode(CodeFragment position) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        System.out.println("cfToReplace:\n " +position);
        System.out.println(position.getCtCodeFragment().getPosition());
        System.out.println(position.getCodeFragmentType());
        System.out.println( replaces.get(position));

        Map<String, String> varMapping = position.randomVariableMapping(replaces.get(position));

        System.out.println("random variable mapping: " + varMapping);
        replaces.get(position).replaceVar(position, varMapping);
        variableMapping.put(position,varMapping);
        if(replaces.get(position).equals(position.codeFragmentString()))
            throw new Exception("same statment");

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();

        int r = sp.getSourceEnd() - compileUnit.beginOfLineIndex(sp.getSourceStart());
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n"+replaces.get(position).codeFragmentString()+"\n", 0));
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
    }
}
