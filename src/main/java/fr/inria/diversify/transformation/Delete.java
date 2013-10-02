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


/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:20 PM
 */
public class Delete extends Transformation {

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "delete");

        JSONArray array = new JSONArray();
        object.put("transformation",array);
        for(CodeFragment position: transforms) {
            JSONObject t = new JSONObject();
            t.put("CodeFragmentDelete", position.toJSONObject());
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

    protected void addSourceCode(CodeFragment delete) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(delete);

        Log.debug("cfToDelete:\n {}", delete);
        Log.debug("{}",delete.getCtCodeFragment().getPosition());
        Log.debug("{}",delete.getCodeFragmentType());

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = delete.getCtCodeFragment().getPosition();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n", 0));
    }

    @Override
    public Replace toReplace() throws Exception {
        throw new Exception();
    }

    @Override
    public Add toAdd() throws Exception {
       Add a = new Add();
       for (CodeFragment cf : transforms)
            a.addCodeFragmentToAdd(cf,cf);
        return a;
    }

    @Override
    public Delete toDelete() throws Exception {
        return this;
    }

    @Override
    public void add(Transformation delete) {
        transforms.addAll(delete.transforms);
    }

    public String getType(){
        return "delete";
    }
    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(!(other instanceof Delete))
            return  false;
        Delete otherDelete = (Delete)other;

        return failures == otherDelete.failures &&
                transforms.equals(otherDelete.transforms);
    }

    @Override
    public void writeHead(BufferedWriter sb, char separator) throws IOException {
        sb.append("deleteType" + separator +
                "deleteSize" + separator +
                "deleteClass" + separator +
                "deletePackage" + separator +
                "deleteInputContextSize" + separator +
                "deleteInputContextOnlyPrimitive" + separator +
                "failure" + separator +
                "deleteSuperType");
    }

    //works only for 1delete
    @Override
    public void write(StringBuffer sb, char separator) {
        CodeFragment p = transforms.get(0);

        sb.append(p.getCodeFragmentType().getSimpleName());
        sb.append(separator);

        sb.append(p.getCtCodeFragment().toString().length()+"");
        sb.append(separator);

        sb.append(p.getSourceClass().getQualifiedName());
        sb.append(separator);


        sb.append(p.getSourcePackage().getQualifiedName());
        sb.append(separator);

        sb.append(p.getInputContext().size()+"");
        sb.append(separator);

        sb.append(p.getInputContext().hasOnlyPrimitive()+"");
        sb.append(separator);

        sb.append(failures+"");
        sb.append(separator);
        sb.append(p.getCodeFragmentSuperType().getSimpleName());
    }
}
