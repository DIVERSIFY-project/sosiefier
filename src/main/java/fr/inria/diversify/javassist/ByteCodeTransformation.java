package fr.inria.diversify.javassist;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.util.Log;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtSimpleType;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 5:28 PM
 */
public abstract class ByteCodeTransformation implements ITransformation {
    protected CtMethod methodLocation;
    protected int opcodeIndex;
    protected Integer failures;

    protected File backupClassFile;
    protected CtClass backupClass;
    protected List<CtSimpleType> allClasses;

    public void apply(String targetDir) throws Exception {
        backupClass = selectClass();
        String destination = targetDir+ "/"+backupClass.getName() + ".class";
        backupClassFile = new File(destination);
        FileUtils.copyFile(backupClassFile, new File(destination));
        Log.info("bytecode transformation: {}",this.getType());
        Log.debug("method bytecode before: {}",methodLocation.getMethodInfo());
        apply();
        Log.debug("method bytecode after: {}",methodLocation.getMethodInfo());
    }

    protected abstract void apply() throws BadBytecode;

    private CtClass selectClass() {
        //selection d'une classes converte par jacoco
        return null;
    }

    public void restore(String targetDir) throws Exception {
        String destination = targetDir+ "/"+backupClass.getName() + ".class";
        Log.debug("restore file: " + backupClassFile + " -> " + destination);
        FileUtils.copyFile(backupClassFile, new File(destination));
    }

    protected List<Integer> opCodeIndexList(CodeAttribute ca) throws BadBytecode {
        List<Integer> list = new ArrayList<Integer>();
        CodeIterator i = ca.iterator();

        while (i.hasNext()) {
            list.add(i.next());
        }
        return list;
    }

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public int numberOfFailure() {
        return failures;
    }
}
