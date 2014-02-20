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
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);

        object.put("codeFragmentPosition", position.toJSONObject());
        object.put("failures", failures);
        object.put("status", status);

        return object;
    }

    protected void addSourceCode() throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        Log.debug("cfToDelete:\n {}", position);
        Log.debug("{}", position.getCtCodeFragment().getPosition());
        Log.debug("{}",position.getCodeFragmentType());

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n", 0));
    }


    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(!(other instanceof ASTDelete))
            return  false;
        ASTDelete otherDelete = (ASTDelete)other;

//        return failures == otherDelete.failures &&
           return      position.equals(otherDelete.position);
    }

//    @Override
//    public void writeHead(BufferedWriter sb, char separator) throws IOException {
//        sb.append("deleteType" + separator +
//                "deleteSize" + separator +
//                "deleteClass" + separator +
//                "deletePackage" + separator +
//                "deleteInputContextSize" + separator +
//                "deleteInputContextOnlyPrimitive" + separator +
//                "failure" + separator +
//                "deleteSuperType");
//    }

    @Override
    public String toString() {
        String ret = new String();

        ret = ret + "position: "+position.toString()+"\n";


        return ret;
    }
}
