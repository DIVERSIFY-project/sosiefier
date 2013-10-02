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
 * User: Simon
 * Date: 7/11/13
 * Time: 4:33 PM
 */
public class Add extends Transformation {

    private Map<CodeFragment, CodeFragment> adds;
    private HashMap<CodeFragment, Map<String, String>> variableMapping;

    public Add() {
        adds = new HashMap<CodeFragment, CodeFragment>();
        variableMapping = new HashMap<CodeFragment, Map<String, String>>();
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "add");
        JSONArray array = new JSONArray();
        object.put("transformation", array);
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

        Log.debug("cfToAdd:\n {}",adds.get(position));
        Log.debug("---------------------\npostion:\n{}",position);
        Log.debug("{}",adds.get(position).getCtCodeFragment().getPosition());

        Map<String, String> varMapping;
        if(variableMapping.isEmpty())
            varMapping = position.randomVariableMapping(adds.get(position));
        else
            varMapping = variableMapping.get(position);

        Log.debug("random variable mapping: {}",varMapping);
        adds.get(position).replaceVar(position, varMapping);
        variableMapping.put(position,varMapping);

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = position.getCtCodeFragment().getPosition();

        int index = sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, adds.get(position).codeFragmentString(), 0));
        Log.debug("----------\n---------");
        Log.debug("{}",originalClass.getQualifiedName());
    }

    public void addVarMapping(CodeFragment position, Map<String, String> mapping) {
        variableMapping.put(position, mapping);
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
    public  int hashCode() {
        return 1;
    }
    public boolean equals(Object other) {
        if(!(other instanceof Add))
            return  false;
        Add otherAdd = (Add)other;

        return failures == otherAdd.failures &&
                variableMapping.equals(otherAdd.variableMapping) &&
                transforms.equals(otherAdd.transforms) &&
                adds.equals(otherAdd.adds);
    }

    @Override
 public void writeHead(BufferedWriter sb, char separator) throws IOException {
    sb.write("positionType" + separator + "addType" + separator +
            "positionSize" + separator + "addSize" + separator +
            "positionClass" + separator + "addClass" + separator +
            "positionPackage" + separator + "addPackage" + separator +
            "positionInputContextSize" + separator + "addInputContextSize" + separator +
            "positionInputContextOnlyPrimitive" + separator + "addInputContextOnlyPrimitive" + separator +
            "failure" + separator +
            "positionSuperType" +separator + "addBySuperType");
}

    public String getType(){
        return "add";
    }

    //works only for 1add
    @Override
    public void write(StringBuffer sb, char separator) {
        CodeFragment p = transforms.get(0);
        CodeFragment r = adds.get(p);

        sb.append(p.getCodeFragmentType().getSimpleName());
        sb.append(separator);
        sb.append(r.getCodeFragmentType().getSimpleName());
        sb.append(separator);

        sb.append(p.getCtCodeFragment().toString().length()+"");
        sb.append(separator);
        sb.append(r.getCtCodeFragment().toString().length()+"");
        sb.append(separator);

        sb.append(p.getSourceClass().getQualifiedName());
        sb.append(separator);
        sb.append(r.getSourceClass().getQualifiedName());
        sb.append(separator);

        sb.append(p.getSourcePackage().getQualifiedName());
        sb.append(separator);
        sb.append(r.getSourcePackage().getQualifiedName());
        sb.append(separator);

        sb.append(p.getInputContext().size()+"");
        sb.append(separator);
        sb.append(r.getInputContext().size()+"");
        sb.append(separator);

        sb.append(p.getInputContext().hasOnlyPrimitive()+"");
        sb.append(separator);
        sb.append(r.getInputContext().hasOnlyPrimitive()+"");
        sb.append(separator);

        sb.append(failures+"");

        sb.append(separator);
        sb.append(p.getCodeFragmentSuperType().getSimpleName());
        sb.append(separator);
        sb.append(r.getCodeFragmentSuperType().getSimpleName());
    }
}
