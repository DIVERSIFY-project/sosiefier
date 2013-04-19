package fr.inria.diversify;

import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statementProcessor.StatementProcessor;

/**
 * Created with IntelliJ IDEA. User: Simon Date: 4/17/13 Time: 11:33 AM To
 * change this template use File | Settings | File Templates.
 */
public class Main {
	public static final String srcfolderstatic = "../statement/src_to_modify";
	public static final String srcgenfolderstatic = "src_modified";
	private List<Statement> statements;
	protected Statistics stat;

	public static void main(String[] args) {

		List<File> files = new ArrayList<File>();
		files.add(new File(srcfolderstatic));

		Main app = new Main(files, new File(srcgenfolderstatic));
	}


	public Main(List<File> srcfolders, File srcgenfolder) {
		this.initSpoon(srcfolders);
		computeStatistic();
		stat.printStat();
	}

	private void initSpoon(List<File> folderToParse) {
		StandardEnvironment env = new StandardEnvironment();

		env.setVerbose(true);
		env.setDebug(true);

		DefaultCoreFactory f = new DefaultCoreFactory();
		Factory factory = new Factory(f, env);

		SpoonBuildingManager builder = new SpoonBuildingManager(factory);

		for (File file : folderToParse) {
			try {
				builder.addInputSource(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			builder.build();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ProcessingManager pm = new QueueProcessingManager(factory);
		StatementProcessor processor = new StatementProcessor();
//		 TestProcessor processor = new TestProcessor();//*******************************

		pm.addProcessor(processor);
		pm.process();
		
		statements = processor.getStatements();
	}

	protected void computeStatistic() {
		stat = new Statistics(statements);
	}
	
	private void test() {
		Random r = new Random();
		int i = r.nextInt(statements.size());
		Statement[] stmt = statements.toArray(new Statement[statements.size()]);
		
		for (Statement statement : stmt) {
			if(stmt[i].isReplace(statement) && statement != stmt[i]) {
				System.out.println("\n____________________________________________________");
				System.out.println(stmt[i]);
				System.out.println("\nreplaced by:");
				System.out.println(statement);
				try {
					stmt[i].replace(statement);
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			}
		}
	}
}
