package fr.inria.diversify;

import fr.inria.diversify.statement.Statement;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA. User: Simon Date: 4/17/13 Time: 11:33 AM To
 * change this template use File | Settings | File Templates.
 */
public class Main {
	//public static final String srcfolderstatic = "../camel-2.10.4/camel-core";
//	public static final String srcfolderstatic = "../../workspace/Test";
//	public static final String srcfolderstatic = "../standardLib/src";
//	public static final String srcfolderstatic = "src";
//	public static final String srcfolderstatic = "../statement/src_to_modify";
	
//	public static final String srcgenfolderstatic = "src_modified";
	private List<Statement> statements;
	

	public static void main(String[] args) {
		String srcfolderstatic = "../../workspace/Test";
		List<File> files = new ArrayList<File>();
		files.add(new File(srcfolderstatic));
		String output = "/Users/Simon/Documents/code/diversify-statements/jfreechart";
		Main app = new Main(files, output);
	}


	public Main(List<File> srcfolders, String output) {
		this.initSpoon(srcfolders);
		System.out.println(statements.size());
		//computeStatistic(output);
		//stat.printStat();
        test();
	}

	private void initSpoon(List<File> folderToParse) {
		StandardEnvironment env = new StandardEnvironment();
		env.setComplianceLevel(6); //for jfreechart
		env.setVerbose(true);
		env.setDebug(true);

		DefaultCoreFactory f = new DefaultCoreFactory();
		Factory factory = new Factory(f, env);
		
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
	
	private void test() {
		Random r = new Random();
		int i = r.nextInt(statements.size());
        for (Statement stmt: statements) {
            stmt.getInputContext().toString().equals("[b, java.lang.Double test.A#cc]") ;
        }
		Statement[] stmt = statements.toArray(new Statement[statements.size()]);
        for (Statement statement1 : stmt) {
		for (Statement statement2 : stmt) {
			if(statement1.isReplace(statement2) && statement2 != statement1) {
				System.out.println("\n____________________________________________________");
				System.out.println(statement1+"\n"+statement1.getStatementType().getSimpleName());
				System.out.println("\nreplaced by:");
				System.out.println(statement2+"\n"+statement2.getStatementType().getSimpleName());
				try {
                    statement1.replace(statement2);
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			}
        }
		}
	}
}
