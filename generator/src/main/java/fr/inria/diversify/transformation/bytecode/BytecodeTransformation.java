package fr.inria.diversify.transformation.bytecode;

import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.util.Log;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.*;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 5:28 PM
 */
public abstract class BytecodeTransformation extends SingleTransformation {
    protected CtMethod methodLocation;
    protected int opcodeIndex;
    protected List<CtMethod> methods;

    protected File backupClassFile;
    protected CtClass backupClass;

    public void apply(String targetDir) throws Exception {
        backupClass = methodLocation.getDeclaringClass();
        String destination = targetDir+ "/"+backupClass.getName().replace(".","/") + ".originalClass";
        backupClassFile = new File(destination);

       backupClassFile.createNewFile();
        FileUtils.copyFile(new File(backupClass.getURL().getFile()),backupClassFile);

        Log.info("bytecode transformation: {} in method: {}",this.getType(),methodLocation.getLongName());
        Log.debug("method bytecode before: \n{}", methodToString(methodLocation));
        apply();
        Log.debug("method bytecode after: \n{}",methodToString(methodLocation));
        Log.debug("write new class in: {}",targetDir);
        methodLocation.getDeclaringClass().writeFile(targetDir);
    }

    protected abstract void apply() throws BadBytecode;
    public void applyWithParent(String srcDir) throws BadBytecode {}

    public void restore(String targetDir) throws Exception {
        String destination = targetDir+ "/"+backupClass.getName().replace(".","/") + ".class";
        Log.debug("restore file: " + backupClassFile + " -> " + destination);

        for(CtMethod method : methodLocation.getDeclaringClass().getDeclaredMethods())
            if(!method.isEmpty())
                methods.remove(method);
        methodLocation.getDeclaringClass().detach();

        FileUtils.copyFile(backupClassFile, new File(destination));
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(destination);
        pool.get(backupClass.getName());
        for(CtMethod method : pool.get(backupClass.getName()).getDeclaredMethods())
            if(!method.isEmpty())
                methods.add(method);
    }

    protected List<Integer> opCodeIndexList(CodeAttribute ca) throws BadBytecode {
        List<Integer> list = new ArrayList<Integer>();
        CodeIterator i = ca.iterator();

        while (i.hasNext()) {
            list.add(i.next());
        }
        return list;
    }

    public String methodToString(CtMethod method) throws BadBytecode {
        MethodInfo minfo = method.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();
        CodeIterator i = ca.iterator();
        String ret = "";

        int oldIndex = i.next();
        while(i.hasNext()) {
                int index = i.next();
                int op = i.byteAt(oldIndex);
                ret += "index: "+oldIndex+", opCode: "+Mnemonic.OPCODE[op]+ "\n";
                for(int j = oldIndex+1; j < index; j++)
                    ret += "index: "+j+", byteCode: "+ i.byteAt(j) +"\n";
                oldIndex = index;
            }
        return ret;
    }

    protected int byteCodeSize(CodeAttribute ca, List<Integer> opCodeIndexList, int index) {
        if(index + 1 == opCodeIndexList.size())
            return ca.getCodeLength() - opCodeIndexList.get(index);
        else
            return opCodeIndexList.get(index+1) - opCodeIndexList.get(index);

    }

    public String classLocationName() {
        return methodLocation.getDeclaringClass().getName();
    }
    public String packageLocationName() {
        return methodLocation.getDeclaringClass().getPackageName();
    }
    public String methodLocationName() {
        return methodLocation.getLongName();
    }

    public void setOpcodeIndex(int opcodeIndex) {
        this.opcodeIndex = opcodeIndex;
    }

    public void setMethodLocation(CtMethod methodLocation) {
        this.methodLocation = methodLocation;
    }

    public int line() {return 0;}

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public void printJavaFile(String srcDir) throws IOException {

    }

}
