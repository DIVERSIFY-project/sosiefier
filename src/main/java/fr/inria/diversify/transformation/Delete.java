package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;


/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:20 PM
 */
public class Delete extends Transformation {
    @Override
    public void write(StringBuffer sb, char separator) {

    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "replace");
        object.put("transformation", transforms);
        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        return object;
    }

    protected void addSourceCode(CodeFragment delete) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(delete);

        System.out.println("cfToDelete:\n " + delete);
        System.out.println(delete.getCtCodeFragment().getPosition());
        System.out.println(delete.getCodeFragmentType());

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = delete.getCtCodeFragment().getPosition();
        int r = sp.getSourceEnd() - sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n", 0));
    }
}
