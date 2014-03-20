package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.util.Log;
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
public class ASTDelete extends ASTTransformation {

    public ASTDelete() {
        name = "delete";
        type = "adrStmt";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("transplantationPoint", transplantationPoint.toJSONObject());

        return object;
    }

    public void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(transplantationPoint);
        Log.debug("transformation: {}, {}",type,name);
        Log.debug("transplantation Point:\n {}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());
        Log.debug("{}", transplantationPoint.getCodeFragmentType());

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = transplantationPoint.getCtCodeFragment().getPosition();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n", 0));
    }


    public  int hashCode() {
        return super.hashCode() * transplantationPoint.getCompilationUnit().hashCode() * transplantationPoint.getStartLine();
    }
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!(other instanceof ASTDelete))
            return  false;
        ASTDelete otherDelete = (ASTDelete)other;

        if(!equalParent(otherDelete.parent))
            return false;

           return  status == otherDelete.status &&
                   name.equals(otherDelete.name) &&
                   failures.equals(otherDelete.failures) &&
                   transplantationPoint.getCtCodeFragment().getPosition().equals(otherDelete.transplantationPoint.getCtCodeFragment().getPosition());
    }


    @Override
    public String toString() {
        return "transplantationPoint: "+ transplantationPoint.toString()+"\n";
    }
}
