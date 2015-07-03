package fr.inria.diversify.bytecode;



import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeIterator;

import java.io.*;

/**
 * User: Simon
 * Date: 24/06/15
 * Time: 13:03
 */
public class CompareBytecode {
    CtClass class1;
    CtClass class2;

    public CompareBytecode(String class1File, String class2File) throws Exception {
        class1 = readClass(class1File);
        class2 = readClass(class2File);
    }

    protected CtClass readClass(String classFileName) throws Exception {
        File cl = new File(classFileName);

        if(!cl.exists()) {
            throw new Exception("class fille " + classFileName + "dont exists");
        }

        ClassPool cp = ClassPool.getDefault();
        InputStream ins = new FileInputStream(cl);
        return cp.makeClass(ins);
    }

    public boolean equals(String methodName) throws NotFoundException, BadBytecode {
        CtMethod mth1 = class1.getDeclaredMethod(methodName);
        CtMethod mth2 = class2.getDeclaredMethod(methodName);
        CodeIterator i1 = mth1.getMethodInfo().getCodeAttribute().iterator();
        CodeIterator i2 = mth2.getMethodInfo().getCodeAttribute().iterator();


        while (i1.hasNext() && i2.hasNext()) {
            if(i1.byteAt(i1.next()) != i2.byteAt(i2.next())) {
                return false;
            }
        }
        return i1.hasNext() == i2.hasNext();
    }
}
