package fr.inria.diversify.statistic;

import fr.inria.diversify.statement.Context;
import fr.inria.diversify.statement.InputContext;
import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statement.StatementList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Statistic {

	private StatementList statements;
	protected char separtor = ';';
	
	public Statistic(StatementList statements) {
		this.statements = statements;
	}
	
	public void writeSatistic(String fileName) throws IOException {


        writeSummary(new File(fileName+"_statements.csv"), statisticByStatement());
		writeSummary(new File(fileName+"_classes.csv"), statisticByClass());
		writeSummary(new File(fileName+"_packages.csv"), statisticByPackage());
		
		writeStatement(new File(fileName+"_uniqueStatement.csv"), statements.getUniqueStatment());
		writeUniqueContext(new File(fileName+"_uniqueContext.csv"), statements.getUniqueContext());
		writeUniqueInputContext(new File(fileName+"_uniqueInputContext.csv"), statements.getUniqueInputContext());
	}
	
	public Map<String,StatementList> statisticByStatement() {
		Map<String,StatementList> map = new HashMap<String, StatementList>();
		
		map.put("all",statements);
		for (Statement statement : statements.getStatements()) {
			String stmtType = statement.getStatementType().getName();
			if(!map.containsKey(stmtType))
				map.put(stmtType,new StatementList());
			map.get(stmtType).add(statement);
		}
		return map;
	}
	
	public Map<String,StatementList> statisticByClass() {
		Map<String,StatementList> map = new HashMap<String, StatementList>();
		
		map.put("all", statements);
		for (Statement statement : statements.getStatements()) {
            try {
                String stmtType = statement.getSourceClass().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new StatementList());
                map.get(stmtType).add(statement);
            }catch (Exception e) {

            }


		}
		return map;
	}

	public Map<String,StatementList> statisticByPackage() {
		Map<String,StatementList> map = new HashMap<String, StatementList>();
		
		map.put("all", statements);
		for (Statement statement : statements.getStatements()) {
            try {
                String stmtType = statement.getSourcePackage().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new StatementList());
                map.get(stmtType).add(statement);
            }   catch (Exception e) {

            }

		}

//        StatementGraph g = new StatementGraph();
//        g.buildGraph(map.get("org.jfree.data.jdbc").idToStatement.values());
//        g.displayGraph();

		return map;
	}

	
	public void writeSummary(File file, Map<String, StatementList> data) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(getSummaryHeadLine()+"\n");
		
		
		for (String key : data.keySet()) {
            StatementList stat = data.get(key);
			int popSize = stat.size();
			bw.write(key + separtor 
					+ stat.size() + separtor
					+ stat.getUniqueInputContext().size() + separtor
					+ stat.getUniqueOutputContext().size() + separtor
					+ stat.getUniqueContext().size() + separtor
					+ stat.getUniqueStatment().size() + separtor
					+ shannon(stat.getUniqueStatment(), popSize) + separtor
					+ simpson(stat.getUniqueStatment(), popSize) + separtor
					+ shannon(stat.getUniqueContext(), popSize) + separtor
					+ simpson(stat.getUniqueContext(), popSize) +"\n");
		}
		bw.close();
	}

	public void writeUniqueContext(File file, Map<Context,Integer> uniqueContext) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("item"+separtor+"number"+separtor+"size\n");
		
		for (Context key : uniqueContext.keySet()) {
			bw.write(key.equalString() + separtor 
					+ uniqueContext.get(key) + separtor
					+ key.size() + "\n");
		}
		bw.close();
	}
	
	public void writeUniqueInputContext(File file, Map<InputContext,Integer> uniqueInputContext) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("item"+separtor+"number"+separtor+"size\n");
		
		for (InputContext key : uniqueInputContext.keySet()) {
			bw.write(key.equalString() + separtor 
					+ uniqueInputContext.get(key) + separtor
					+ key.size() + "\n");
		}
		bw.close();
	}
	
	public void writeStatement(File file, Map<Integer,Integer> uniqueStatement) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("item"+separtor+"number\n");
		
		for (Integer key : uniqueStatement.keySet()) {
			bw.write(key.toString() + separtor 
					+  uniqueStatement.get(key).toString()  + "\n");
					//+ key.size() + "\n");
		}
		bw.close();
	}
	
	protected double shannon(Map<?,Integer> data, int popSize) {
		double shannon = 0;
		for (Object key : data.keySet()) {
			double p = (double) data.get(key) / (double) popSize;
			shannon = shannon + (p * Math.log(p));
		}
		return - shannon;
	}
	
	protected double simpson(Map<?,Integer> data, int popSize) {
		double simpson = 0;
		for (Object key : data.keySet()) {
			double p = (double) data.get(key) / (double)popSize;
			simpson = simpson + p * p;
		}
		return simpson;
	}

//    public void printStat(){
//        System.out.println("--------------Statistics--------------");
//        System.out.println("number of statements: "+numberOfStatements);
//        System.out.println("number of unique inputContext: "+uniqueInputContext.size());
//        System.out.println("number of unique outputContext: "+uniqueOutputContext.size());
//        System.out.println("number of unique context: "+uniqueContext.size());
//        System.out.println("number of unique statement: "+uniqueStatment.size());
//
//        System.out.println("\nOutputContext:");
//        for (InputContext ic : uniqueInputContext.keySet())
//            System.out.println(ic.equalString()+ ": "+uniqueInputContext.get(ic));
//
//        System.out.println("\nInputContext:");
//        for (CtTypeReference<?> ic : uniqueOutputContext.keySet())
//            System.out.println(ic+ ": "+uniqueOutputContext.get(ic));
//
//
//        System.out.println("\nContext:");
//        for (Context ic : uniqueContext.keySet())
//            System.out.println(ic.equalString()+": "+uniqueContext.get(ic));
//
//        System.out.println("\nStatement:");
//        for (Integer ic : uniqueStatment.keySet())
//            System.out.println(idToStatement.get(ic).equalString()+"\n: "+uniqueStatment.get(ic));
//    }

	protected String getSummaryHeadLine() {
		return "item" +separtor 
				+ "statement" + separtor 
				+ "uniqueInputContext" + separtor
				+ "uniqueOutputContext" + separtor
				+ "uniqueContext" + separtor
				+ "uniqueStatement" + separtor
				+ "shannon_us" + separtor
				+ "simpson_us"  + separtor
				+ "shannon_uc" + separtor
				+ "simpson_uc";
	}
}
