package fr.inria.diversify;

import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.coverage.CoverageReport;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.MultiCoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.diversification.Builder;
import fr.inria.diversify.diversification.Diversify;
import fr.inria.diversify.diversification.Sosie;
import fr.inria.diversify.diversification.TestSosie;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQuery;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQueryFromList;
import fr.inria.diversify.transformation.query.bytecode.ByteCodeTransformationQuery;
import fr.inria.diversify.statistic.CrossValidation;
import fr.inria.diversify.statistic.StatisticCodeFragment;
import fr.inria.diversify.statistic.StatisticDiversification;
import fr.inria.diversify.statistic.Util;
import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.TransformationsWriter;
import fr.inria.diversify.transformation.query.ITransformationQuery;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import org.json.JSONException;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtSimpleType;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 9/11/13
 * Time: 11:41 AM
 */
public class DiversifyMain {
    private CodeFragmentList codeFragments;

    public DiversifyMain(String propertiesFile) throws Exception {
        new DiversifyProperties(propertiesFile);

        initLogLevel();
        initSpoon();
        Log.info("number of statement: " + codeFragments.size());


        if (DiversifyProperties.getProperty("sosie").equals("true"))
            buildSosie();
        else if (DiversifyProperties.getProperty("sosieOnMultiProject").equals("true"))
            sosieOnMultiProject();
        else
            runDiversification();

        if (DiversifyProperties.getProperty("stat").equals("true")) {
            computeStatistic();
        }
    }

    protected void buildSosie() throws Exception {
        Sosie d = new Sosie(DiversifyProperties.getProperty("project"));
        initAndRunBuilder(d);
    }

    protected void runDiversification() throws Exception {
        Diversify d = null;
        if(DiversifyProperties.getProperty("transformation.level").equals("bytecode"))
            d = new Diversify( DiversifyProperties.getProperty("project"),DiversifyProperties.getProperty("classes"));
        else
            d = new Diversify( DiversifyProperties.getProperty("project"),DiversifyProperties.getProperty("src"));
        String git = DiversifyProperties.getProperty("gitRepository");
        if (!git.equals("")) {
            GitUtil.initGit(git);
        }
        initAndRunBuilder(d);
        d.setTransformationQuery(initTransformationQuery());
        d.printResult(DiversifyProperties.getProperty("result"), git + "/diversify-exp");
    }

    protected void sosieOnMultiProject() throws Exception {
        TestSosie d = new TestSosie(initTransformationQuery(), DiversifyProperties.getProperty("project"));

        List<String> list = new ArrayList<String>();
        for (String mvn : DiversifyProperties.getProperty("mavenProjects").split(System.getProperty("path.separator")))
            list.add(mvn);
        d.setMavenProject(list);

        initAndRunBuilder(d);
    }

