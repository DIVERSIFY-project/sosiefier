package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Context;
import fr.inria.diversify.codeFragment.InputContext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Statistic {

	private CodeFragmentList statements;
	protected char separtor = ';';
	
	public Statistic(CodeFragmentList statements) {
		this.statements = statements;
	}
	
	public void writeSatistic(String fileName) throws IOException {


        writeSummary(new File(fileName+"_codeFragment.csv"), statisticByStatement());
		writeSummary(new File(fileName+"_classes.csv"), statisticByClass());
		writeSummary(new File(fileName+"_packages.csv"), statisticByPackage());
		
		writeStatement(new File(fileName+"_CodeFragment.csv"), statements.getUniqueCodeFragments());
		writeUniqueContext(new File(fileName+"_uniqueContext.csv"), statements.getUniqueContext());
		writeUniqueInputContext(new File(fileName+"_uniqueInputContext.csv"), statements.getUniqueInputContext());
	}
	
	public Map<String,CodeFragmentList> statisticByStatement() {
		Map<String,CodeFragmentList> map = new HashMap<String, CodeFragmentList>();
		
		map.put("all",statements);
		for (CodeFragment statement : statements.getCodeFragments()) {
			String stmtType = statement.getCodeFragmentType().getName();
			if(!map.containsKey(stmtType))
				map.put(stmtType,new CodeFragmentList());
			map.get(stmtType).add(statement);
		}
		return map;
	}
	
	public Map<String,CodeFragmentList> statisticByClass() {
		Map<String,CodeFragmentList> map = new HashMap<String, CodeFragmentList>();
		
		map.put("all", statements);
		for (CodeFragment statement : statements.getCodeFragments()) {
            try {
                String stmtType = statement.getSourceClass().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new CodeFragmentList());
                map.get(stmtType).add(statement);
            }catch (Exception e) {

            }


		}
		return map;
	}

	public Map<String,CodeFragmentList> statisticByPackage() {
		Map<String,CodeFragmentList> map = new HashMap<String, CodeFragmentList>();
		
		map.put("all", statements);
		for (CodeFragment statement : statements.getCodeFragments()) {
            try {
                String stmtType = statement.getSourcePackage().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new CodeFragmentList());
                map.get(stmtType).add(statement);
            }   catch (Exception e) {

            }

		}

//        StatementGraph g = new StatementGraph();
//        g.buildGraph(map.get("org.jfree.data.jdbc").idToStatement.values());
//        g.displayGraph();

		return map;
	}

	
	public void writeSummary(File file, Map<String, CodeFragmentList> data) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(getSummaryHeadLine()+"\n");
		
		
		for (String key : data.keySet()) {
            CodeFragmentList stat = data.get(key);
			int popSize = stat.size();
			bw.write(key + separtor 
					+ stat.size() + separtor
					+ stat.getUniqueInputContext().size() + separtor
					+ stat.getUniqueOutputContext().size() + separtor
					+ stat.getUniqueContext().size() + separtor
					+ stat.getUniqueCodeFragments().size() + separtor
					+ shannon(stat.getUniqueCodeFragments(), popSize) + separtor
					+ simpson(stat.getUniqueCodeFragments(), popSize) + separtor
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
//        System.out.println("number of unique codeFragment: "+uniqueStatment.size());
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
				+ "codeFragment" + separtor
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
