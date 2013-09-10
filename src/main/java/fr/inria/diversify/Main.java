package fr.inria.diversify;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.sosie.Sosie;
import fr.inria.diversify.statistic.StatisticDiversification;
import fr.inria.diversify.statistic.Util;
import fr.inria.diversify.test.TestSosie;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.coverage.CoverageReport;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.statistic.StatisticCodeFragment;

import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.transformation.query.TransformationQueryTL;
import fr.inria.diversify.util.DiversifyProperties;

import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.*;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Main {
    private CodeFragmentList statements;

    public static void main(String[] args) throws Exception {

        if(args[0].equals("git")) {
            GitUtil.initGit(args[1]);
            Runtime r = Runtime.getRuntime();
            try {
                String propertiesFile = GitUtil.getFirstPropertyFile();
                BufferedWriter out = new BufferedWriter(new FileWriter("propertiesFile"));
                out.write(propertiesFile);
                out.close();
                out = new BufferedWriter(new FileWriter("nbCPU"));
                out.write(numberOfCpu());
                out.write(numberOfCpu());
                out.close();
//                r.exec("echo "+propertiesFile+" > propertiesFile" +propertiesFile);
//                Log.info("execute: sh run.sh {}",propertiesFile);
            } catch (Exception e) {
                Log.error("Main ",e);
            }
        }
        else
            new Main(args[0]);
    }

    public Main(String propertiesFile) throws Exception {
        new DiversifyProperties(propertiesFile);

        initLogLevel();
        initSpoon();
        Log.info("number of cpu: "+numberOfCpu());
        Log.info("number of statement: " + statements.size());

        if(DiversifyProperties.getProperty("sosie").equals("true"))
            runSosie();
        else
            if(DiversifyProperties.getProperty("sosieOnMultiProject").equals("true"))
                sosieOnMultiProject();
            else
                runDiversification();
        suicide();
//        if (DiversifyProperties.getProperty("stat").equals("true"))
//            computeStatistic();
    }

    protected void sosieOnMultiProject() throws Exception {
        TestSosie d = new TestSosie(initTransformationQuery(), DiversifyProperties.getProperty("project"));
        d.setSourceDirectory(DiversifyProperties.getProperty("src"));

        int t = Integer.parseInt(DiversifyProperties.getProperty("timeOut"));
        d.setTimeOut(t);

        d.setTmpDirectory(DiversifyProperties.getProperty("outputDir"));

        List<String> list = new ArrayList<String>();
        for (String mvn : DiversifyProperties.getProperty("mavenProjects").split(System.getProperty("path.separator")))
            list.add(mvn);

        d.setMavenProject(list);

        int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));
        d.run(n);

    }

    protected void runSosie() throws Exception {
        Sosie d = new Sosie(initTransformationQuery(), DiversifyProperties.getProperty("project"));
        d.setSourceDirectory(DiversifyProperties.getProperty("src"));

        int t = Integer.parseInt(DiversifyProperties.getProperty("timeOut"));
        d.setTimeOut(t);

        d.setTmpDirectory(DiversifyProperties.getProperty("outputDir"));

        int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));
        d.run(n);

    }

    protected void runDiversification() throws Exception {
        Diversify d = new Diversify(initTransformationQuery(), DiversifyProperties.getProperty("project"));
        String git = DiversifyProperties.getProperty("gitRepository");
        if(!git.equals("")) {
            GitUtil.initGit(git);
        }

        d.setSourceDirectory(DiversifyProperties.getProperty("src"));

        if (DiversifyProperties.getProperty("clojure").equals("true"))
            d.setClojureTest(true);

        int t = Integer.parseInt(DiversifyProperties.getProperty("timeOut"));
        if(t == -1)
            d.initTimeOut();
        else
            d.setTimeOut(t);
        //TODO refactor
        if(DiversifyProperties.getProperty("nbRun").equals("all")) {
            Util util = new Util(statements);
            if(DiversifyProperties.getProperty("transformation.type").equals("replace"))
                d.run(util.getAllReplace());
            if(DiversifyProperties.getProperty("transformation.type").equals("add"))
                d.run(util.getAllAdd());
            if(DiversifyProperties.getProperty("transformation.type").equals("delete"))
                d.run(util.getAllDelete());
        }
        else {
            int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));
            d.run(n);
        }
        d.printResult(DiversifyProperties.getProperty("result"), git+"/diversify-exp");
    }

    protected AbstractTransformationQuery initTransformationQuery() throws IOException, JSONException {
        ICoverageReport rg = initCoverageReport();

        AbstractTransformationQuery atq;
        String transformation = DiversifyProperties.getProperty("transformation.directory");
        if (transformation != null) {
            TransformationParser tf = new TransformationParser(statements);
            List<Transformation> list = tf.parseDir(transformation);
            atq = new TransformationQueryTL(list, rg, statements);
        } else {
            atq = new TransformationQuery(rg, statements);
        }
        atq.setType(DiversifyProperties.getProperty("transformation.type"));
        int n = Integer.parseInt(DiversifyProperties.getProperty("transformation.size"));
        atq.setNbTransformation(n);

        return atq;
    }


    protected void initSpoon() {
        String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonBuildingManager builder = new SpoonBuildingManager(factory);

        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                builder.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProcessingManager pm = new QueueProcessingManager(factory);
        StatementProcessor processor = new StatementProcessor();
        pm.addProcessor(processor);
        pm.process();

        statements = processor.getStatements();
    }

    protected ICoverageReport initCoverageReport() throws IOException {
        ICoverageReport icr;
        String jacocoFile = DiversifyProperties.getProperty("jacoco");
        String classes;
        if(DiversifyProperties.getProperty("jacoco.classes") != null)
            classes = DiversifyProperties.getProperty("jacoco.classes");
        else
            classes = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes");

        if (jacocoFile != null) {
            File file = new File(jacocoFile);
            if(file.isDirectory())
                icr = new MultiCoverageReport(classes, file);
            else
                icr = new CoverageReport(classes, file);
        }
        else
            icr = new NullCoverageReport();

        icr.create();
        return icr;
    }

    protected void computeStatistic() throws IOException, JSONException {
        String out = DiversifyProperties.getProperty("result");
        computeCodeFragmentStatistic(out);

        String transDir = DiversifyProperties.getProperty("transformation.directory");
        if (transDir != null) {
            computeDiversifyStat(transDir, out);
        }
        computeOtherStat();
    }

    protected void computeDiversifyStat(String transDir, String fileName) throws IOException, JSONException {
        TransformationParser tf = new TransformationParser(statements);
        List<Transformation> transformations = tf.parseDir(transDir);

        writeTransformation(fileName + "_allTransformation.json", transformations);
        writeGoodTransformation(fileName + "_goodTransformation.json", transformations);

        StatisticDiversification sd = new StatisticDiversification(transformations, statements);
        sd.writeStat(fileName);
        computeOtherStat();
    }

    protected void computeOtherStat() {
        Util stat = new Util(statements);
        System.out.println("number of possible code fragment replace: " + stat.numberOfDiversification());
        System.out.println("number of not possible code fragment replace/add: " + stat.numberOfNotDiversification());
        System.out.println("number of possible code fragment add: " + stat.getAllAdd().size());
        System.out.println("number of possible code fragment delete: " + stat.getAllDelete().size());
    }

    protected void computeCodeFragmentStatistic(String output) {
        StatisticCodeFragment stat = new StatisticCodeFragment(statements);
        try {
            stat.writeStatistic(output);
        } catch (IOException e) {
            Log.error("computeCodeFragmentStatistic ", e);
        }
    }

    protected void writeGoodTransformation(String FileName, List<Transformation> transformations) throws IOException, JSONException {
        List<Transformation> goodTransformation = new ArrayList<Transformation>();
        for (Transformation transformation : transformations) {
            if (transformation.numberOfFailure() == 0) {
                goodTransformation.add(transformation);
            }
        }
        writeTransformation(FileName, goodTransformation);
    }

    protected void writeTransformation(String FileName, List<Transformation> transformations) throws IOException, JSONException {

        BufferedWriter out = new BufferedWriter(new FileWriter(FileName));
        JSONArray obj = new JSONArray();
        for (Transformation transformation : transformations) {
            try {
                obj.put(transformation.toJSONObject());
            } catch (Exception e) {
            }
        }
        out.write(obj.toString());
        out.newLine();
        out.close();
    }

    protected void suicide() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("kill "+pid);
        } catch (Exception e) {
            Log.error("suicide ",e);
        }
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }

    protected static int numberOfCpu() throws InterruptedException, IOException {
        Runtime r = Runtime.getRuntime();

            Process p = r.exec("cat /proc/cpuinfo");
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                if(line.startsWith("processor"))
                    i++;
            }
            reader.close();
        return  i/2;
    }
}
