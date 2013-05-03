package fr.inria.diversify;

import fr.inria.diversify.replace.Diversify;
import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.statement.StatementList;
import fr.inria.diversify.statementProcessor.StatementProcessor;
import fr.inria.diversify.statistic.Statistic;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;


public class Main {
	//public static final String srcfolderstatic = "../camel-2.10.4/camel-core";
//	public static final String srcfolderstatic = "../../workspace/Test";
//	public static final String srcfolderstatic = "../standardLib/src";
//	public static final String srcfolderstatic = "src";
//	public static final String srcfolderstatic = "../statement/src_to_modify";
	
//	public static final String srcgenfolderstatic = "src_modified";
	private StatementList statements;
    private Factory factory;



    public static void main(String[] args) throws Exception {
		Main app = new Main();

    }


	public Main() throws Exception {
        String sourceDirectory = "/Users/Simon/Documents/code/code-sequencing/software/code-sequencing/datasets/dataset1/src/main";
        String classesDirectory = "/Users/Simon/Documents/code/code-sequencing/software/code-sequencing/datasets/dataset1/target/classes";
        String testDirectory =  "/Users/Simon/Documents/code/code-sequencing/software/code-sequencing/datasets/dataset1/target/test-classes/";
        String jacocoFile = "/Users/Simon/Documents/code/code-sequencing/software/code-sequencing/datasets/dataset1/jacoco.exec";
        String statOutputFile = "dataset1Stat";

        initSpoon(new File(sourceDirectory));

        CoverageReport rg = new CoverageReport(classesDirectory,jacocoFile);
        rg.create();

		computeStatistic(statOutputFile);

        Diversify d  = new Diversify(statements, rg, testDirectory);
        d.run(100);
        d.writeTransformation("transformation.json");
    }

    protected void initSpoon(File directory) {
        StandardEnvironment env = new StandardEnvironment();
		env.setComplianceLevel(6); //for jfreechart
		env.setVerbose(false);
		env.setDebug(false);

		DefaultCoreFactory f = new DefaultCoreFactory();
		factory = new Factory(f, env);
		SpoonBuildingManager builder = new SpoonBuildingManager(factory);

			try {
				builder.addInputSource(directory);
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
		Statistic stat = new Statistic(statements);
		 
		try {
			stat.writeSatistic(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
