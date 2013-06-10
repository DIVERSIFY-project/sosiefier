package fr.inria.diversify;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.TransformationParser;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.replace.Diversify;
import fr.inria.diversify.replace.Transformation;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.runtest.ICoverageReport;
import fr.inria.diversify.runtest.NullCoverageReport;
import fr.inria.diversify.statistic.StatisticCodeFragment;
import fr.inria.diversify.statistic.StatisticDiversification;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.json.JSONException;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
	private CodeFragmentList statements;

    public static void main(String[] args) throws Exception {
		Main app = new Main(args);
    }

	public Main(String[] args) throws Exception {
        CommandLineParser parser = new GnuParser();
        CommandLine cmd = parser.parse( commandLineOption(), args);

        String project =  cmd.getOptionValue("project");
        String classes =  cmd.getOptionValue("classes");
        String src =  cmd.getOptionValue("src");
        int nbRun = Integer.parseInt(cmd.getOptionValue("nbRun"));

        initSpoon(project+"/"+src);
        ICoverageReport rg = getCoverageReport(cmd.getOptionValue("jacoco"),project+"/"+classes);


//		computeStatistic(cmd.getOptionValue("out"));
        System.out.println("number of statement: " + statements.size());
//        System.out.println("number of undiversify Statement: " + (new Util(statements)).numberOfNotDiversification());
//        System.out.println("number of diversification: " + (new Util(statements)).numberOfDiversification());


        Diversify d  = new Diversify(statements, rg, cmd.getOptionValue("project"), src ,"output_diversify");
        if(cmd.getOptionValue("clojure") != null && cmd.getOptionValue("clojure").equals("true"))
            d.setClojureTest(true);
        d.run(nbRun);
        d.printResult(cmd.getOptionValue("out"));
        computeDiversifyStat("result2/result/", cmd.getOptionValue("out"), rg);
    }

    protected void initSpoon(String directory) {
        StandardEnvironment env = new StandardEnvironment();
		env.setComplianceLevel(6); //for jfreechart
		env.setVerbose(true);
		env.setDebug(true);

		DefaultCoreFactory f = new DefaultCoreFactory();
		Factory factory = new Factory(f, env);
		SpoonBuildingManager builder = new SpoonBuildingManager(factory);
        for(String dir : directory.split(System.getProperty("path.separator")))
			try {
				builder.addInputSource(new File(dir));
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
        TransformationParser tf = new TransformationParser(statements);
        List<Transformation> list = tf.parseDir(dir);
        System.out.println("nb transformation: "+list.size());
        List<Transformation> listF = new ArrayList<Transformation>();
        for(Transformation trans : list) {
            if(cr.codeFragmentCoverage(trans.getToReplace()) != 0)
                listF.add(trans);

        }
        System.out.println("nb transformation2: "+listF.size());
        StatisticDiversification sd = new StatisticDiversification(listF, statements);
        sd.writeStat(fileName);

    }

	protected void computeStatistic(String output) {
		StatisticCodeFragment stat = new StatisticCodeFragment(statements);
		 
		try {
			stat.writeStatistic(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    protected ICoverageReport getCoverageReport(String jacocoFile, String classes) throws IOException {
        ICoverageReport icr;

        if(jacocoFile != null)
            icr = new CoverageReport(classes,jacocoFile);
        else
            icr = new NullCoverageReport();

        System.out.println("jacoco " + icr.getClass());
        icr.create();
        return  icr;
    }

    protected Options commandLineOption() {
        Options options = new Options();
        options.addOption("project", true, "the project directory");
        options.addOption("src", true, "sources directory");
        options.addOption("classes", true, "classes directory");
        options.addOption("nbRun", true, "number of run");
        options.addOption("jacoco", true, "jacoco file for test coverage");
        options.addOption("clojure", true, "");
        options.addOption("out", true, "prefix for output files");
        return  options;
    }
}
