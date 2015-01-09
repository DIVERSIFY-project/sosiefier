package fr.inria.diversify.factories;

import fr.inria.diversify.util.Log;
import spoon.compiler.SpoonCompiler;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.IOException;

/**
 * Created by marodrig on 16/06/2014.
 */
public class SpoonMetaFactory{

    public Factory buildNewFactory(String srcDirectory, int javaVersion) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ArrayList<String> a = new ArrayList<String>();
        a.add(srcDirectory);
        return buildNewFactory(a, javaVersion);
    }
    public Factory buildNewFactory(Collection<String> srcDirectory, int javaVersion) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        env.setComplianceLevel(javaVersion);
        env.setVerbose(false);
        env.setDebug(false);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler compiler = new JDTBasedSpoonCompiler(factory);
        for (String dir : srcDirectory.split(System.getProperty("path.separator"))) {
            try {
                Log.debug("add {} to classpath", dir);
                File dirFile = new File(dir);
                if (dirFile.isDirectory()) {
                    compiler.addInputSource(dirFile);
                }
            } catch (IOException e) {
                Log.error("error in initSpoon", e);
            }

        }
        try {
            compiler.build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }
}
