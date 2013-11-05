package fr.inria.diversify.javassist;

import javassist.*;

import java.io.IOException;

/**
 * User: Simon
 * Date: 11/5/13
 * Time: 4:37 PM
 */
public class Test1 {


    public void test1(CtClass cc) throws NotFoundException, CannotCompileException, IOException {

//        ClassPool pool = ClassPool.getDefault();
//        CtClass cc = pool.get("Point");
        for(CtMethod method: cc.getMethods())
            if (method.getName().endsWith("Test")) {
                String snippet = "\t\tfr.inria.diversify.sosie.logger.LogWriter.writeTestStart(\"" + method.getLongName() + "\");\n";
                method.insertBefore(snippet);
            }
        cc.writeFile();
    }
}
