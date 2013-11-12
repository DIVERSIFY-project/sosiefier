package fr.inria.diversify.javassist;

import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 5:28 PM
 */
public class BytecodeAdd extends ByteCodeTransformation {
    protected byte[] byteCodeToAdd;


    public BytecodeAdd(CtMethod method, int index, byte[] bytecode) {
        methodLocation = method;
        opcodeIndex = index;
        byteCodeToAdd = bytecode;
    }

    @Override
    public String getType() {
        return "bytecodeAdd";
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
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void apply() throws BadBytecode {
        MethodInfo minfo = methodLocation.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();

        List<Integer> opCodeIndexList = opCodeIndexList(ca);

        Log.info("add opcode in method {} at index {} (size: {})", methodLocation.getName(), opCodeIndexList.get(opcodeIndex), byteCodeToAdd.length);
        addOpcode(ca, opCodeIndexList.get(opcodeIndex),byteCodeToAdd);
    }

    protected void addOpcode(CodeAttribute ca, int index, byte[] bytecode) throws BadBytecode {
        CodeIterator i = ca.iterator();

        i.insert(index, bytecode);
    }
}
