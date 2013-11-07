package fr.inria.diversify.javassist;

import fr.inria.diversify.util.Log;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 3:20 PM
 */
public class BytecodeDelete extends ByteCodeTransformation {

    public BytecodeDelete(CtMethod method, int index)  {
        methodLocation = method;
        opcodeIndex = index;
    }

//    public void randomDelete(CtClass cc) throws BadBytecode {
//        int nbMethods = cc.getMethods().length;
//        Random r = new Random();
//
//         CtMethod m = cc.getMethods()[r.nextInt(nbMethods)];
//        randomDelete(m);
//        MethodInfo minfo = m.getMethodInfo();
//        CodeAttribute ca = minfo.getCodeAttribute();
//        CodeIterator i = ca.iterator();
//        Log.info("method: {}",minfo.getName());
//
//        int oldIndex = i.next();
//        while(i.hasNext()) {
//                int index = i.next();
//                int op = i.byteAt(oldIndex);
//                Log.info("index: {}, opCode: {}",oldIndex,Mnemonic.OPCODE[op]);
//                for(int j = oldIndex+1; j < index; j++)
//                    Log.info("index: {}, bytecode: {}",j,i.byteAt(j));
//
//                oldIndex = index;
//            }
//    }


    public void apply() throws BadBytecode {

        MethodInfo minfo = methodLocation.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();

        List<Integer> opCodeIndexList = opCodeIndexList(ca);
        Random r = new Random();

        Log.info("delete opcode in method {} at index {} (size: {})",methodLocation.getName(),opCodeIndexList.get(opcodeIndex),opCodeIndexList.get(opcodeIndex+1) - opCodeIndexList.get(opcodeIndex));
        deleteOpcode(ca, opCodeIndexList.get(opcodeIndex),opCodeIndexList.get(opcodeIndex+1) - opCodeIndexList.get(opcodeIndex));
    }

    protected void deleteOpcode(CodeAttribute ca, int index, int size) {
        CodeIterator i = ca.iterator();
        byte[] NOPByte = new byte[size];
        i.write(NOPByte,index);
    }

    @Override
    public String getType() {
        return "bytecodeDelete";
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
}
