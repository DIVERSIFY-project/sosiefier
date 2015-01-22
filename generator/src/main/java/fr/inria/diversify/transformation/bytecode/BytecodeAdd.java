package fr.inria.diversify.transformation.bytecode;

import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 5:28 PM
 */
public class BytecodeAdd extends BytecodeTransformation {
    protected byte[] byteCodeToAdd;

    @Override
    public String getTransformationString() throws Exception {
        return "";
    }

    public BytecodeAdd(CtMethod method, int index, byte[] bytecode, List<CtMethod> methods) {
        methodLocation = method;
        opcodeIndex = index;
        byteCodeToAdd = bytecode;
        this.methods = methods;
        name = "add";
        type = "adrBytecode";
    }

    public BytecodeAdd() {
        name = "add";
        type = "adrBytecode";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("methodLocation", methodLocation.getLongName());
        object.put("opcodeIndex",opcodeIndex);
        object.put("byteCodeToAdd", Arrays.toString(byteCodeToAdd));

        return object;
    }


    @Override
    protected void apply() throws BadBytecode {
        MethodInfo minfo = methodLocation.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();
        List<Integer> opCodeIndexList = opCodeIndexList(ca);

        Log.debug("transformation: {}, {}",type,name);
        Log.info("add opcode in method {} at index {} (size: {})", methodLocation.getName(), opCodeIndexList.get(opcodeIndex), byteCodeToAdd.length);
        addOpcode(ca, opCodeIndexList.get(opcodeIndex),byteCodeToAdd);
    }

    protected void addOpcode(CodeAttribute ca, int index, byte[] bytecode) throws BadBytecode {
        CodeIterator i = ca.iterator();

        i.insert(index, bytecode);
    }

    public void setByteCodeToAdd(byte[] byteCodeToAdd) {
        this.byteCodeToAdd = byteCodeToAdd;
    }
}
