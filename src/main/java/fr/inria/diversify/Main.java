package fr.inria.diversify;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.runtest.ICoverageReport;
import fr.inria.diversify.runtest.NullCoverageReport;
import fr.inria.diversify.statistic.StatisticCodeFragment;

import fr.inria.diversify.transformation.query.AbstractTransformationQuery;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.transformation.query.TransformationQueryT;
import fr.inria.diversify.util.DiversifyProperties;
import org.json.JSONException;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;

import java.util.List;


public class Main {
	private CodeFragmentList statements;

    public static void main(String[] args) throws Exception {
		Main app = new Main(args);
    }

	public Main(String[] args) throws Exception {
        DiversifyProperties prop = new DiversifyProperties(args[0]);

        initSpoon();

//		computeStatistic(cmd.getOptionValue("out"));
        System.out.println("number of statement: " + statements.size());

        runDiversification();
//        computeDiversifyStat("/Users/Simon/Documents/diversify_exp/diversification/result/clojure/tranformation", cmd.getOptionValue("out"), rg);
    }

    protected void runDiversification() throws Exception {
        Diversify d  = new Diversify(initTransformationQuery(), DiversifyProperties.getProperty("project"));

        d.setSourceDirectory(DiversifyProperties.getProperty("src"));

        if(DiversifyProperties.getProperty("clojure").equals("true"))
            d.setClojureTest(true);

        int t = Integer.parseInt(DiversifyProperties.getProperty("timeOut"));
        d.setTimeOut(t);

        int n = Integer.parseInt(DiversifyProperties.getProperty("nbRun"));
        d.run(n);

        d.printResult(DiversifyProperties.getProperty("out"));
    }

    protected AbstractTransformationQuery initTransformationQuery() throws IOException, JSONException {
        ICoverageReport rg = initCoverageReport();

        AbstractTransformationQuery atq = null;

        String transformation = DiversifyProperties.getProperty("transformation");
        if(transformation != null) {
            TransformationParser tf = new TransformationParser(statements);
            List<Transformation> list = tf.parseDir(transformation);
            atq = new TransformationQueryT(list, statements);
        } else {
            atq = new TransformationQuery(rg, statements);
        }
        atq.setType(DiversifyProperties.getProperty("transformationType"));
        int n  = Integer.parseInt(DiversifyProperties.getProperty("transformationSize"));
        atq.setNbTransformation(n);

        return atq;
    }


    protected void initSpoon() {
        String srcDirectory = DiversifyProperties.getProperty("project")+"/"+DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
		env.setComplianceLevel(javaVersion);
		env.setVerbose(true);
		env.setDebug(true);

		DefaultCoreFactory f = new DefaultCoreFactory();
		Factory factory = new Factory(f, env);
		SpoonBuildingManager builder = new SpoonBuildingManager(factory);

        for(String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                builder.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
               System.out.println("sourcepath "+factory.getEnvironment().getSourcePath());
            System.out.println(Thread.currentThread().getContextClassLoader().getClass());

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

    protected void computeDiversifyStat(String dir, String fileName, ICoverageReport cr) throws IOException, JSONException {
//        TransformationParser tf = new TransformationParser(statements);
//        List<Transformation> list = tf.parseDir(dir);
//        System.out.println("nb transformation: "+list.size());
//        List<Transformation> listF = new ArrayList<Transformation>();
//        for(Transformation trans : list) {
//            if(cr.codeFragmentCoverage(trans.getToReplace()) != 0)
//                listF.add(trans);
//
//        }
//        System.out.println("nb transformation2: "+listF.size());
//        StatisticDiversification sd = new StatisticDiversification(listF, statements);
//        sd.writeStat(fileName);

    }

	protected void computeStatistic(String output) {
		StatisticCodeFragment stat = new StatisticCodeFragment(statements);
		 
		try {
			stat.writeStatistic(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    protected ICoverageReport initCoverageReport() throws IOException {
        String project =  DiversifyProperties.getProperty("project");
        String classes = DiversifyProperties.getProperty("classes");
        String jacocoFile = DiversifyProperties.getProperty("jacoco");
        ICoverageReport icr;

        if(jacocoFile != null)
            icr = new CoverageReport(project+"/"+classes,jacocoFile);
        else
            icr = new NullCoverageReport();

        icr.create();
        return  icr;
    }

}
