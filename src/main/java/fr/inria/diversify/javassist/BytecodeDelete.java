package fr.inria.diversify.javassist;

import fr.inria.diversify.util.Log;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 3:20 PM
 */
public class BytecodeDelete extends ByteCodeTransformation{

    public void randomDelete(CtClass cc) throws BadBytecode {
        int nbMethods = cc.getMethods().length;
        Random r = new Random();

         CtMethod m = cc.getMethods()[r.nextInt(nbMethods)];
        randomDelete(m);
        MethodInfo minfo = m.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();
        CodeIterator i = ca.iterator();
        Log.info("method: {}",minfo.getName());

        int oldIndex = i.next();
        while(i.hasNext()) {
                int index = i.next();
                int op = i.byteAt(oldIndex);
                Log.info("index: {}, opCode: {}",oldIndex,Mnemonic.OPCODE[op]);
                for(int j = oldIndex+1; j < index; j++)
                    Log.info("index: {}, bytecode: {}",j,i.byteAt(j));

                oldIndex = index;
            }
    }

    public void randomDelete(CtMethod method) throws BadBytecode {

        MethodInfo minfo = method.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();

        List<Integer> opCodeIndex = opCodeIndex(ca);
        Random r = new Random();

        int index = r.nextInt(opCodeIndex.size());
        Log.info("delete opcode in method {} at index {} (size: {})",method.getName(),opCodeIndex.get(index),opCodeIndex.get(index+1) - opCodeIndex.get(index));
        deleteOpcode(ca, opCodeIndex.get(index),opCodeIndex.get(index+1) - opCodeIndex.get(index));

    }


    protected List<Integer> opCodeIndex(CodeAttribute ca) throws BadBytecode {
        List<Integer> list = new ArrayList<Integer>();
        CodeIterator i = ca.iterator();

        while (i.hasNext()) {
            list.add(i.next());
        }
        return list;
    }

    protected void deleteOpcode(CodeAttribute ca, int index, int size) {
        CodeIterator i = ca.iterator();
        byte[] NOPByte = new byte[size];
        i.write(NOPByte,index);
    }
}
