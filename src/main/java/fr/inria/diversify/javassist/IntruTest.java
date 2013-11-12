package fr.inria.diversify.javassist;

import fr.inria.diversify.util.Log;
import javassist.*;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * User: Simon
 * Date: 11/5/13
 * Time: 4:37 PM
 */
public class IntruTest {

    public void intruTestClasses(File dir) throws NotFoundException, CannotCompileException, IOException, ClassNotFoundException {
        int dirNameLength = dir.getAbsolutePath().length();
        ClassPool pool = ClassPool.getDefault();
        for(File file : allFiles(dir,".class")) {
            String filePath = file.getAbsolutePath();
            String className = filePath.substring(dirNameLength + 1, filePath.length() - 6);
            className = className.replace("/",".");

            if(className.split("\\$")[0].endsWith("Test")) {
                Log.info("intru class: "+className);
                intruTestClass(pool.get(className));
            }
        }
    }

    public void intruTestClass(CtClass cc) throws CannotCompileException, NotFoundException, IOException, ClassNotFoundException {
        for(CtMethod method: cc.getMethods())
            if (isTestMethod(method)) {
                Log.info("intru method: "+method.getName());
                String snippet = "\t\tfr.inria.diversify.sosie.logger.LogWriter.writeTestStart(\"" + method.getLongName() + "\");\n";
                try {
                    method.insertBefore(snippet);
                } catch (Exception e) {
                    Log.debug("",e);
                }

            }
        cc.writeFile();
    }

    protected boolean isTestMethod(CtMethod method) throws ClassNotFoundException {
        if (method.getName().startsWith("test"))
            return  true;

        for(Object annotation : method.getAnnotations())
            if(annotation.toString().endsWith("Test"))
                return true;

        return false;
    }

    protected List<File> allFiles(File file, String endsWith) {
        List<File> files = new LinkedList<File>();
        for(File f : file.listFiles()) {
            if(f.isDirectory())
                files.addAll(allFiles(f,endsWith));
            else
                if(f.getName().endsWith(endsWith))
                    files.add(f);
        }
        return files;
    }

    public static void main(String[] args) throws IOException, CannotCompileException, NotFoundException, ClassNotFoundException {
        IntruTest it = new IntruTest();
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(args[0]);

        it.intruTestClasses(new File(args[0]));
    }
}
