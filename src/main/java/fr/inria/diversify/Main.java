package fr.inria.diversify;

import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statementProcessor.StatementProcessor;
import fr.inria.diversify.statistic.Statistic;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
	//public static final String srcfolderstatic = "../camel-2.10.4/camel-core";
//	public static final String srcfolderstatic = "../../workspace/Test";
//	public static final String srcfolderstatic = "../standardLib/src";
//	public static final String srcfolderstatic = "src";
//	public static final String srcfolderstatic = "../statement/src_to_modify";
	
//	public static final String srcgenfolderstatic = "src_modified";
	private List<Statement> statements;
    private Factory factory;
    private StandardEnvironment env;


    public static void main(String[] args) {
		String srcfolderstatic = "src/test";
		List<File> files = new ArrayList<File>();
		files.add(new File(srcfolderstatic));
		String output = "test";
		Main app = new Main(files, output);

	}


	public Main(List<File> srcfolders, String output) {
		this.initSpoon(srcfolders);
		System.out.println(statements.size());
//		computeStatistic(output);
		//stat.printStat();
        Statistic stat = new Statistic(statements);
        try {
            printJavaFile("output");
            printJavaFile("output_new");
            printJavaFile("output_old");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i<100; i++) {
//            System.out.println(i);
//            Replace rp = new Replace(statements, stat.allStat().getUniqueStatementList(), factory);
//           try {
//               rp.replace();
//           }   catch (Exception e) {
//               System.out.println("erreur");
//           }
//
//            rp.restore();
//        }
    }

	private void initSpoon(List<File> folderToParse) {
		env = new StandardEnvironment();
		env.setComplianceLevel(6); //for jfreechart
		env.setVerbose(true);
		env.setDebug(true);

		DefaultCoreFactory f = new DefaultCoreFactory();
		factory = new Factory(f, env);
		
		SpoonBuildingManager builder = new SpoonBuildingManager(factory);

		for (File file : folderToParse)
			try {
				builder.addInputSource(file);
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

	protected void computeStatistic(String output) {
		Statistic stat = new Statistic(statements);
		 
		try {
			stat.writeSatistic(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


    public void printJavaFile(String repository) throws IOException {
        ProcessingManager pm = new QueueProcessingManager(factory);
        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));

        pm.addProcessor(processor);
        pm.process();
    }
}