    protected void initAndRunBuilder(Builder builder) throws Exception {
//        builder.setSourceDirectory(DiversifyProperties.getProperty("src"));

        int t = Integer.parseInt(DiversifyProperties.getProperty("timeOut"));
        if (t == -1)
            builder.initTimeOut();
        else
            builder.setTimeOut(t);

        builder.setTmpDirectory(DiversifyProperties.getProperty("outputDir"));

        ITransformationQuery query = initTransformationQuery();
        builder.setTransformationQuery(query);

        if (DiversifyProperties.getProperty("clojure").equals("true"))
            builder.setClojureTest(true);

        builder.setNewPomFile(DiversifyProperties.getProperty("newPomFile"));

        //TODO refactor
        if (DiversifyProperties.getProperty("nbRun").equals("all")) {
            if(DiversifyProperties.getProperty("transformation.directory") != null)
                builder.run(1000);
            Util util = new Util(codeFragments);
            if (DiversifyProperties.getProperty("transformation.type").equals("replace"))
                builder.run(util.getAllReplace());
            if (DiversifyProperties.getProperty("transformation.type").equals("add"))
                builder.run(util.getAllAdd());
            if (DiversifyProperties.getProperty("transformation.type").equals("delete"))
                builder.run(util.getAllDelete());
        } else if (DiversifyProperties.getProperty("transformation.type").equals("stupid")) {
            int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));
            Util util = new Util(codeFragments);
            builder.run(util.getStupidTransformation(n, (ASTTransformationQuery)query));
        }
        else
        {
            int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));
            builder.run(n);
        }
    }

    protected ITransformationQuery initTransformationQuery() throws IOException, JSONException, ClassNotFoundException, NotFoundException {
        ICoverageReport rg = initCoverageReport();

        ITransformationQuery atq;

        String transformation = DiversifyProperties.getProperty("transformation.directory");
        if (transformation != null) {
            TransformationParser tf = new TransformationParser(codeFragments);
            List<ITransformation> list = tf.parseDir(transformation);
            atq = new ASTTransformationQueryFromList(list, rg, codeFragments);
        } else {
            Class cl = Class.forName(DiversifyProperties.getProperty("CodeFragmentClass"));
            atq = new ASTTransformationQuery(rg, codeFragments,cl);
        }

        if(DiversifyProperties.getProperty("transformation.level").equals("bytecode"))
            atq = new ByteCodeTransformationQuery(allCtMethod(),rg);

        atq.setType(DiversifyProperties.getProperty("transformation.type"));
        int n = Integer.parseInt(DiversifyProperties.getProperty("transformation.size"));
        atq.setNbTransformation(n);

        return atq;
    }

    private List<CtMethod> allCtMethod() throws NotFoundException {
        List<CtMethod> methods = new ArrayList<CtMethod>();
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes"));
        for (CtSimpleType cl: codeFragments.getAllClasses()) {
            try {
                CtClass cc = pool.get(cl.getQualifiedName());
                for(CtMethod method : cc.getDeclaredMethods())
                    if(!method.isEmpty()) {
                        methods.add(method);
                    }
            }  catch (Exception e) {
                Log.error("error in allCtMethod",e);
            }

        }
        return methods;
    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
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
                Log.error("error in initSpoon", e);
            }
        try {
            builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ProcessingManager pm = new QueueProcessingManager(factory);
        Class classz = Class.forName(DiversifyProperties.getProperty("processor"));
        AbstractCodeFragmentProcessor processor =  (AbstractCodeFragmentProcessor)classz.newInstance();
        pm.addProcessor(processor);
        pm.process();

        codeFragments = processor.getCodeFragments();
    }

    protected ICoverageReport initCoverageReport() throws IOException {
        ICoverageReport icr;
        String jacocoFile = DiversifyProperties.getProperty("jacoco");
        String classes;
        if (DiversifyProperties.getProperty("jacoco.classes") != null)
            classes = DiversifyProperties.getProperty("jacoco.classes");
        else
            classes = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes");

        if (jacocoFile != null) {
            File file = new File(jacocoFile);
            if (file.isDirectory())
                icr = new MultiCoverageReport(classes, file);
            else
                icr = new CoverageReport(classes, file);
        } else
            icr = new NullCoverageReport();

        icr.create();
        return icr;
    }

    protected void computeStatistic() throws IOException, JSONException, InterruptedException {
        String out = DiversifyProperties.getProperty("result");
        computeCodeFragmentStatistic(out);

        String transDir = DiversifyProperties.getProperty("transformation.directory");
        if (transDir != null) {
            computeDiversifyStat(transDir, out);
        }
        computeOtherStat();
    }

    protected void computeDiversifyStat(String transDir, String fileName) throws IOException, JSONException, InterruptedException {
        TransformationParser tf = new TransformationParser(codeFragments);
        List<ITransformation> transformations = tf.parseDir(transDir);
        TransformationsWriter write = new TransformationsWriter(transformations, fileName);

        String name = write.writeAllTransformation(null);
        statForR(name);
        for(String type : getAllTransformationType(transformations)) {
            Log.debug("all transformation for: "+type);
            name = write.writeAllTransformation(type);
            statForR(name);
        }

        name = write.writeGoodTransformation(null);
        statForR(name);
        for(String type : getAllTransformationType(transformations)) {
            Log.debug("good transformation for: "+type);
            name = write.writeGoodTransformation(type);
            statForR(name);
        }

        StatisticDiversification sd = new StatisticDiversification(transformations, codeFragments);
        sd.writeStat(fileName);
    }

    protected void statForR(String fileName) throws IOException, JSONException {
        TransformationParser tf = new TransformationParser(codeFragments);
        Log.debug("parse fileName: {}",fileName);

        List<ITransformation> transformations = tf.parseFile(new File(fileName));
        if(transformations.isEmpty())
            return;

        Set<ITransformation> set = new HashSet<ITransformation>(tf.parseFile(new File(fileName)));
        Log.debug("number of transformation: {}",transformations.size());
        Log.debug("number of unique transformation: {}",set.size());

        StatisticDiversification sd = new StatisticDiversification(set, codeFragments);
        String name = fileName.split(".json")[0];
        sd.writeStat(name);

        CrossValidation cv = new CrossValidation(transformations,10);
        cv.write(name+"_crossValidation.csv");
    }

    protected void computeOtherStat() throws InterruptedException {
        Util stat = new Util(codeFragments);
//        System.out.println("number of possible code fragment replace: " + stat.numberOfDiversification());
        try {
            System.out.println("number of not possible code fragment replace/add: " + stat.numberOfNotDiversification());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("number of possible code fragment replace: "+ stat.getAllReplace().size());
        System.out.println("number of possible code fragment add: " + stat.getAllAdd().size());
        System.out.println("number of possible code fragment delete: " + stat.getAllDelete().size());
    }

    protected void computeCodeFragmentStatistic(String output) {
        StatisticCodeFragment stat = new StatisticCodeFragment(codeFragments);
        try {
            stat.writeStatistic(output);
        } catch (IOException e) {
            Log.error("computeCodeFragmentStatistic ", e);
        }
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }

    protected Set<String> getAllTransformationType(List<ITransformation> transformations) {
        Set<String> types = new HashSet<String>();
        for (ITransformation t : transformations)
            types.add(t.getType());
        return types;
    }
}