package fr.inria.diversify.sosie;

import fr.inria.diversify.sosie.logger.processor.ConditionalLoggingInstrumenter;
import fr.inria.diversify.sosie.logger.processor.MethodLoggingInstrumenter;
import fr.inria.diversify.sosie.logger.processor.TestLoggingInstrumenter;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.compiler.SpoonCompiler;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.JDTCompiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 2:03 PM
 */
public class MainMethodCallInstru {
    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        new MainMethodCallInstru();
    }

    public MainMethodCallInstru() throws Exception {
        initLogLevel();

        if(DiversifyProperties.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
        }
        String project = DiversifyProperties.getProperty("project");
        String tmpDir = DiversifyProperties.getProperty("out") + "/sosie_" + System.currentTimeMillis();

        File dir = new File(tmpDir);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(project), dir);

        String src = project+ "/" +DiversifyProperties.getProperty("src");
        String test = project+ "/" +DiversifyProperties.getProperty("testSrc");

        Factory factory = initSpoon(src);
        applyProcessor(factory, new MethodLoggingInstrumenter());
        applyProcessor(factory, new ConditionalLoggingInstrumenter());

        factory.getEnvironment().useSourceCodeFragments(true);
        applyProcessor(factory, new JavaOutputProcessorWithFilter(new File(tmpDir +"/"+DiversifyProperties.getProperty("src")), allClassesName(new File(src))));

        factory = initSpoon(src+System.getProperty("path.separator")+test);

        applyProcessor(factory, new TestLoggingInstrumenter());

        factory.getEnvironment().useSourceCodeFragments(true);
        applyProcessor(factory, new JavaOutputProcessorWithFilter(new File(tmpDir +"/"+DiversifyProperties.getProperty("testSrc")), allClassesName(new File(test))));
    }

    protected Factory initSpoon(String srcDirectory) {

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonCompiler c = new JDTCompiler(factory);
        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            c.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    protected void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }

    protected List<String> allClassesName(File dir) {
        List<String> list = new ArrayList<String>();

        for(File file : dir.listFiles())
            if(file.isDirectory())
                list.addAll(allClassesName(file));
            else {
                String name = file.getName();
                if(name.endsWith(".java")) {
                    String[] tmp = name.substring(0, name.length() - 5).split("/");
                    list.add(tmp[tmp.length - 1]);
                }
            }
        return list;
    }
}
