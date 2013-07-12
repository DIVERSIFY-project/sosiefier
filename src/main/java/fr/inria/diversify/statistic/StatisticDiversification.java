package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.transformation.Replace;
import fr.inria.diversify.transformation.Transformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 5/7/13
 * Time: 8:48 AM
 */
public class StatisticDiversification {
    protected static char separator = ';';
//    protected static String classFileSuffix = "_diversification_class.csv";
//    protected static String statementFileSuffix = "_diversification_statement.csv";
    protected static String detailFileSuffix = "_diversification_detail.csv";
    protected static String allTransformationFileSuffix = "_diversification_allTransformation.csv";

    protected List<Transformation> transformations;
    protected int numberOfFailureMax;
    protected  CodeFragmentList codeFragmentList;

    public StatisticDiversification(List<Transformation> transformations, CodeFragmentList codeFragmentList) {
        this.transformations = transformations;
        this.numberOfFailureMax = 0;
        this.codeFragmentList = codeFragmentList;
        for(Transformation t : transformations)
            this.numberOfFailureMax = Math.max(this.numberOfFailureMax, t.numberOfFailure());
        System.out.println("max failure: "+numberOfFailureMax);
    }

    public StatisticDiversification() {
        this.transformations = new ArrayList<Transformation>();
        this.numberOfFailureMax = 0;
    }

    public void addTransformation(Transformation t) {
        transformations.add(t);
    }

    public void writeStat(String output) {
        try {
            writeDetail(output+detailFileSuffix);
            writeAllPossibleTransformation(output+allTransformationFileSuffix);
//            write(statByClass(), output+classFileSuffix);
//            write(statByType(), output+statementFileSuffix);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Map<String, Map<Integer,Integer>> statByClass(){
        Map<String, Map<Integer,Integer>> map = new HashMap<String, Map<Integer,Integer>>();

//        for(Transformation trans : transformations) {
//            try {
//            String key = trans.getSourceClass().getQualifiedName();
//            if(!map.containsKey(key)) {
//                Map<Integer,Integer> list = new HashMap<Integer,Integer>();
//                for(int i = -1; i <= numberOfFailureMax; i++)
//                    list.put(i, 0);
//                map.put(key, list);
//            }
//            int n =  map.get(key).get(trans.numberOfFailure());
//            map.get(key).put(trans.numberOfFailure(),n + 1);
//            } catch (Exception e) {}
//        }
        return  map;
    }

    protected Map<String, Map<Integer,Integer>> statByType(){
        Map<String, Map<Integer,Integer>> map = new HashMap<String, Map<Integer,Integer>>();

//        for(Transformation trans : transformations) {
//            try {
//            String key = trans.getCodeFragmentType().getSimpleName();
//            if(!map.containsKey(key)) {
//                Map<Integer,Integer> list = new HashMap<Integer,Integer>();
//                for(int i = -1; i <= numberOfFailureMax; i++)
//                    list.put(i,0);
//                map.put(key, list);
//            }
//            int n =  map.get(key).get(trans.numberOfFailure());
//            map.get(key).put(trans.numberOfFailure(),n + 1);
//            } catch (Exception e) {}
//        }
        return  map;
    }

    protected void write(Map<String, Map<Integer,Integer>> result, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("item");
        for (int i = -1; i <= numberOfFailureMax; i++)
            bw.write(separator+""+i);
        bw.write("\n");

        for(String key : result.keySet()) {
            bw.write(key);
            for (int i = -1; i <= numberOfFailureMax; i++)
                bw.write(separator+""+result.get(key).get(i));
            bw.write("\n");
        }
        bw.close();
    }

    protected void writeAllPossibleTransformation(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        Util util = new Util(codeFragmentList);

        bw.write("stmtClass"+separator+"stmtPackage"+separator+"stmtInputContextSize"+separator+"stmtType"+separator+"nbCandidate"+separator+"nbDiversification\n");
        for (CodeFragment cf1 : codeFragmentList.getCodeFragments()) {
//            long nb = 0;
            BigInteger nb = new BigInteger("0");
            StringBuffer sb = new StringBuffer();
            try {

            List<CodeFragment> candidate = util.findCandidate(cf1);
            for (CodeFragment cf2 : candidate) {
//                nb = nb + util.getNumberOfVarMapping(cf1, cf2);
                BigInteger tmp = new BigInteger(util.getNumberOfVarMapping(cf1, cf2)+"");
                nb = nb.add(tmp);
            }
           sb.append(cf1.getSourceClass().getQualifiedName());
                sb.append(separator);

                sb.append(cf1.getSourcePackage().getQualifiedName());
                sb.append(separator);

                sb.append(cf1.getInputContext().size()+"");
                sb.append(separator);

                sb.append(cf1.getCodeFragmentType().getSimpleName());
                sb.append(separator);

                sb.append(candidate.size());
                sb.append(separator);

                sb.append(nb);
                sb.append("\n");
            bw.write(sb.toString());
            } catch (Exception e) {}
        }

    }

    protected void writeDetail(String fileName) throws IOException {
//        FileWriter fw = new FileWriter(fileName);
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("toReplaceType"+separator+"replacedByType"+separator+
//                "toReplaceSize"+separator+"replacedBySize"+separator+
//                "toReplaceClass"+separator+"replacedByClass"+separator+
//                "toReplacePackage"+separator+"replacedByPackage"+separator+
//                "toReplaceInputContextSize"+separator+"replacedByInputContextSize"+separator+
//                "toReplaceInputContextOnlyPrimitive"+separator+"replacedByInputContextOnlyPrimitive"+separator+
//                "failure");
//        bw.write("\n");
//
//        for(Transformation transs : transformations) {
//            Replace trans = (Replace)transs;
//            StringBuffer sb = new StringBuffer();
//            try {
//            sb.append(trans.getToReplace().getCodeFragmentType().getSimpleName());
//            sb.append(separator);
//            sb.append(trans.getReplaceBy().getCodeFragmentType().getSimpleName());
//            sb.append(separator);
//
//            sb.append(trans.getToReplace().getCtCodeFragment().toString().length()+"");
//            sb.append(separator);
//            sb.append(trans.getReplaceBy().getCtCodeFragment().toString().length()+"");
//            sb.append(separator);
//
//            sb.append(trans.getToReplace().getSourceClass().getQualifiedName());
//            sb.append(separator);
//            sb.append(trans.getReplaceBy().getSourceClass().getQualifiedName());
//            sb.append(separator);
//
//            sb.append(trans.getToReplace().getSourcePackage().getQualifiedName());
//            sb.append(separator);
//            sb.append(trans.getReplaceBy().getSourcePackage().getQualifiedName());
//            sb.append(separator);
//
//            sb.append(trans.getToReplace().getInputContext().size()+"");
//            sb.append(separator);
//            sb.append(trans.getReplaceBy().getInputContext().size()+"");
//            sb.append(separator);
//
//            sb.append(trans.getToReplace().getInputContext().hasOnlyPrimitive()+"");
//            sb.append(separator);
//            sb.append(trans.getReplaceBy().getInputContext().hasOnlyPrimitive()+"");
//            sb.append(separator);
//
//            sb.append(trans.numberOfFailure()+"");
//            sb.append("\n");
//                bw.write(sb.toString());
//            }catch (Exception e) {}
//
//        }
//        bw.close();
    }

}
