package fr.inria.diversify.transformation.bytecode;

import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
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
    }

    @Override
    public String getType() {
        return "replace";
    }

    @Override
    public void write(StringBuffer sb, char separator) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeHead(BufferedWriter sb, char separator) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "replace");
        object.put("level", "bytecode");
        JSONArray array = new JSONArray();
        object.put("transformation",array);

        JSONObject t = new JSONObject();
        t.put("methodLocation", methodLocation.getLongName());
        t.put("opcodeIndex",opcodeIndex);
        t.put("byteCodeToReplace", Arrays.toString(byteCodeToReplace));
        array.put(t);

        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

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
}
