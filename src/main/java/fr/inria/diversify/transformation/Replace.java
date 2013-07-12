package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
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

    public Replace() {
        replaces = new HashMap<CodeFragment, CodeFragment>();
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
//        object.put("CodeFragmentPosition", toReplace.toJSONObject());
//        object.put("CodeFragmentToAdd", cfToAdd.toJSONObject());
//        object.put("VariableMapping", variableMapping);
//        object.put("allTestRun", (failures != null));
//        object.put("Failures", failures);

        return object;
    }

    protected void addSourceCode(CodeFragment position) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        System.out.println("cfToReplace:\n " +position);
        System.out.println(position.getCtCodeFragment().getPosition());
        System.out.println(position.getCodeFragmentType());
        System.out.println( replaces.get(position));

        Map<String, String> varMapping = position.randomVariableMapping(replaces.get(position)); //tmp
        System.out.println("random variable mapping: " + varMapping);
        replaces.get(position).replaceVar(position, varMapping);  //tmp

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


}
