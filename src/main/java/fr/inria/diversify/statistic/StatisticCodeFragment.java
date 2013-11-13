package fr.inria.diversify.statistic;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentListUtils;
import fr.inria.diversify.codeFragment.Context;
import fr.inria.diversify.codeFragment.InputContext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class  StatisticCodeFragment {
	private CodeFragmentListUtils codeFragments;
	protected static char separator = ';';
    protected static String typeFileSuffix = "_stmt.csv";
    protected static String superTypeFileSuffix = "_superStmt.csv";
    protected static String classFileSuffix = "_classes.csv";
    protected static String packageFileSuffix = "_packages.csv";
    protected static String codeFragmentFileSuffix = "_CodeFragment.csv";
    protected static String contextFileSuffix = "_uniqueContext.csv";
    protected static String uniqueContextFileSuffix = "_uniqueInputContext.csv";
	
	public StatisticCodeFragment(CodeFragmentList codeFragments) {
        this.codeFragments = new CodeFragmentListUtils();
        for(CodeFragment cf : codeFragments)
        this.codeFragments.add(cf);
	}
	
	public void writeStatistic(String fileName) throws IOException {

        writeSummary(new File(fileName+typeFileSuffix), statisticByStatement());
		writeSummary(new File(fileName+classFileSuffix), statisticByClass());
		writeSummary(new File(fileName+packageFileSuffix), statisticByPackage());
        writeSummary(new File(fileName+superTypeFileSuffix), statisticBySuperStatement());
		
		writeStatement(new File(fileName+codeFragmentFileSuffix), codeFragments.getUniqueCodeFragments());
		writeUniqueContext(new File(fileName+contextFileSuffix), codeFragments.getUniqueContext());
		writeUniqueInputContext(new File(fileName+uniqueContextFileSuffix), codeFragments.getUniqueInputContext());
	}
	
	public Map<String,CodeFragmentListUtils> statisticByStatement() {
        Map<String,CodeFragmentListUtils> map = new HashMap<String, CodeFragmentListUtils>();

        map.put("all",codeFragments);
        for (CodeFragment statement : codeFragments.getCodeFragments()) {
            String stmtType = statement.getCodeFragmentType().getSimpleName();
            if(!map.containsKey(stmtType))
                map.put(stmtType,new CodeFragmentListUtils());
            map.get(stmtType).add(statement);
        }
        return map;
    }

    public Map<String,CodeFragmentListUtils> statisticBySuperStatement() {
        Map<String,CodeFragmentListUtils> map = new HashMap<String, CodeFragmentListUtils>();

        map.put("all",codeFragments);
        for (CodeFragment statement : codeFragments.getCodeFragments()) {
            String stmtType = statement.getCodeFragmentSuperType().getSimpleName();
            if(!map.containsKey(stmtType))
                map.put(stmtType,new CodeFragmentListUtils());
            map.get(stmtType).add(statement);
        }
        return map;
    }
	
	public Map<String,CodeFragmentListUtils> statisticByClass() {
		Map<String,CodeFragmentListUtils> map = new HashMap<String, CodeFragmentListUtils>();
		
		map.put("all", codeFragments);
		for (CodeFragment statement : codeFragments.getCodeFragments()) {
            try {
                String stmtType = statement.getSourceClass().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new CodeFragmentListUtils());
                map.get(stmtType).add(statement);
            }catch (Exception e) {

            }


		}
		return map;
	}

	public Map<String,CodeFragmentListUtils> statisticByPackage() {
		Map<String,CodeFragmentListUtils> map = new HashMap<String, CodeFragmentListUtils>();
		
		map.put("all", codeFragments);
		for (CodeFragment statement : codeFragments.getCodeFragments()) {
            try {
                String stmtType = statement.getSourcePackage().getQualifiedName();
                if(!map.containsKey(stmtType))
                    map.put(stmtType,new CodeFragmentListUtils());
                map.get(stmtType).add(statement);
            }   catch (Exception e) {

            }

		}

		return map;
	}

	
	public void writeSummary(File file, Map<String, CodeFragmentListUtils> data) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(getSummaryHeadLine()+"\n");
		
		
		for (String key : data.keySet()) {
            CodeFragmentListUtils stat = data.get(key);
			int popSize = stat.size();
			bw.write(key + separator
					+ stat.size() + separator
					+ stat.getUniqueInputContext().size() + separator
					+ stat.getUniqueOutputContext().size() + separator
					+ stat.getUniqueContext().size() + separator
					+ stat.getUniqueCodeFragments().size() + separator
					+ shannon(stat.getUniqueCodeFragments(), popSize) + separator
					+ simpson(stat.getUniqueCodeFragments(), popSize) + separator
					+ shannon(stat.getUniqueContext(), popSize) + separator
					+ simpson(stat.getUniqueContext(), popSize) +"\n");
		}
		bw.close();
	}

	public void writeUniqueContext(File file, Map<Context,Integer> uniqueContext) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("item"+ separator +"number"+ separator +"size\n");
		
		for (Context key : uniqueContext.keySet()) {
			bw.write(key.equalString() + separator
					+ uniqueContext.get(key) + separator
					+ key.size() + "\n");
		}
		bw.close();
	}
	
	public void writeUniqueInputContext(File file, Map<InputContext,Integer> uniqueInputContext) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("item"+ separator +"number"+ separator +"size\n");
		
		for (InputContext key : uniqueInputContext.keySet()) {
			bw.write(key.equalString() + separator
					+ uniqueInputContext.get(key) + separator
					+ key.size() + "\n");
		}
		bw.close();
	}
	
	public void writeStatement(File file, Map<Integer,Integer> uniqueStatement) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("item"+ separator +"number\n");
		
		for (Integer key : uniqueStatement.keySet()) {
			bw.write(key.toString() + separator
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
		return "item" + separator
				+ "codeFragment" + separator
				+ "uniqueInputContext" + separator
				+ "uniqueOutputContext" + separator
				+ "uniqueContext" + separator
				+ "uniqueStatement" + separator
				+ "shannon_us" + separator
				+ "simpson_us"  + separator
				+ "shannon_uc" + separator
				+ "simpson_uc";
	}
}
