package fr.inria.diversify.transformation.bytecode;

import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import javassist.bytecode.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 3:20 PM
 */
public class BytecodeDelete extends BytecodeTransformation {

    public BytecodeDelete(CtMethod method, int index)  {
        methodLocation = method;
        opcodeIndex = index;
//        this.methods = methods;
    }

    public BytecodeDelete() {
    }

    public void apply() throws BadBytecode {

        MethodInfo minfo = methodLocation.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();

        List<Integer> opCodeIndexList = opCodeIndexList(ca);

        Log.info("delete opcode in method {} at index {} (size: {})",methodLocation.getName(),opCodeIndexList.get(opcodeIndex), byteCodeSize(ca, opCodeIndexList, opcodeIndex));
        deleteOpcode(ca, opCodeIndexList.get(opcodeIndex), byteCodeSize(ca, opCodeIndexList, opcodeIndex));
    }

    protected void deleteOpcode(CodeAttribute ca, int index, int size) {
        CodeIterator i = ca.iterator();
        byte[] NOPByte = new byte[size];
        i.write(NOPByte,index);
    }

    @Override
    public String getType() {
        return "delete";
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
        object.put("type", "delete");
        object.put("level", "bytecode");
        object.put("setCompile", compile);
//        JSONArray array = new JSONArray();
//        object.put("transformation",array);
//
//        JSONObject t = new JSONObject();
        object.put("methodLocation", methodLocation.getLongName());
        object.put("opcodeIndex",opcodeIndex);
//        array.put(t);

        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        return object;
    }
}
