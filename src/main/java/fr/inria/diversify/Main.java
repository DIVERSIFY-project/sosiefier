package fr.inria.diversify;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.replace.Diversify;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.statistic.StatisticCodeFragment;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;


public class Main {
	private CodeFragmentList statements;

    public static void main(String[] args) throws Exception {
		Main app = new Main(args);
    }

	public Main(String[] args) throws Exception {
        CommandLineParser parser = new GnuParser();
        CommandLine cmd = parser.parse( commandLineOption(), args);

        initSpoon(cmd.getOptionValue("src")+"/src/main/");

//        TransformationParser tp = new TransformationParser(statements);
//        tp.parseDir("result");


        CoverageReport rg = new CoverageReport(cmd.getOptionValue("src")+"/target/classes",cmd.getOptionValue("jacoco"));
        rg.create();

		computeStatistic(cmd.getOptionValue("out"));

        int nbRun = Integer.parseInt(cmd.getOptionValue("nbRun"));
        Diversify d  = new Diversify(statements, rg, cmd.getOptionValue("src"), "output_diversify");
        for(int i = 0; i < 10; i++) {
            d.run(nbRun/10);
            d.printResult(cmd.getOptionValue("out")+i);
        }
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
        System.out.println("number of statements: "+statements.size());
	}

	protected void computeStatistic(String output) {
		StatisticCodeFragment stat = new StatisticCodeFragment(statements);
		 
		try {
			stat.writeStatistic(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    protected Options commandLineOption() {
        Options options = new Options();
        options.addOption("src", true, "sources directory");
        options.addOption("nbRun", true, "number of run");
        options.addOption("jacoco", true, "jacoco file for test coverage");
        options.addOption("out", true, "prefix for output files");
        return  options;
    }
}
