package fr.inria.diversify.factories;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.Log;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by marodrig on 16/06/2014.
 */
public class SpoonMetaFactory {

    public Factory buildNewFactory(InputProgram inputProgram, boolean withTest) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        ArrayList<String> a = new ArrayList<String>();
        a.add(inputProgram.getAbsoluteSourceCodeDir());
        if(withTest) {
            a.add(inputProgram.getAbsoluteTestSourceCodeDir());
        }
        a.add(inputProgram.getExternalSourceCodeDir());
        return buildNewFactory(a, inputProgram.getJavaVersion());
    }

    public DiversityCompiler buildSpoonCompiler(InputProgram inputProgram, boolean withTest) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        ArrayList<String> a = new ArrayList<String>();
        a.add(inputProgram.getAbsoluteSourceCodeDir());
        if(withTest) {
            a.add(inputProgram.getAbsoluteTestSourceCodeDir());
        }
        a.add(inputProgram.getExternalSourceCodeDir());
        return buildSpoonCompiler(a, inputProgram.getJavaVersion());
    }

    public Factory buildNewFactory(String srcDirectory, int javaVersion) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ArrayList<String> a = new ArrayList<String>();
        a.add(srcDirectory);
        return buildNewFactory(a, javaVersion);
    }

    public Factory buildNewFactory(Collection<String> srcDirectory, int javaVersion) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return buildSpoonCompiler(srcDirectory, javaVersion).getFactory();
    }

    public DiversityCompiler buildSpoonCompiler(Collection<String> srcDirectory, int javaVersion) {
        StandardEnvironment env = new StandardEnvironment();
        env.setComplianceLevel(javaVersion);
        env.setVerbose(false);
        env.setDebug(false);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        DiversityCompiler compiler = new DiversityCompiler(factory);
        for (String s : srcDirectory) {
            for (String dir : s.split(System.getProperty("path.separator"))) {
                try {
                    Log.debug("add {} to classpath", dir);
                    File dirFile = new File(dir);
                    if (dirFile.isDirectory()) {
                        compiler.addInputSource(dirFile);
                    }
                } catch (Exception e) {
                    Log.error("error in initSpoon", e);
                    throw new RuntimeException(e);
                }
            }
        }
        try {
            compiler.build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return compiler;
    }
}
