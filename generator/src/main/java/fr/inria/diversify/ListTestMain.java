package fr.inria.diversify;

import fr.inria.diversify.coverage.TestProcessor;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import spoon.compiler.SpoonCompiler;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.*;
import java.util.*;


public class ListTestMain {

    private final InputConfiguration inputConfigureation;

    public static void main(String[] args) throws Exception {
//        new ListTestMain(args[0]);

        Set<String> test = fromSurefireReport("../commons-math/target/surefire-reports");

        BufferedWriter out = new BufferedWriter(new FileWriter("allTest"));
        out.append("nb");
        for(String t: test) {
            out.append(t+"\n");
        }
        out.close();
    }

    public ListTestMain(String propertiesFile) throws Exception {
        inputConfigureation = new InputConfiguration(propertiesFile);
        initLogLevel();
        if(inputConfigureation.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = MavenDependencyResolver.dependencyResolver();
            t.resolveDependencies(inputConfigureation.getInputProgram());
        }
        initSpoon();
    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        String srcDirectory = inputConfigureation.getProperty("project") + "/" + inputConfigureation.getProperty("src");
        srcDirectory += System.getProperty("path.separator")+inputConfigureation.getProperty("project") + "/" + inputConfigureation.getProperty("testSrc");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(inputConfigureation.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        FactoryImpl factory = new FactoryImpl(f, env);
        SpoonCompiler compiler = new JDTBasedSpoonCompiler(factory);
        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                Log.debug("add {} to classpath",dir);
                compiler.addInputSource(new File(dir));
            } catch (Exception e) {
                Log.error("error in initSpoon", e);
            }
        try {
            compiler.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProcessingManager pm = new QueueProcessingManager(factory);
        TestProcessor processor = new TestProcessor("allTest");
        pm.addProcessor(processor);
        pm.process();
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(inputConfigureation.getProperty("logLevel"));
        Log.set(level);
    }


    public static Set<String> fromSurefireReport(String dir) throws IOException {
        Set<String> test = new HashSet<>();
        File file = new File(dir);
        for (File f : file.listFiles())
            if(f.getName().endsWith(".xml")) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line = br.readLine();
                while (line != null) {
                    if ( line.contains("<testcase classname=")) {
                        String className = line.split("testcase classname=\"")[1].split("\"")[0];
                        String testName = line.split(" name=\"")[1].split("time=\"")[0].split("\"")[0].split("\\[")[0];
                        test.add(className+"#"+testName);
                        Log.info(className + "#" + testName);
                    }
                    line = br.readLine();
                }
            }
        return test;
    }

}
