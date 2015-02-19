package fr.inria.diversify.transformation.bytecode;

import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import javassist.bytecode.*;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.IOException;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 3:20 PM
 */
public class BytecodeDelete extends BytecodeTransformation {

    public BytecodeDelete(CtMethod method, int index, List<CtMethod> methods)  {
        methodLocation = method;
        opcodeIndex = index;
        this.methods = methods;
        name = "delete";
        type = "adrBytecode";
    }

    public BytecodeDelete() {
        name = "delete";
        type = "adrBytecode";
    }

    public void apply() throws BadBytecode {
        MethodInfo minfo = methodLocation.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();
        List<Integer> opCodeIndexList = opCodeIndexList(ca);

        Log.debug("transformation: {}, {}",type,name);
        Log.info("delete opcode in method {} at index {} (size: {})",methodLocation.getName(),opCodeIndexList.get(opcodeIndex), byteCodeSize(ca, opCodeIndexList, opcodeIndex));
        deleteOpcode(ca, opCodeIndexList.get(opcodeIndex), byteCodeSize(ca, opCodeIndexList, opcodeIndex));
    }

    protected void deleteOpcode(CodeAttribute ca, int index, int size) {
        CodeIterator i = ca.iterator();
        byte[] NOPByte = new byte[size];
        i.write(NOPByte,index);
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("methodLocation", methodLocation.getLongName());
        object.put("opcodeIndex",opcodeIndex);

        return object;
    }
}
