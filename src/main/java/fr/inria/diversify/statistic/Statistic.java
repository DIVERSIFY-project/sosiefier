package fr.inria.diversify.statistic;

import fr.inria.diversify.statement.Context;
import fr.inria.diversify.statement.InputContext;
import fr.inria.diversify.statement.Statement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistic {

	private List<Statement> statements;
	private ComputeStatistic allStat;
	protected char separtor = ';';
	
	public Statistic(List<Statement> statements) {
		this.statements = statements;
	}
	
	public void writeSatistic(String fileName) throws IOException {


        writeSummary(new File(fileName+"_statements.csv"), statisticByStatement());
		writeSummary(new File(fileName+"_classes.csv"), statisticByClass());
		writeSummary(new File(fileName+"_packages.csv"), statisticByPackage());
		
		writeStatement(new File(fileName+"_uniqueStatement.csv"), allStat().getUniqueStatment());
		writeUniqueContext(new File(fileName+"_uniqueContext.csv"), allStat().getUniqueContext());
		writeUniqueInputContext(new File(fileName+"_uniqueInputContext.csv"), allStat().getUniqueInputContext());
	}
	
	public Map<String,ComputeStatistic> statisticByStatement() {
		Map<String,ComputeStatistic> map = new HashMap<String, ComputeStatistic>();
		
		map.put("all", allStat());
		for (Statement statement : statements) {
			String stmtType = statement.getStatementType().getName();
			if(!map.containsKey(stmtType))
				map.put(stmtType,new ComputeStatistic());
			map.get(stmtType).addStatement(statement);
		}
		return map;
	}
	
	public Map<String,ComputeStatistic> statisticByClass() {
		Map<String,ComputeStatistic> map = new HashMap<String, ComputeStatistic>();
		
		map.put("all", allStat());
		for (Statement statement : statements) {
            try {
                String stmtType = statement.getSourceClass().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new ComputeStatistic());
                map.get(stmtType).addStatement(statement);
            }catch (Exception e) {

            }


		}
		return map;
	}

	public Map<String,ComputeStatistic> statisticByPackage() {
		Map<String,ComputeStatistic> map = new HashMap<String, ComputeStatistic>();
		
		map.put("all", allStat());
		for (Statement statement : statements) {
            try {
                String stmtType = statement.getSourcePackage().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new ComputeStatistic());
                map.get(stmtType).addStatement(statement);
            }   catch (Exception e) {

            }

		}

//        StatementGraph g = new StatementGraph();
//        g.buildGraph(map.get("org.jfree.data.jdbc").idToStatement.values());
//        g.displayGraph();

		return map;
	}
	
	public ComputeStatistic allStat() {
		if(allStat == null)
			allStat = new ComputeStatistic(statements);
        return allStat;
	}
	
	public void writeSummary(File file, Map<String, ComputeStatistic> data) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(getSummaryHeadLine()+"\n");
		
		
		for (String key : data.keySet()) {
			ComputeStatistic stat = data.get(key);
			int popSize = stat.getNumberOfStatements();
			bw.write(key + separtor 
					+ stat.getNumberOfStatements() + separtor 
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
