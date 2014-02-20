package fr.inria.diversify.transformation.bytecode;

import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 5:29 PM
 */
public class BytecodeReplace extends BytecodeTransformation {
    protected byte[] byteCodeToReplace;

    public BytecodeReplace(CtMethod method, int index, byte[] bytecode, List<CtMethod> methods) {
        methodLocation = method;
        opcodeIndex = index;
        byteCodeToReplace = bytecode;
        this.methods = methods;
        name = "replace";
        type = "adrBytecode";
    }

    public BytecodeReplace() {
        name = "replace";
        type = "adrBytecode";
    }



    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("failures", failures);
        object.put("status", status);

        if(parent != null)
            object.put("parent",parent.toJSONObject());

        object.put("methodLocation", methodLocation.getLongName());
        object.put("opcodeIndex",opcodeIndex);
        object.put("byteCodeToReplace", Arrays.toString(byteCodeToReplace));

        return object;
    }



    @Override
    protected void apply() throws BadBytecode {
        MethodInfo minfo = methodLocation.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();

        List<Integer> opCodeIndexList = opCodeIndexList(ca);

        Log.info("replace opcode in method {} at index {} (size: {})", methodLocation.getName(), opCodeIndexList.get(opcodeIndex), byteCodeToReplace.length);
        deleteOpcode(ca, opCodeIndexList.get(opcodeIndex), byteCodeSize(ca, opCodeIndexList, opcodeIndex));
        addOpcode(ca, opCodeIndexList.get(opcodeIndex),byteCodeToReplace);
    }

    protected void deleteOpcode(CodeAttribute ca, int index, int size) {
        CodeIterator i = ca.iterator();
        byte[] NOPByte = new byte[size];
        i.write(NOPByte,index);
    }
    protected void addOpcode(CodeAttribute ca, int index, byte[] bytecode) throws BadBytecode {
        CodeIterator i = ca.iterator();
        i.insert(index, bytecode);
    }

    public void setByteCodeToReplace(byte[] byteCodeToReplace) {
        this.byteCodeToReplace = byteCodeToReplace;
    }
}
