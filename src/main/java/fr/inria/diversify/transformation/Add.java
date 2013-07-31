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
 * User: Simon
 * Date: 7/11/13
 * Time: 4:33 PM
 */
public class Add extends Transformation {

    private Map<CodeFragment, CodeFragment> adds;

    public Add() {
        adds = new HashMap<CodeFragment, CodeFragment>();
    }

    @Override
    public void write(StringBuffer sb, char separator) {

    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "add");
        JSONArray array = new JSONArray();
        object.put("transformation",array);
        for(CodeFragment position: adds.keySet()) {
            JSONObject t = new JSONObject();
            t.put("CodeFragmentPosition", position.toJSONObject());
            t.put("CodeFragmentAdd", adds.get(position).toJSONObject());
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

    protected void addSourceCode(CodeFragment position) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(position);

        System.out.println("cfToAdd:\n " + adds.get(position)+ " postion: " +position);
        System.out.println(adds.get(position).getCtCodeFragment().getPosition());

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();

        int index = sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, adds.get(position).codeFragmentString(), 0));
    }

    @Override
    public Replace toReplace() throws Exception {
        throw new Exception();
    }

    @Override
    public Add toAdd() throws Exception {
        return this;
    }

    @Override
    public Delete toDelete() throws Exception {
        Delete d = new Delete();
        for (CodeFragment cf : transforms)
            d.addCodeFragmentToTransform(cf);
        return d;
    }

    public boolean addCodeFragmentToAdd(CodeFragment position, CodeFragment add) {
        if(transforms.contains(position))
            return false;
        transforms.add(position);
        adds.put(position,add);
        return true;
    }

    public void add(Transformation add) {
        transforms.addAll(add.transforms);
        adds.putAll(((Add)add).adds);
    }
}
